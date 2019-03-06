package com.tek.dttp.struct;

public class Role {
	
	private String id;
	private String name;
	private int color;
	private boolean hoist;
	private int position;
	private int permissions;
	private boolean managed;
	private boolean mentionable;
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getColor() {
		return color;
	}
	
	public boolean isHoist() {
		return hoist;
	}
	
	public int getPosition() {
		return position;
	}
	
	public int getPermissions() {
		return permissions;
	}
	
	public boolean isManaged() {
		return managed;
	}
	
	public boolean isMentionable() {
		return mentionable;
	}
	
}
