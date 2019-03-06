package com.tek.dttp.enums;

import java.util.Optional;
import java.util.stream.Stream;

public enum MessageNotificationLevel {
	
	ALL_MESSAGES(0),
	ONLY_MENTIONS(1);
	
	private int id;
	
	private MessageNotificationLevel(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public static Optional<MessageNotificationLevel> getMessageNotificationLevelById(int id) {
		return Stream.of(MessageNotificationLevel.values()).filter(level -> level.getId() == id).findFirst();
	}
	
}
