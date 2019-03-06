package com.tek.dttp.adapter;

import java.io.IOException;
import java.util.Optional;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tek.dttp.enums.VerificationLevel;

public class VerificationLevelAdapter extends TypeAdapter<VerificationLevel> {
	
	@Override
	public void write(JsonWriter out, VerificationLevel value) throws IOException {
		out.value(value.getId());
	}

	@Override
	public VerificationLevel read(JsonReader in) throws IOException {
		Optional<VerificationLevel> verificationLevelOpt = VerificationLevel.getVerificationLevelById(in.nextInt());
		return verificationLevelOpt.isPresent() ? verificationLevelOpt.get() : null;
	}
	
}
