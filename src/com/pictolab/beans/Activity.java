package com.pictolab.beans;

import java.util.ArrayList;

public class Activity {
	
	private int id;
	private String title;
	private String summary;
	private String content;
	private String date;
	private ArrayList<String> tags;
	
	public Activity(int id, String title, String summary, String content, String date, ArrayList<String> tags) {
		this.id=id;
		this.title=title;
		this.summary=summary;
		this.content=content;
		this.date=date;	
		this.tags=tags;
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
	
	public ArrayList<String> getTags() {
		return tags;
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
	public void setTags(ArrayList<String> tags) {
		this.tags=tags;
	}

}
