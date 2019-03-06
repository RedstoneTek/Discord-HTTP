package com.tek.dttp.struct;

import java.util.List;

import com.tek.dttp.enums.ExplicitContentFilterLevel;
import com.tek.dttp.enums.MFALevel;
import com.tek.dttp.enums.MessageNotificationLevel;
import com.tek.dttp.enums.VerificationLevel;

public class Guild {
	
	private String id;
	private String name;
	private String icon;
	private String splash;
	private boolean owner;
	private String owner_id;
	private int permissions;
	private String region;
	private String afk_channel_id;
	private int afk_timeout;
	private boolean embed_enabled;
	private String embed_channel_id;
	private VerificationLevel verification_level;
	private MessageNotificationLevel default_message_notifications;
	private ExplicitContentFilterLevel explicit_content_filter;
	private List<Role> roles;
	private List<Emoji> emojis;
	private List<String> features;
	private MFALevel mfa_level;
	private String application_id;
	private boolean widget_enabled;
	private String widget_channel_id;
	private String system_channel_id;
	private String joined_at;
	private boolean large;
	private boolean unavailable;
	private int member_count;
	private List<VoiceState> voice_states;
	private List<Member> members;
	private List<Channel> channels;
	private List<Presence> presences;
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public String getSplash() {
		return splash;
	}
	
	public boolean isOwner() {
		return owner;
	}
	
	public String getOwnerId() {
		return owner_id;
	}
	
	public int getPermissions() {
		return permissions;
	}
	
	public String getRegion() {
		return region;
	}
	
	public String getAfkChannelId() {
		return afk_channel_id;
	}
	
	public int getAfkTimeout() {
		return afk_timeout;
	}
	
	public boolean isEmbedEnabled() {
		return embed_enabled;
	}
	
	public String getEmbedChannelId() {
		return embed_channel_id;
	}
	
	public VerificationLevel getVerificationLevel() {
		return verification_level;
	}
	
	public MessageNotificationLevel getDefaultMessageNotifications() {
		return default_message_notifications;
	}
	
	public ExplicitContentFilterLevel getExplicitContentFilter() {
		return explicit_content_filter;
	}
	
	public List<Role> getRoles() {
		return roles;
	}
	
	public List<Emoji> getEmojis() {
		return emojis;
	}
	
	public List<String> getFeatures() {
		return features;
	}
	
	public MFALevel getMFALevel() {
		return mfa_level;
	}
	
	public String getApplicationId() {
		return application_id;
	}
	
	public boolean isWidgetEnabled() {
		return widget_enabled;
	}
	
	public String getWidgetChannelId() {
		return widget_channel_id;
	}
	
	public String getSystemChannelId() {
		return system_channel_id;
	}
	
	public String getJoinedAt() {
		return joined_at;
	}
	
	public boolean isLarge() {
		return large;
	}
	
	public boolean isUnavailable() {
		return unavailable;
	}
	
	public int getMemberCount() {
		return member_count;
	}
	
	public List<VoiceState> getVoiceStates() {
		return voice_states;
	}
	
	public List<Member> getMembers() {
		return members;
	}
	
	public List<Channel> getChannels() {
		return channels;
	}
	
	public List<Presence> getPresences() {
		return presences;
	}
	
}
