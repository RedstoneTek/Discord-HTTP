package com.tek.dttp.enums;

import java.util.Optional;
import java.util.stream.Stream;

public enum MessageActivityType {
	
	JOIN(1),
	SPECTATE(2),
	LISTEN(3),
	JOIN_REQUEST(5);
	
	private int id;
	
	private MessageActivityType(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public static Optional<MessageActivityType> getMessageActivityTypeById(int id) {
		return Stream.of(MessageActivityType.values()).filter(type -> type.getId() == id).findFirst();
	}
}
