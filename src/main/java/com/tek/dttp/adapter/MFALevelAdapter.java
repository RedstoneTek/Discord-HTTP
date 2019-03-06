package com.tek.dttp.adapter;

import java.io.IOException;
import java.util.Optional;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tek.dttp.enums.MFALevel;

public class MFALevelAdapter extends TypeAdapter<MFALevel> {
	
	@Override
	public void write(JsonWriter out, MFALevel value) throws IOException {
		out.value(value.getId());
	}

	@Override
	public MFALevel read(JsonReader in) throws IOException {
		Optional<MFALevel> mfaLevelOpt = MFALevel.getMFALevelById(in.nextInt());
		return mfaLevelOpt.isPresent() ? mfaLevelOpt.get() : null;
	}
	
}
