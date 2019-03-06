package com.tek.dttp.struct;

public class VoiceRegion {
	
	private String id;
	private String name;
	private boolean vip;
	private boolean optimal;
	private boolean deprecated;
	private boolean custom;
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isVip() {
		return vip;
	}
	
	public boolean isOptimal() {
		return optimal;
	}
	
	public boolean isDeprecated() {
		return deprecated;
	}
	
	public boolean isCustom() {
		return custom;
	}
	
}
