package com.pictolab.models;

import java.util.ArrayList;

/*************************************************************/
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
/*************************************************************/
import com.pictolab.beans.Activity;
import com.pictolab.beans.Tag;

public class ActivityManager {
	/*************************************************************/
	public Multimap<Integer, Integer> joins;
	/*************************************************************/
	private ArrayList<Activity> activities;
	private ArrayList<String> tags;
	private ArrayList<String> tags2;
	private ArrayList<Activity> tagActivities;
	
	public ActivityManager(){
		/*************************************************************/
		this.joins = MultimapBuilder.hashKeys().arrayListValues().build();
		
		
		this.joins.put(1, 1);
		this.joins.put(1, 2);
		this.joins.put(2, 1);
		
		
		this.joins.get(1);
		/*************************************************************/
		this.tagActivities=new ArrayList<Activity>();
		this.tags=new ArrayList<String>();
		this.tags.add("mental");
	
		this.tags2=new ArrayList<String>();
		this.tags2.add("manuel");
		
				
		this.activities= new ArrayList<Activity>();
	
		/*for(int i=1; i<=17; i++) {
			this.activities.add(new Activity(i, "Fablab", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
					"mardi et jeudi", tags));			
		}*/
		this.activities.add(new Activity(1, "Fablab", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"mardi et jeudi", tags));
		this.activities.add(new Activity(2, "Ateliers scientifiques", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"mercredi",tags2));
		this.activities.add(new Activity(3, "Théâtre et média", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"mercredi", tags));
		this.activities.add(new Activity(4, "Goûter numérique", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"mercredi", tags2));
		this.activities.add(new Activity(5, "Maker senior", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"jeudi", tags));
		this.activities.add(new Activity(6, "Laboado", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"vendredi", tags2));
		this.activities.add(new Activity(7, "Ateliers robotiques", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"samedi", tags));
		this.activities.add(new Activity(8, "Mercredis numériques", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"mercredi", tags));
		this.activities.add(new Activity(9, "Bar éphémère", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"mercredi", tags));
		this.activities.add(new Activity(10, "Rdv en Numérique", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"vendredi", tags));
		this.activities.add(new Activity(11, "Découvertes", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"samedi", tags));
		this.activities.add(new Activity(12, "Vacances digitales", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"vacances scolaires", tags));
		this.activities.add(new Activity(13, "Nuit numérique", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"16 mars 2019", tags));
		this.activities.add(new Activity(14, "Expositions", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"en permanences", tags));
		this.activities.add(new Activity(15, "Anniversaires numériques", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"samedi et tous les jours pendant les vacances scolaires", tags));
		this.activities.add(new Activity(16, "Contact", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"journée: mercredi et samedi, après-midi: mardi, jeudi et vendredi, pendant les vacances scolaires toute la journée", tags));
		this.activities.add(new Activity(17, "labomachine", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"mardi et jeudi soirs", tags));
	}
	
	
	
	public ArrayList<Activity> getActivityByTag(String urlName) {
		this.tagActivities.clear();
		for (var activity: this.activities) {
			for(var tag: activity.getTags()){							
				if (tag.equals(urlName)) {
					this.tagActivities.add(activity);
				}
			}
		}
		return this.tagActivities;
	}

}
		
	
	

