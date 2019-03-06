package com.tek.dttp.struct.message;

import com.tek.dttp.enums.MessageActivityType;

public class MessageActivity {
	
	private MessageActivityType type;
	private String party_id;
	
	public MessageActivityType getType() {
		return type;
	}
	
	public String getPartyId() {
		return party_id;
	}
	
}
