package com.pictolab.models;

import java.util.ArrayList;

import com.pictolab.beans.Activity;
import com.pictolab.beans.Tag;

public class TagManager {
	private ArrayList<Tag> tags;

	public TagManager() {
		this.tags = new ArrayList<Tag>();
		
		this.tags.add(new Tag(1, "FabLab", "fablab"));
		this.tags.add(new Tag(2, "Activités manuelles", "manuel"));
		this.tags.add(new Tag(3, "Expositions", "expositions"));
		this.tags.add(new Tag(4, "Pour les enfants", "enfants"));
		this.tags.add(new Tag(5, "Tous les 8 du mois", "date_8"));
		this.tags.add(new Tag(6, "Expérimentations", "experimentations"));
		this.tags.add(new Tag(7, "Contact", "contact"));
		this.tags.add(new Tag(8, "Vacances digitales", "vacances"));
		this.tags.add(new Tag(9, "Manger et boire", "manger_boire"));
		this.tags.add(new Tag(10, "Activités intellectuelles", "intellectuel"));
		this.tags.add(new Tag(11, "Le matin", "matin"));
		this.tags.add(new Tag(12, "Labo machine", "labomachine"));
		this.tags.add(new Tag(13, "Activités numériques", "numerique"));
		this.tags.add(new Tag(14, "Pour les séniors", "seniors"));
		this.tags.add(new Tag(15, "Bar éphémère", "bar"));
		this.tags.add(new Tag(16, "Activités aléatoires", "aleatoire"));
		this.tags.add(new Tag(17, "Robotique", "robotique"));
		this.tags.add(new Tag(18, "Au sous-sol", "sous_sol"));
		
	}
	
	public ArrayList<Tag> getAllTags() {
		return this.tags;
	}
	public Tag getTagById(int id) {
		for (var tag: this.tags) {
			if (tag.getId() == id) {
				return tag;
			}
		}
		return null;
	}
	
}
