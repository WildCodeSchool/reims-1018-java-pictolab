package com.beans;

public class Activite {
	
	private int id;
	private String title;
	private String resume;
	private String content;
	private String date;
	
	public Activite(int id, String title, String resume, String content, String date) {
		this.id=id;
		this.title=title;
		this.resume=resume;
		this.content=content;
		this.date=date;		
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public String getResume() {
		return resume;
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
	
	public void setResume(String resume) {
		this.resume=resume;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
