package com.tek.dttp;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tek.dttp.adapter.ActivityTypeAdapter;
import com.tek.dttp.adapter.ChannelTypeAdapter;
import com.tek.dttp.adapter.ExplicitContentFilterLevelAdapter;
import com.tek.dttp.adapter.MFALevelAdapter;
import com.tek.dttp.adapter.MessageActivityTypeAdapter;
import com.tek.dttp.adapter.MessageNotificationLevelAdapter;
import com.tek.dttp.adapter.MessageTypeAdapter;
import com.tek.dttp.adapter.OverwriteTypeAdapter;
import com.tek.dttp.adapter.VerificationLevelAdapter;
import com.tek.dttp.enums.ActivityType;
import com.tek.dttp.enums.ChannelType;
import com.tek.dttp.enums.ExplicitContentFilterLevel;
import com.tek.dttp.enums.MFALevel;
import com.tek.dttp.enums.MessageActivityType;
import com.tek.dttp.enums.MessageNotificationLevel;
import com.tek.dttp.enums.MessageType;
import com.tek.dttp.enums.OverwriteType;
import com.tek.dttp.enums.VerificationLevel;
import com.tek.dttp.exceptions.DiscordQueryException;

public class DiscordHTTPClient {
	
	private Gson gson;
	private SynchronousClient syncClient;
	
	public DiscordHTTPClient() {
		this("NO_TOKEN");
	}
	
	public DiscordHTTPClient(String token) {
		GsonBuilder builder = new GsonBuilder();
		builder.registerTypeAdapter(ChannelType.class, new ChannelTypeAdapter());
		builder.registerTypeAdapter(OverwriteType.class, new OverwriteTypeAdapter());
		builder.registerTypeAdapter(MessageType.class, new MessageTypeAdapter());
		builder.registerTypeAdapter(MessageActivityType.class, new MessageActivityTypeAdapter());
		builder.registerTypeAdapter(VerificationLevel.class, new VerificationLevelAdapter());
		builder.registerTypeAdapter(MessageNotificationLevel.class, new MessageNotificationLevelAdapter());
		builder.registerTypeAdapter(ExplicitContentFilterLevel.class, new ExplicitContentFilterLevelAdapter());
		builder.registerTypeAdapter(MFALevel.class, new MFALevelAdapter());
		builder.registerTypeAdapter(ActivityType.class, new ActivityTypeAdapter());
		this.gson = builder.create();
		
		this.syncClient = new SynchronousClient(token, gson);
	}
	
	public static void assertErrors(String body) throws DiscordQueryException {
		JSONObject json;
		try{
			json = new JSONObject(body);
		} catch(JSONException e) {
			return;
		}
		
		if(json.has("code") && json.has("message")) throw new DiscordQueryException(json.getString("message"));
	}
	
	public SynchronousClient getSyncClient() {
		return syncClient;
	}
	
}
