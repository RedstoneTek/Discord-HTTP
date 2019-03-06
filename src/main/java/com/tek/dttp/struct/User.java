package com.tek.dttp.struct;

public class User {
	
	private String id;
	private String username;
	private String discriminator;
	private String avatar;
	private boolean bot;
	private boolean mfa_enabled;
	private String locale;
	private boolean verified;
	private String email;
	private int flags;
	private int premium_type;
	
	public String getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getDiscriminator() {
		return discriminator;
	}
	
	public String getAvatar() {
		return avatar;
	}
	
	public boolean isBot() {
		return bot;
	}
	
	public boolean isMfaEnabled() {
		return mfa_enabled;
	}
	
	public String getLocale() {
		return locale;
	}
	
	public boolean isVerified() {
		return verified;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getFlags() {
		return flags;
	}
	
	public int getPremiumType() {
		return premium_type;
	}
	
}
