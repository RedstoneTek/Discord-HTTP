package com.tek.dttp.adapter;

import java.io.IOException;
import java.util.Optional;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tek.dttp.enums.ActivityType;

public class ActivityTypeAdapter extends TypeAdapter<ActivityType> {

	@Override
	public void write(JsonWriter out, ActivityType value) throws IOException {
		out.value(value.getId());
	}

	@Override
	public ActivityType read(JsonReader in) throws IOException {
		Optional<ActivityType> activityTypeOpt = ActivityType.getActivityTypeById(in.nextInt());
		return activityTypeOpt.isPresent() ? activityTypeOpt.get() : null;
	}

}
