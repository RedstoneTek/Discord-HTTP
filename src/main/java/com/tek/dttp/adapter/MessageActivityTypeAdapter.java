package com.tek.dttp.adapter;

import java.io.IOException;
import java.util.Optional;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tek.dttp.enums.MessageActivityType;

public class MessageActivityTypeAdapter extends TypeAdapter<MessageActivityType> {

	@Override
	public void write(JsonWriter out, MessageActivityType value) throws IOException {
		out.value(value.getId());
	}

	@Override
	public MessageActivityType read(JsonReader in) throws IOException {
		Optional<MessageActivityType> messageActivityTypeOpt = MessageActivityType.getMessageActivityTypeById(in.nextInt());
		return messageActivityTypeOpt.isPresent() ? messageActivityTypeOpt.get() : null;
	}

}
