package com.tek.dttp.enums;

import java.util.Optional;
import java.util.stream.Stream;

public enum ActivityType {
	
	GAME(0),
	STREAMING(1),
	LISTENING(2);
	
	private int id;
	
	private ActivityType(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public static Optional<ActivityType> getActivityTypeById(int id) {
		return Stream.of(ActivityType.values()).filter(type -> type.getId() == id).findFirst();
	}
}
