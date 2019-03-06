package com.tek.dttp.struct;

public class Integration {
	
	private String id;
	private String name;
	private String type;
	private boolean enabled;
	private boolean syncing;
	private String role_id;
	private int expire_behavior;
	private int expire_grace_period;
	private User user;
	private IntegrationAccount account;
	private String synced_at;
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public boolean isSyncing() {
		return syncing;
	}
	
	public String getRoleId() {
		return role_id;
	}
	
	public int getExpireBehavior() {
		return expire_behavior;
	}
	
	public int getExpireGracePeriod() {
		return expire_grace_period;
	}
	
	public User getUser() {
		return user;
	}
	
	public IntegrationAccount getAccount() {
		return account;
	}
	
	public String getSyncedAt() {
		return synced_at;
	}
	
}
