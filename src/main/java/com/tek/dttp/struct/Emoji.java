package com.tek.dttp.struct;

import java.util.List;

public class Emoji {
	
	private String id;
	private String name;
	private List<Role> roles;
	private User user;
	private boolean require_colons;
	private boolean managed;
	private boolean animated;
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Role> getRoles() {
		return roles;
	}
	
	public User getUser() {
		return user;
	}
	
	public boolean isRequireColons() {
		return require_colons;
	}
	
	public boolean isManaged() {
		return managed;
	}
	
	public boolean isAnimated() {
		return animated;
	}
	
}
