package com.tek.dttp.enums;

import java.util.Optional;
import java.util.stream.Stream;

public enum ExplicitContentFilterLevel {
	
	DISABLED(0),
	MEMBERS_WITHOUT_ROLES(1),
	ALL_MEMBERS(2);
	
	private int id;
	
	private ExplicitContentFilterLevel(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public static Optional<ExplicitContentFilterLevel> getExplicitContentFilterLevelById(int id) {
		return Stream.of(ExplicitContentFilterLevel.values()).filter(level -> level.getId() == id).findFirst();
	}
	
}
