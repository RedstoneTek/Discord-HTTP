package com.tek.dttp.adapter;

import java.io.IOException;
import java.util.Optional;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tek.dttp.enums.ChannelType;

public class ChannelTypeAdapter extends TypeAdapter<ChannelType> {

	@Override
	public void write(JsonWriter out, ChannelType value) throws IOException {
		out.value(value.getId());
	}

	@Override
	public ChannelType read(JsonReader in) throws IOException {
		Optional<ChannelType> channelTypeOpt = ChannelType.getChannelTypeById(in.nextInt());
		return channelTypeOpt.isPresent() ? channelTypeOpt.get() : null;
	}

}
