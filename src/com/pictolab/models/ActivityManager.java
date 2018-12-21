package com.pictolab.models;

import java.util.ArrayList;

import com.pictolab.beans.Activity;
import com.pictolab.beans.Tag;

public class ActivityManager {
	private ArrayList<Activity> activities;
	private ArrayList<Activity> tagActivities;
	
	public ActivityManager(){
						
		this.activities= new ArrayList<Activity>();
	
		this.activities.add(new Activity(1, "Fablab", "Venez développer vos projets personnels ou participer à des formations et ateliers!", " Artfabrique est un espace de création et de construction dont le but est de permettre au plus grand nombre de s’initier ou de se perfectionner à la création assistée par ordinateur : imprimante 3D, découpe laser, plotter de découpe, matériel de bricolage traditionnel... Venez développer vos projets personnels ou participer à des formations et ateliers!", 
				"mardi et jeudi"));
		this.activities.add(new Activity(2, "Ateliers scientifiques", "Science,  expérimentation,  découverte, approche ludique et créative. Un atelier proposé par Benoît Grisonne", "Science,  expérimentation,  découverte, approche ludique et créative. Cette année, la matière et le vivant sont à l’honneur. Au programme: élaboration de jeux interactifs, de maquettes et d’expériences au fil des séances. Des sorties seront organisées: visite de laboratoire de recherche, expositions...", 
				"mercredi"));
		this.activities.add(new Activity(3, "Théâtre et média", "Aborder  les  techniques  spécifiques  au théâtre, dans une approche contemporaine ouverte aux nouvelles technologies.", "Aborder  les  techniques  spécifiques  au théâtre, dans une approche contemporaine ouverte aux nouvelles technologies. Au carrefour du théâtre, de la performance et des nouveaux médias, l’atelier proposera un travail sur les différentes techniques de jeu ainsi qu’un développement des moyens d’expression sur scène et à l’écran. La thématique de l'année pour les ateliers sera celle de la prochaine création de la compagnie: Les poupées autour du fétiche, du sublime, du double. Les ateliers sont proposés avec les collaborateurs de la compagnie In Vitro (Théâtre, danse, vidéo, dramaturgie, création sonore). Les ateliers sont proposés avec les collaborateurs de la compagnie In Vitro...", "mercredi"));
		this.activities.add(new Activity(4, "Goûter numérique", "Un  rendez-vous  pour  les  enfants  espiègles et curieux.", "Trois heures ludiques et créatives pour expérimenter et fabriquer avec divers outils numériques. Les plus jeunes développeront leur imagination dans une ambiance conviviale, un goûter est prévu. À noter, quelques sorties cinéma seront prévues en partenariat avec la bibliothèque municipale de Reims", 
				"mercredi"));
		this.activities.add(new Activity(5, "Maker senior", "Échanges et bidouillages", "Échanges et bidouillages autour des outils numériques, un rendez-vous privilégié pour se familiariser avec ces machines.", 
				"jeudi"));
		this.activities.add(new Activity(6, "Laboado", "L’immersion virtuelle t’intéresse ?", "L’immersion virtuelle t’intéresse ? Saint-Ex possède 2 HTC Vive pour tester et créer de la réalité augmentée dans notre labomachine.", 
				"vendredi"));
		this.activities.add(new Activity(7, "Ateliers robotiques", "Le monde robotique, les engrenages, les mouvements programmés, les Lego Mindstorm ou les EV3 n’auront plus de secret pour vos enfants!", "Le monde robotique, les engrenages, les mouvements programmés, les Lego Mindstorm ou les EV3 n’auront plus de secret pour vos enfants! Ils pourront construire assembler et créer des robots de toutes pièces. Une attention particulière sera portée cette année sur les robots dans l'univers du cinéma et la création de scènes animées. Un atelier proposé par Benoît Grisonne", 
				"samedi"));
		this.activities.add(new Activity(8, "Mercredis numériques", "Journée entière pour les enfants","Journée  entière  pour  les  enfants comprenant : le matin un atelier Scientifique ou Théâtre & Média, à midi Apportez un pique-nique pour que vos enfants restent avec notre super animateur! L’après-midi un goûter numérique","mercredi"));
		this.activities.add(new Activity(9, "Bar éphémère", "MISE EN ABYSSE • SYLVAIN RAMOLET", "MISE EN ABYSSE • SYLVAIN RAMOLET. 'La structure éphémère a été conçue autour de l’idée que m’inspire le monde numérique : vaste, insondable, abyssal, tel l’espace. A son échelle, cette base lunaire et ses satellites, blancs et fragmentés, feront évoluer leur environnement en fonction des déplacements des visiteurs. Ils nous emmèneront quelque part, à travers une abysse bleutée, pour effectuer une plongée lumineuse dans ce microcosme numérique.", 
				"mercredi"));
		this.activities.add(new Activity(10, "Rdv en Numérique", "Un temps d'échange et de découverte pour les professionnels et bénévoles associatifs autour de thématiques en lien avec les outils numériques.", "Un temps d'échange et de découverte pour les professionnels et bénévoles associatifs autour de thématiques en lien avec les outils numériques au sein de la vie associative. Experts et praticiens animeront ces RDV avec au programme : Facebook et ses méandres, Musiques Libres et activités associatives, Le numérique alternatif, réunion dynamique avec l'outil numérique BeeKast, Outils collaboratifs Libres...", 
				"vendredi"));
		this.activities.add(new Activity(11, "Découvertes", "4h pour bidouiller et s’initier à différentes pratiques et techniques dans le labomachine et artfabrique.", "4h pour bidouiller et s’initier à différentes pratiques et techniques dans le labomachine et artfabrique (initiation à la modélisation et à l’animation, créer une scène de réalité virtuelle avec Unity...)","samedi"));
		this.activities.add(new Activity(12, "Vacances digitales", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"vacances scolaires"));
		this.activities.add(new Activity(13, "Nuit numérique", "musique, installations interactives, bar éphémère: retrouvez le programme complet courant février sur nos réseaux", "musique, installations interactives, bar éphémère: retrouvez le programme complet courant février sur nos réseaux.", 
				"16 mars 2019"));
		this.activities.add(new Activity(14, "Expositions", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
				"en permanences"));
		this.activities.add(new Activity(15, "Anniversaires numériques", "Offrez à vos enfants un goûter d’anniversaire magique grâce à nos outils numériques.", "Offrez à vos enfants un goûter d’anniversaire magique grâce à nos outils numériques et surtout très ludiques. Chasse au trésor en réalité augmentée ou immersion virtuelle avec l'HTC vive... les petits seront ravis ", 
				"samedi et tous les jours pendant les vacances scolaires"));
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
		
	
	

