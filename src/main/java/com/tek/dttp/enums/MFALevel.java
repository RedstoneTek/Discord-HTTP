package com.tek.dttp.enums;

import java.util.Optional;
import java.util.stream.Stream;

public enum MFALevel {
	
	NONE(0),
	ELEVATED(1);
	
	private int id;
	
	private MFALevel(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public static Optional<MFALevel> getMFALevelById(int id) {
		return Stream.of(MFALevel.values()).filter(level -> level.getId() == id).findFirst();
	}
	
}
