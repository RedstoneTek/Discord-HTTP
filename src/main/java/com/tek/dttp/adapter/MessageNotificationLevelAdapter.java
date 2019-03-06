package com.tek.dttp.adapter;

import java.io.IOException;
import java.util.Optional;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tek.dttp.enums.MessageNotificationLevel;

public class MessageNotificationLevelAdapter extends TypeAdapter<MessageNotificationLevel> {
	
	@Override
	public void write(JsonWriter out, MessageNotificationLevel value) throws IOException {
		out.value(value.getId());
	}

	@Override
	public MessageNotificationLevel read(JsonReader in) throws IOException {
		Optional<MessageNotificationLevel> messageNotificationLevelOpt = MessageNotificationLevel.getMessageNotificationLevelById(in.nextInt());
		return messageNotificationLevelOpt.isPresent() ? messageNotificationLevelOpt.get() : null;
	}
	
}
