package com.tek.dttp.struct.presence;

import com.tek.dttp.enums.ActivityType;

public class Activity {
	
	private String name;
	private ActivityType type;
	private String url;
	private ActivityTimestamps timestamps;
	private String application_id;
	private String details;
	private String state;
	private Party party;
	private Assets assets;
	private Secrets secrets;
	private boolean instance;
	private int flags;
	
	public String getName() {
		return name;
	}
	
	public ActivityType getType() {
		return type;
	}
	
	public String getUrl() {
		return url;
	}
	
	public ActivityTimestamps getTimestamps() {
		return timestamps;
	}
	
	public String getApplicationId() {
		return application_id;
	}
	
	public String getDetails() {
		return details;
	}
	
	public String getState() {
		return state;
	}
	
	public Party getParty() {
		return party;
	}
	
	public Assets getAssets() {
		return assets;
	}
	
	public Secrets getSecrets() {
		return secrets;
	}
	
	public boolean isInstance() {
		return instance;
	}
	
	public int getFlags() {
		return flags;
	}
	
}
