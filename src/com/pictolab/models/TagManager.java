package com.pictolab.models;

import java.util.ArrayList;

import com.pictolab.beans.Tag;

public class TagManager {
	private ArrayList<Integer> activities;
	private ArrayList<Tag> tags;

	public TagManager() {
		this.tags = new ArrayList<Tag>();
		this.activities = new ArrayList<Integer>();
		
		for(int i=1; i<=3; i++) {
			this.activities.add(i);
		}

		for(int j = 1; j <= 17; j++) {
			this.tags.add(new Tag(j, "Manuel", "activite_manuelle", activities));			
		}
	}
	
	public ArrayList<Tag> getAllTags() {
		return this.tags;
	}
}
