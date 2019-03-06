package com.tek.dttp.struct;

import java.util.List;

import com.tek.dttp.struct.presence.Activity;

public class Presence {
	
	private User user;
	private List<String> roles;
	private Activity game;
	private String guild_id;
	private String status;
	private List<Activity> activities;
	
	public User getUser() {
		return user;
	}
	
	public List<String> getRoles() {
		return roles;
	}
	
	public Activity getGame() {
		return game;
	}
	
	public String getGuildId() {
		return guild_id;
	}
	
	public String getStatus() {
		return status;
	}
	
	public List<Activity> getActivities() {
		return activities;
	}
	
}
