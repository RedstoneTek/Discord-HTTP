package com.tek.dttp.adapter;

import java.io.IOException;
import java.util.Optional;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tek.dttp.enums.ExplicitContentFilterLevel;

public class ExplicitContentFilterLevelAdapter extends TypeAdapter<ExplicitContentFilterLevel> {
	
	@Override
	public void write(JsonWriter out, ExplicitContentFilterLevel value) throws IOException {
		out.value(value.getId());
	}

	@Override
	public ExplicitContentFilterLevel read(JsonReader in) throws IOException {
		Optional<ExplicitContentFilterLevel> explicitContentFilterLevelOpt = ExplicitContentFilterLevel.getExplicitContentFilterLevelById(in.nextInt());
		return explicitContentFilterLevelOpt.isPresent() ? explicitContentFilterLevelOpt.get() : null;
	}
	
}
