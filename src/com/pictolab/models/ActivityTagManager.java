package com.pictolab.models;

import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;

public class ActivityTagManager {
	private Multimap<Integer, Integer> joins;

	public ActivityTagManager() {
		this.joins = MultimapBuilder.hashKeys().arrayListValues().build();
		
		
		this.joins.put(1, 1);
		this.joins.put(1, 5);
		this.joins.put(1, 6);
		this.joins.put(1, 11);
		
		this.joins.put(2, 1);
		this.joins.put(2, 2);
		this.joins.put(2, 4);
		this.joins.put(2, 5);
		this.joins.put(2, 6);
		this.joins.put(2, 7);
		this.joins.put(2, 8);
		this.joins.put(2, 11);
		this.joins.put(2, 12);
		this.joins.put(2, 17);

		
		this.joins.put(3, 9);
		this.joins.put(3, 11);
		this.joins.put(3, 13);
		this.joins.put(3, 14);

		
		this.joins.put(4, 2);
		this.joins.put(4, 3);
		this.joins.put(4, 4);
		this.joins.put(4, 7);
		this.joins.put(4, 8);
		this.joins.put(4, 12);
		this.joins.put(4, 15);
		this.joins.put(4, 17);
		
		this.joins.put(5, 1);
		this.joins.put(5, 2);
		this.joins.put(5, 3);
		this.joins.put(5, 4);
		this.joins.put(5, 6);
		this.joins.put(5, 7);
		this.joins.put(5, 8);
		this.joins.put(5, 10);
		this.joins.put(5, 12);
		
		this.joins.put(6, 1);
		this.joins.put(6, 2);
		this.joins.put(6, 3);
		this.joins.put(6, 4);
		this.joins.put(6, 6);
		this.joins.put(6, 7);
		this.joins.put(6, 5);
		this.joins.put(6, 14);
		this.joins.put(6, 17);
		
		this.joins.put(8, 12);
		this.joins.put(8, 3);
		this.joins.put(8, 15);
		
		this.joins.put(9, 4);
		this.joins.put(9, 8);
		this.joins.put(9, 9);
		this.joins.put(9, 13);
		this.joins.put(9, 14);
		this.joins.put(9, 15);
		
		this.joins.put(10, 3);
		this.joins.put(10, 6);
		this.joins.put(10, 8);
		this.joins.put(10, 10);
		this.joins.put(10, 12);
		
		this.joins.put(11, 7);
		this.joins.put(11, 8);
		this.joins.put(11, 3);
		this.joins.put(11, 2);
		this.joins.put(11, 10);
		
		this.joins.put(12, 6);
		this.joins.put(12, 11);
		this.joins.put(12, 17);
		
		this.joins.put(13, 4);
		this.joins.put(13, 10);
		this.joins.put(13, 13);
		this.joins.put(13, 15);
		this.joins.put(13, 17);
		
		this.joins.put(14, 5);
		this.joins.put(14, 9);
		this.joins.put(14, 14);
		
		this.joins.put(15, 14);
		this.joins.put(15, 9);
		
		this.joins.put(16, 9);
		this.joins.put(16, 14);
		this.joins.put(16, 13);
		this.joins.put(16, 11);
		
		this.joins.put(17, 2);
		this.joins.put(17, 6);
		this.joins.put(17, 7);
		
		this.joins.put(18, 1);
		this.joins.put(18, 2);
		this.joins.put(18, 3);
		this.joins.put(18, 5);
		
		
	}

	public Multimap<Integer, Integer> getJoins() {
		return this.joins;
	}

}
