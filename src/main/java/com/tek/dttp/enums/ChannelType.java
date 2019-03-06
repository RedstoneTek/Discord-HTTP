package com.tek.dttp.enums;

import java.util.Optional;
import java.util.stream.Stream;

public enum ChannelType {
	
	GUILD_TEXT(0),
	DM(1),
	GUILD_VOICE(2),
	GROUP_DM(3),
	GUILD_CATEGORY(4);
	
	private int id;
	
	private ChannelType(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public static Optional<ChannelType> getChannelTypeById(int id) {
		return Stream.of(ChannelType.values()).filter(type -> type.getId() == id).findFirst();
	}
}
