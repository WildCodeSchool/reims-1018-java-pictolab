package com.pictolab.beans;

import java.util.ArrayList;

public class Activity {
	
	private int id;
	private String title;
	private String summary;
	private String content;
	private String date;
	
	public Activity(int id, String title, String summary, String content, String date) {
		this.id=id;
		this.title=title;
		this.summary=summary;
		this.content=content;
		this.date=date;	
	
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public String getsummary() {
		return summary;
	}

	public String getContent() {
		return content;
	}

	public String getDate() {
		return date;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setsummary(String summary) {
		this.summary=summary;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
