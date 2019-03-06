package com.tek.dttp.adapter;

import java.io.IOException;
import java.util.Optional;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tek.dttp.enums.MessageType;

public class MessageTypeAdapter extends TypeAdapter<MessageType> {

	@Override
	public void write(JsonWriter out, MessageType value) throws IOException {
		out.value(value.getId());
	}

	@Override
	public MessageType read(JsonReader in) throws IOException {
		Optional<MessageType> messageTypeOpt = MessageType.getMessageTypeById(in.nextInt());
		return messageTypeOpt.isPresent() ? messageTypeOpt.get() : null;
	}

}
