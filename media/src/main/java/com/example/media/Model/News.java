package com.example.media.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class News {
	
	@Id
	private ObjectId id;
	public String getId() {
		return id.toHexString();
	}
	public void setId(ObjectId id) {
		this.id = id;
	}

	private String title;
	private String description;
	private String story;
	private int type;
	private String imageUrl;
	private String published;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	
	@Override
	public String toString() {
		return "News [title=" + title + ", description=" + description + ", story=" + story + ", type=" + type
				+ ", imageUrl=" + imageUrl + ", published=" + published + "]";
	}
		  
}
