package com.tek.dttp.struct;

import java.util.List;

import com.tek.dttp.enums.ChannelType;

public class Channel {
	
	private String id;
	private ChannelType type;
	private String guild_id;
	private int position;
	private List<Overwrite> permission_overwrites;
	private String name;
	private String topic;
	private boolean nsfw;
	private String last_message_id;
	private int bitrate;
	private int user_limit;
	private int rate_limit_per_user;
	private List<User> recipients;
	private String icon;
	private String owner_id;
	private String application_id;
	private String parent_id;
	private String last_pin_timestamp;
	
	public String getId() {
		return id;
	}

	public ChannelType getType() {
		return type;
	}

	public String getGuildId() {
		return guild_id;
	}

	public int getPosition() {
		return position;
	}

	public List<Overwrite> getPermissionOverwrites() {
		return permission_overwrites;
	}

	public String getName() {
		return name;
	}

	public String getTopic() {
		return topic;
	}

	public boolean isNsfw() {
		return nsfw;
	}

	public String getLastMessageId() {
		return last_message_id;
	}

	public int getBitrate() {
		return bitrate;
	}

	public int getUserLimit() {
		return user_limit;
	}

	public int getRateLimitPerUser() {
		return rate_limit_per_user;
	}

	public List<User> getRecipients() {
		return recipients;
	}

	public String getIcon() {
		return icon;
	}

	public String getOwnerId() {
		return owner_id;
	}

	public String getApplicationId() {
		return application_id;
	}

	public String getParentId() {
		return parent_id;
	}

	public String getLastPinTimestamp() {
		return last_pin_timestamp;
	}
	
}
