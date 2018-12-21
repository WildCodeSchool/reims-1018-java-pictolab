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
		this.activities.add(new Activity(2, "Ateliers scientifiques", "Science,  expérimentation,  découverte, approche ludique et créative. Un atelier proposé par Benoît Grisonne", "Science,  expérimentation,  découverte, approche ludique et créative. Cette année, la matière et le vivant sont à l’honneur. Au programme: élaboration de jeux interactifs, de maquettes et d’expériences au fil des séances. Des sorties seront organisées: visite de laboratoire de recherche, expositions...", 
				"mercredi"));
		this.activities.add(new Activity(3, "Théâtre et média", "Aborder  les  techniques  spécifiques  au théâtre, dans une approche contemporaine ouverte aux nouvelles technologies. Les ateliers sont proposés avec les collaborateurs de la compagnie In Vitro...", "Aborder  les  techniques  spécifiques  au théâtre, dans une approche contemporaine ouverte aux nouvelles technologies. Au carrefour du théâtre, de la performance et des nouveaux médias, l’atelier proposera un travail sur les différentes techniques de jeu ainsi qu’un développement des moyens d’expression sur scène et à l’écran. La thématique de l'année pour les ateliers sera celle de la prochaine création de la compagnie: Les poupées autour du fétiche, du sublime, du double. Les ateliers sont proposés avec les collaborateurs de la compagnie In Vitro (Théâtre, danse, vidéo, dramaturgie, création sonore)", "mercredi"));
		this.activities.add(new Activity(4, "Goûter numérique", "Un  rendez-vous  pour  les  enfants  espiègles et curieux.", "Trois heures ludiques et créatives pour expérimenter et fabriquer avec divers outils numériques. Les plus jeunes développeront leur imagination dans une ambiance conviviale, un goûter est prévu. À noter, quelques sorties cinéma seront prévues en partenariat avec la bibliothèque municipale de Reims", 
				"mercredi"));
		this.activities.add(new Activity(5, "Maker senior", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"jeudi"));
		this.activities.add(new Activity(6, "Laboado", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"vendredi"));
		this.activities.add(new Activity(7, "Ateliers robotiques", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"samedi"));
		this.activities.add(new Activity(8, "Mercredis numériques", "Journée entière pour les enfants","Journée  entière  pour  les  enfants " + 
				"comprenant : le matin un atelier Scientifique ou Théâtre & Média, à midi Apportez un pique-nique pour que vos enfants restent avec notre super animateur! L’après-midi un goûter numérique","mercredi"));
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
		
	
	

