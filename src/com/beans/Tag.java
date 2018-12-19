package com.beans;

import java.util.ArrayList;

public class Tag {
	
	private int id;
	private String title;
	private String urlname;
	private ArrayList<Integer> activite_id;

	
	public Tag(int id, String title, String urlname, ArrayList<Integer> activite_id) {
		this.id=id;
		this.title=title;
		this.urlname=urlname;
		this.activite_id=activite_id;
	}

	public int getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public String getUrlname() {
		return urlname;
	}


	public ArrayList<Integer> getActivite_id() {
		return activite_id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setUrlname(String urlname) {
		this.urlname = urlname;
	}


	public void setActivite_id(ArrayList<Integer> activite_id) {
		this.activite_id = activite_id;
	}
}
