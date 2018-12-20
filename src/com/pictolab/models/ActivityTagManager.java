package com.pictolab.models;

import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;

public class ActivityTagManager {
	private Multimap<Integer, Integer> joins;

	public ActivityTagManager() {
		this.joins = MultimapBuilder.hashKeys().arrayListValues().build();
		
		
		this.joins.put(1, 1);
		this.joins.put(1, 2);
		this.joins.put(2, 1);
		
		
		this.joins.get(1);
	}

	public Multimap<Integer, Integer> getJoins() {
		return this.joins;
	}

}
