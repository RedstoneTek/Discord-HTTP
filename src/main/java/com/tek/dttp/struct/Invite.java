package com.tek.dttp.struct;

public class Invite {
	
	private String code;
	private Guild guild;
	private Channel channel;
	private int approximate_presence_count;
	private int approximate_member_count;
	private User inviter;
	private int uses;
	private int max_uses;
	private int max_age;
	private boolean temporary;
	private String created_at;
	private boolean revoked;
	
	public String getCode() {
		return code;
	}
	
	public Guild getGuild() {
		return guild;
	}
	
	public Channel getChannel() {
		return channel;
	}
	
	public int getApproximatePresenceCount() {
		return approximate_presence_count;
	}
	
	public int getApproximateMemberCount() {
		return approximate_member_count;
	}
	
	public User getInviter() {
		return inviter;
	}
	
	public int getUses() {
		return uses;
	}
	
	public int getMaxUses() {
		return max_uses;
	}
	
	public int getMaxAge() {
		return max_age;
	}
	
	public boolean isTemporary() {
		return temporary;
	}
	
	public String getCreatedAt() {
		return created_at;
	}
	
	public boolean isRevoked() {
		return revoked;
	}
	
}
