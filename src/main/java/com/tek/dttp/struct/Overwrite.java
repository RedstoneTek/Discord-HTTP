package com.tek.dttp.struct;

import com.tek.dttp.enums.OverwriteType;

public class Overwrite {
	
	private String id;
	private OverwriteType type;
	private int allow;
	private int deny;
	
	public String getId() {
		return id;
	}

	public OverwriteType getType() {
		return type;
	}

	public int getAllow() {
		return allow;
	}

	public int getDeny() {
		return deny;
	}

}
