package com.tek.dttp;

import java.lang.reflect.Type;
import java.util.List;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.tek.dttp.exceptions.DiscordQueryException;
import com.tek.dttp.struct.Channel;
import com.tek.dttp.struct.Connection;
import com.tek.dttp.struct.Emoji;
import com.tek.dttp.struct.Guild;
import com.tek.dttp.struct.GuildBan;
import com.tek.dttp.struct.Integration;
import com.tek.dttp.struct.Invite;
import com.tek.dttp.struct.Member;
import com.tek.dttp.struct.Message;
import com.tek.dttp.struct.Role;
import com.tek.dttp.struct.User;
import com.tek.dttp.struct.VoiceRegion;
import com.tek.dttp.struct.Webhook;

public class SynchronousClient {
	
	private String token;
	private Gson gson;
	
	public SynchronousClient(String token, Gson gson) {
		this.token = token;
		this.gson = gson;
	}
	
	public Channel getChannel(String channelId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_CHANNEL, channelId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
			
		Channel channel = gson.fromJson(body.toString(), Channel.class);
		return channel;
	}
	
	public List<Message> getChannelMessages(String channelId, int limit) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_CHANNEL_MESSAGES, channelId))
					.header("Authorization", token)
					.queryString("limit", limit)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
		
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<Message>>(){}.getType();
		List<Message> messages = gson.fromJson(body, listType);
		return messages;
	}
	
	public List<User> getReactions(String channelId, String messageId, String emoji, int limit) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_REACTIONS, channelId, messageId, emoji))
					.header("Authorization", token)
					.queryString("limit", limit)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
		
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<User>>(){}.getType();
		List<User> users = gson.fromJson(body, listType);
		return users;
	}
	
	public List<Invite> getChannelInvites(String channelId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_CHANNEL_INVITES, channelId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
		
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<Invite>>(){}.getType();
		List<Invite> invites = gson.fromJson(body, listType);
		return invites;
	}
	
	public List<Message> getPinnedMessages(String channelId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_PINNED_MESSAGES, channelId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
		
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<Message>>(){}.getType();
		List<Message> messages = gson.fromJson(body, listType);
		return messages;
	}
	
	public List<Emoji> getGuildEmojis(String guildId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_GUILD_EMOJIS, guildId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
		
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<Emoji>>(){}.getType();
		List<Emoji> messages = gson.fromJson(body, listType);
		return messages;
	}

	public Emoji getGuildEmoji(String guildId, String emojiId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_GUILD_EMOJI, guildId, emojiId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
			
		Emoji emoji = gson.fromJson(body.toString(), Emoji.class);
		return emoji;
	}
	
	public Guild getGuild(String guildId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_GUILD, guildId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
			
		Guild guild = gson.fromJson(body.toString(), Guild.class);
		return guild;
	}
	
	public List<Channel> getGuildChannels(String guildId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_GUILD_CHANNELS, guildId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
		
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<Channel>>(){}.getType();
		List<Channel> channels = gson.fromJson(body, listType);
		return channels;
	}
	
	public Member getGuildMember(String guildId, String userId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_GUILD_MEMBER, guildId, userId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
			
		Member member = gson.fromJson(body.toString(), Member.class);
		return member;
	}
	
	public List<Member> getGuildMembers(String guildId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_GUILD_MEMBERS, guildId))
					.header("Authorization", token)
					.queryString("limit", 1000)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<Member>>(){}.getType();
		List<Member> members = gson.fromJson(body, listType);
		return members;
	}
	
	public List<GuildBan> getGuildBans(String guildId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_GUILD_BANS, guildId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<GuildBan>>(){}.getType();
		List<GuildBan> bans = gson.fromJson(body, listType);
		return bans;
	}
	
	public GuildBan getGuildBan(String guildId, String userId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_GUILD_BAN, guildId, userId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
			
		GuildBan ban = gson.fromJson(body.toString(), GuildBan.class);
		return ban;
	}
	
	public List<Role> getGuildRoles(String guildId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_GUILD_ROLES, guildId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<Role>>(){}.getType();
		List<Role> roles = gson.fromJson(body, listType);
		return roles;
	}
	
	public int getGuildPruneCount(String guildId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_GUILD_PRUNE_COUNT, guildId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		return new JSONObject(body).getInt("pruned");
	}
	
	public List<VoiceRegion> getGuildVoiceRegions(String guildId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_GUILD_VOICE_REGIONS, guildId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<VoiceRegion>>(){}.getType();
		List<VoiceRegion> voiceRegions = gson.fromJson(body, listType);
		return voiceRegions;
	}
	
	public List<Invite> getGuildInvites(String guildId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_GUILD_INVITES, guildId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<Invite>>(){}.getType();
		List<Invite> invites = gson.fromJson(body, listType);
		return invites;
	}
	
	public List<Integration> getGuildIntegrations(String guildId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_GUILD_INTEGRATIONS, guildId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<Integration>>(){}.getType();
		List<Integration> integrations = gson.fromJson(body, listType);
		return integrations;
	}
	
	public String getGuildVanityURL(String guildId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_GUILD_VANITY_URL, guildId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		return new JSONObject(body).getString("code");
	}
	
	public String getGuildWidgetImage(String guildId) {
		return String.format(Endpoints.GET_GUILD_WIDGET_IMAGE, guildId);
	}
	
	public Invite getInvite(String code) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_INVITE, code))
					.header("Authorization", token)
					.queryString("with_counts", true)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
			
		Invite invite = gson.fromJson(body.toString(), Invite.class);
		return invite;
	}
	
	public User getCurrentUser() throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(Endpoints.GET_CURRENT_USER)
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
			
		User user = gson.fromJson(body.toString(), User.class);
		return user;
	}
	
	public User getUser(String userId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_USER, userId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
			
		User user = gson.fromJson(body.toString(), User.class);
		return user;
	}
	
	public List<Guild> getCurrentUserGuilds() throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(Endpoints.GET_CURRENT_USER_GUILDS)
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
		
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<Guild>>(){}.getType();
		List<Guild> guilds = gson.fromJson(body, listType);
		return guilds;
	}
	
	public List<Channel> getUserDMS() throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(Endpoints.GET_USER_DMS)
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<Channel>>(){}.getType();
		List<Channel> dms = gson.fromJson(body, listType);
		return dms;
	}
	
	public List<Connection> getUserConnections() throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(Endpoints.GET_USER_CONNECTIONS)
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<Connection>>(){}.getType();
		List<Connection> connections = gson.fromJson(body, listType);
		return connections;
	}
	
	public List<VoiceRegion> getVoiceRegions() throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(Endpoints.GET_VOICE_REGIONS)
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<VoiceRegion>>(){}.getType();
		List<VoiceRegion> voiceRegions = gson.fromJson(body, listType);
		return voiceRegions;
	}
	
	public List<Webhook> getChannelWebhooks(String channelId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_CHANNEL_WEBHOOKS, channelId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<Webhook>>(){}.getType();
		List<Webhook> webhooks = gson.fromJson(body, listType);
		return webhooks;
	}
	
	public List<Webhook> getGuildWebhooks(String guildId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_GUILD_WEBHOOKS, guildId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
		
		Type listType = new TypeToken<List<Webhook>>(){}.getType();
		List<Webhook> webhooks = gson.fromJson(body, listType);
		return webhooks;
	}
	
	public Webhook getWebhook(String webhookId) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_WEBHOOK, webhookId))
					.header("Authorization", token)
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
			
		Webhook webhook = gson.fromJson(body.toString(), Webhook.class);
		return webhook;
	}
	
	public Webhook getWebhookWithToken(String webhookId, String webhookToken) throws DiscordQueryException {
		HttpResponse<String> response;
		try {
			response = Unirest.get(String.format(Endpoints.GET_WEBHOOK_WITH_TOKEN, webhookId, webhookToken))
					.asString();
		} catch (UnirestException e) {
			throw new DiscordQueryException(e.getMessage());
		}
			
		String body = response.getBody();
		DiscordHTTPClient.assertErrors(body);
			
		Webhook webhook = gson.fromJson(body.toString(), Webhook.class);
		return webhook;
	}
	
}
