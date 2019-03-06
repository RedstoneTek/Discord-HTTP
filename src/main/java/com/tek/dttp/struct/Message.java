package com.tek.dttp.struct;

import java.util.List;

import com.tek.dttp.enums.MessageType;
import com.tek.dttp.struct.message.MessageActivity;
import com.tek.dttp.struct.message.MessageApplication;

public class Message {
	
	private String id;
	private String channel_id;
	private String guild_id;
	private User author;
	private Member member;
	private String content;
	private String timestamp;
	private String edited_timestamp;
	private boolean tts;
	private boolean mention_everyone;
	private List<User> mentions;
	private List<Role> mention_roles;
	private List<Attachment> attachments;
	private List<Embed> embeds;
	private List<Reaction> reactions;
	private String nonce;
	private boolean pinned;
	private String webhook_id;
	private MessageType type;
	private MessageActivity activity;
	private MessageApplication application;
	
	public String getId() {
		return id;
	}
	
	public String getChannelId() {
		return channel_id;
	}
	
	public String getGuildId() {
		return guild_id;
	}
	
	public User getAuthor() {
		return author;
	}
	
	public Member getMember() {
		return member;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	
	public String getEditedTimestamp() {
		return edited_timestamp;
	}
	
	public boolean isTTS() {
		return tts;
	}
	
	public boolean isMentionEveryone() {
		return mention_everyone;
	}
	
	public List<User> getMentions() {
		return mentions;
	}
	
	public List<Role> getMentionRoles() {
		return mention_roles;
	}
	
	public List<Attachment> getAttachments() {
		return attachments;
	}
	
	public List<Embed> getEmbeds() {
		return embeds;
	}
	
	public List<Reaction> getReactions() {
		return reactions;
	}
	
	public String getNonce() {
		return nonce;
	}
	
	public boolean isPinned() {
		return pinned;
	}
	
	public String getWebhookId() {
		return webhook_id;
	}
	
	public MessageType getType() {
		return type;
	}
	
	public MessageActivity getActivity() {
		return activity;
	}
	
	public MessageApplication getApplication() {
		return application;
	}
	
}
