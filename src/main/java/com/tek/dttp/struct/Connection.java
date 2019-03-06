package com.tek.dttp.struct;

import java.util.List;

public class Connection {
	
	private String id;
	private String name;
	private String type;
	private boolean revoked;
	private List<Integration> integrations;
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public boolean isRevoked() {
		return revoked;
	}
	
	public List<Integration> getIntegrations() {
		return integrations;
	}
	
}
