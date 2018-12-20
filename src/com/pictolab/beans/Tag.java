package com.pictolab.beans;

import java.util.ArrayList;

public class Tag {
	
	private int id;
	private String title;
	private String urlName;
	private ArrayList<Integer> activities;

	
	public Tag(int id, String title, String urlName, ArrayList<Integer> activities) {
		this.id=id;
		this.title=title;
		this.urlName=urlName;
		this.activities=activities;
	}

	public int getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public String geturlName() {
		return urlName;
	}


	public ArrayList<Integer> getactivities() {
		return activities;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void seturlName(String urlName) {
		this.urlName = urlName;
	}


	public void setactivities(ArrayList<Integer> activities) {
		this.activities = activities;
	}
}
