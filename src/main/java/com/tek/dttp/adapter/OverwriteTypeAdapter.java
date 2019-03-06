package com.tek.dttp.adapter;

import java.io.IOException;
import java.util.Optional;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tek.dttp.enums.OverwriteType;

public class OverwriteTypeAdapter extends TypeAdapter<OverwriteType> {

	@Override
	public void write(JsonWriter out, OverwriteType value) throws IOException {
		out.value(value.getName());
	}

	@Override
	public OverwriteType read(JsonReader in) throws IOException {
		Optional<OverwriteType> overwriteTypeOpt = OverwriteType.getOverwriteTypeById(in.nextString());
		return overwriteTypeOpt.isPresent() ? overwriteTypeOpt.get() : null;
	}

}
