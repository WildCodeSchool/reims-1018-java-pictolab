package com.pictolab.models;

import java.util.ArrayList;

import com.pictolab.beans.Activity;
import com.pictolab.beans.Tag;

public class ActivityManager {
	private ArrayList<Activity> activities;
	private ArrayList<Activity> tagActivities;
	
	public ActivityManager(){
						
		this.activities= new ArrayList<Activity>();
	
		this.activities.add(new Activity(1, "Fablab", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"mardi et jeudi"));
		this.activities.add(new Activity(2, "Ateliers scientifiques", " Un atelier proposé par Benoît Grisonne", "oncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"mercredi"));
		this.activities.add(new Activity(3, "Théâtre et média", "Les ateliers sont proposés avec les collaborateurs de la compagnie In Vitro...", "Les ateliers sont proposés avec les collabora-\n" + 
				"teurs de la compagnie In Vitro (Théâtre, danse, \n" + 
				"vidéo, dramaturgie, création sonore)", "mercredi"));
		this.activities.add(new Activity(4, "Goûter numérique", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"mercredi"));
		this.activities.add(new Activity(5, "Maker senior", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"jeudi"));
		this.activities.add(new Activity(6, "Laboado", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"vendredi"));
		this.activities.add(new Activity(7, "Ateliers robotiques", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"samedi"));
		this.activities.add(new Activity(8, "Mercredis numériques", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"mercredi"));
		this.activities.add(new Activity(9, "Bar éphémère", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"mercredi"));
		this.activities.add(new Activity(10, "Rdv en Numérique", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"vendredi"));
		this.activities.add(new Activity(11, "Découvertes", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"samedi"));
		this.activities.add(new Activity(12, "Vacances digitales", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"vacances scolaires"));
		this.activities.add(new Activity(13, "Nuit numérique", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"16 mars 2019"));
		this.activities.add(new Activity(14, "Expositions", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"en permanences"));
		this.activities.add(new Activity(15, "Anniversaires numériques", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"samedi et tous les jours pendant les vacances scolaires"));
		this.activities.add(new Activity(16, "Contact", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"journée: mercredi et samedi, après-midi: mardi, jeudi et vendredi, pendant les vacances scolaires toute la journée"));
		this.activities.add(new Activity(17, "labomachine", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"mardi et jeudi soirs"));
	}
	
	
	public Activity getActivityById(int id) {
		for (var activity: this.activities) {
			if (activity.getId() == id) {
				return activity;
			}
		}
		return null;
	}
	

}
		
	
	

