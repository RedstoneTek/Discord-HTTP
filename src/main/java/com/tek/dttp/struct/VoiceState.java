package com.tek.dttp.struct;

public class VoiceState {
	
	private String guild_id;
	private String channel_id;
	private String user_id;
	private Member member;
	private String session_id;
	private boolean deaf;
	private boolean mute;
	private boolean self_deaf;
	private boolean self_mute;
	private boolean suppress;
	
	public String getGuildId() {
		return guild_id;
	}
	
	public String getChannelId() {
		return channel_id;
	}
	
	public String getUserId() {
		return user_id;
	}
	
	public Member getMember() {
		return member;
	}
	
	public String getSessionId() {
		return session_id;
	}
	
	public boolean isDeaf() {
		return deaf;
	}
	
	public boolean isMute() {
		return mute;
	}
	
	public boolean isSelfDeaf() {
		return self_deaf;
	}
	
	public boolean isSelfMute() {
		return self_mute;
	}
	
	public boolean isSuppress() {
		return suppress;
	}
	
}
