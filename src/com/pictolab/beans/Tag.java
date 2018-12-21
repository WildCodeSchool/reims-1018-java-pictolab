package com.pictolab.beans;

public class Tag {
	
	private int id;
	private String title;
	private String urlName;

	
	public Tag(int id, String title, String urlName) {
		this.id=id;
		this.title=title;
		this.urlName=urlName;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getUrlName() {
		return urlName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}
}
