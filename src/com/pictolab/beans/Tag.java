package com.pictolab.beans;

import java.util.ArrayList;

public class Tag {
	
	private int id;
	private String title;
	private String urlName;
	private ArrayList<Integer> activitiesIds;

	
	public Tag(int id, String title, String urlName, ArrayList<Integer> activitiesIds) {
		this.id=id;
		this.title=title;
		this.urlName=urlName;
		this.activitiesIds=activitiesIds;
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


	public ArrayList<Integer> getactivitiesIds() {
		return activitiesIds;
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


	public void setactivitiesIds(ArrayList<Integer> activitiesIds) {
		this.activitiesIds = activitiesIds;
	}
}
