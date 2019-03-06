package com.tek.dttp.struct;

import java.util.List;

import com.tek.dttp.struct.embed.EmbedAuthor;
import com.tek.dttp.struct.embed.EmbedField;
import com.tek.dttp.struct.embed.EmbedFooter;
import com.tek.dttp.struct.embed.EmbedImage;
import com.tek.dttp.struct.embed.EmbedProvider;
import com.tek.dttp.struct.embed.EmbedThumbnail;
import com.tek.dttp.struct.embed.EmbedVideo;

public class Embed {
	
	private String title;
	private String type;
	private String description;
	private String url;
	private String timestamp;
	private int color;
	private EmbedFooter footer;
	private EmbedImage image;
	private EmbedThumbnail thumbnail;
	private EmbedVideo video;
	private EmbedProvider provider;
	private EmbedAuthor author;
	private List<EmbedField> fields;
	
	public String getTitle() {
		return title;
	}
	
	public String getType() {
		return type;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	
	public int getColor() {
		return color;
	}
	
	public EmbedFooter getFooter() {
		return footer;
	}
	
	public EmbedImage getImage() {
		return image;
	}
	
	public EmbedThumbnail getThumbnail() {
		return thumbnail;
	}
	
	public EmbedVideo getVideo() {
		return video;
	}
	
	public EmbedProvider getProvider() {
		return provider;
	}
	
	public EmbedAuthor getAuthor() {
		return author;
	}
	
	public List<EmbedField> getFields() {
		return fields;
	}
	
}
