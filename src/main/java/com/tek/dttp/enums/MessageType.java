package com.tek.dttp.enums;

import java.util.Optional;
import java.util.stream.Stream;

public enum MessageType {
	
	DEFAULT(0),
	RECIPIENT_ADD(1),
	RECIPIENT_REMOVE(2),
	CALL(3),
	CHANNEL_NAME_CHANGE(4),
	CHANNEL_ICON_CHANGE(5),
	CHANNEL_PINNED_MESSAGE(6),
	GUILD_MEMBER_JOIN(7);
	
	private int id;
	
	private MessageType(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public static Optional<MessageType> getMessageTypeById(int id) {
		return Stream.of(MessageType.values()).filter(type -> type.getId() == id).findFirst();
	}
}
