package com.tek.dttp.enums;

import java.util.Optional;
import java.util.stream.Stream;

public enum OverwriteType {
	
	ROLE,
	MEMBER;
	
	public String getName() {
		return name().toLowerCase();
	}
	
	public static Optional<OverwriteType> getOverwriteTypeById(String name) {
		return Stream.of(OverwriteType.values()).filter(type -> type.getName().equals(name)).findFirst();
	}
}