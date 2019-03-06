package com.tek.dttp.struct;

public class Webhook {
	
	private String id;
	private String guild_id;
	private String channel_id;
	private User user;
	private String name;
	private String avatar;
	private String token;
	
	public String getId() {
		return id;
	}
	
	public String getGuildId() {
		return guild_id;
	}
	
	public String getChannelId() {
		return channel_id;
	}
	
	public User getUser() {
		return user;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAvatar() {
		return avatar;
	}
	
	public String getToken() {
		return token;
	}
	
}
