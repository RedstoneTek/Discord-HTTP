package com.tek.dttp;

public class Endpoints {
	
	public static final String API_ENDPOINT = "https://discordapp.com/api";
	public static final String GET_CHANNEL = API_ENDPOINT + "/channels/%s";
	public static final String GET_CHANNEL_MESSAGES = API_ENDPOINT + "/channels/%s/messages";
	public static final String GET_REACTIONS = API_ENDPOINT + "/channels/%s/messages/%s/reactions/%s";
	public static final String GET_CHANNEL_INVITES = API_ENDPOINT + "/channels/%s/invites";
	public static final String GET_PINNED_MESSAGES = API_ENDPOINT + "/channels/%s/pins";
	public static final String GET_GUILD_EMOJIS = API_ENDPOINT + "/guilds/%s/emojis";
	public static final String GET_GUILD_EMOJI = API_ENDPOINT + "/guilds/%s/emojis/%s";
	public static final String GET_GUILD = API_ENDPOINT + "/guilds/%s";
	public static final String GET_GUILD_CHANNELS = API_ENDPOINT + "/guilds/%s/channels";
	public static final String GET_GUILD_MEMBER = API_ENDPOINT + "/guilds/%s/members/%s";
	public static final String GET_GUILD_MEMBERS = API_ENDPOINT + "/guilds/%s/members";
	public static final String GET_GUILD_BANS = API_ENDPOINT + "/guilds/%s/bans";
	public static final String GET_GUILD_BAN = API_ENDPOINT + "/guilds/%s/bans/%s";
	public static final String GET_GUILD_ROLES = API_ENDPOINT + "/guilds/%s/roles";
	public static final String GET_GUILD_PRUNE_COUNT = API_ENDPOINT + "/guilds/%s/prune";
	public static final String GET_GUILD_VOICE_REGIONS = API_ENDPOINT + "/guilds/%s/regions";
	public static final String GET_GUILD_INVITES = API_ENDPOINT + "/guilds/%s/invites";
	public static final String GET_GUILD_INTEGRATIONS = API_ENDPOINT + "/guilds/%s/integrations";
	public static final String GET_GUILD_VANITY_URL = API_ENDPOINT + "/guilds/%s/vanity-url";
	public static final String GET_GUILD_WIDGET_IMAGE = API_ENDPOINT + "/guilds/%s/widget.png";
	public static final String GET_INVITE = API_ENDPOINT + "/invites/%s";
	public static final String GET_CURRENT_USER = API_ENDPOINT + "/users/@me";
	public static final String GET_USER = API_ENDPOINT + "/users/%s";
	public static final String GET_CURRENT_USER_GUILDS = API_ENDPOINT + "/users/@me/guilds";
	public static final String GET_USER_DMS = API_ENDPOINT + "/users/@me/channels";
	public static final String GET_USER_CONNECTIONS = API_ENDPOINT + "/users/@me/connections";
	public static final String GET_VOICE_REGIONS = API_ENDPOINT + "/voice/regions";
	public static final String GET_CHANNEL_WEBHOOKS = API_ENDPOINT + "/channels/%s/webhooks";
	public static final String GET_GUILD_WEBHOOKS = API_ENDPOINT + "/guilds/%s/webhooks";
	public static final String GET_WEBHOOK = API_ENDPOINT + "/webhooks/%s";
	public static final String GET_WEBHOOK_WITH_TOKEN = API_ENDPOINT + "/webhooks/%s/%s";
	
}
