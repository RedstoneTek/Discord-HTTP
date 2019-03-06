package com.tek.dttp.struct;

import java.util.List;

public class Member {
	
	private User user;
	private String nick;
	private List<String> roles;
	private String joined_at;
	private boolean deaf;
	private boolean mute;
	
	public User getUser() {
		return user;
	}
	
	public String getNick() {
		return nick;
	}
	
	public List<String> getRoles() {
		return roles;
	}
	
	public String getJoinedAt() {
		return joined_at;
	}
	
	public boolean isDeaf() {
		return deaf;
	}
	
	public boolean isMute() {
		return mute;
	}
	
}
