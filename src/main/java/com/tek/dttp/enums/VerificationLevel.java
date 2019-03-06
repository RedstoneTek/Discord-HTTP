package com.tek.dttp.enums;

import java.util.Optional;
import java.util.stream.Stream;

public enum VerificationLevel {
	
	NONE(0),
	LOW(1),
	MEDIUM(2),
	HIGH(3),
	VERY_HIGH(4);
	
	private int id;
	
	private VerificationLevel(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public static Optional<VerificationLevel> getVerificationLevelById(int id) {
		return Stream.of(VerificationLevel.values()).filter(level -> level.getId() == id).findFirst();
	}
	
}
