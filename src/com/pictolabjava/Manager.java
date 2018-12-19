package com.pictolabjava;

import java.util.ArrayList;

import com.beans.Activite;
import com.beans.Tag;

public class Manager {
	private ArrayList<Activite> activiteArray;
	private ArrayList<Tag> tagArray;

	
	public Manager(){
	
	this.activiteArray= new ArrayList<Activite>();
	this.tagArray= new ArrayList<Tag>();
	this.activiteArray.add(new Activite(1, "Fablab", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"mardi et jeudi"));
	this.activiteArray.add(new Activite(2, "Ateliers scientifiques", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"mercredi"));
	this.activiteArray.add(new Activite(3, "Théâtre et média", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"mercredi"));
	this.activiteArray.add(new Activite(4, "Goûter numérique", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"mercredi"));
	this.activiteArray.add(new Activite(5, "Maker senior", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"jeudi"));
	this.activiteArray.add(new Activite(6, "Laboado", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"vendredi"));
	this.activiteArray.add(new Activite(7, "Ateliers robotiques", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"samedi"));
	this.activiteArray.add(new Activite(8, "Mercredis numériques", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"mercredi"));
	this.activiteArray.add(new Activite(9, "Bar éphémère", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"mercredi"));
	this.activiteArray.add(new Activite(10, "Rdv en Numérique", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"vendredi"));
	this.activiteArray.add(new Activite(11, "Découvertes", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"samedi"));
	this.activiteArray.add(new Activite(12, "Vacances numériques", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"vacances scolaires"));
	this.activiteArray.add(new Activite(13, "Nuit numérique", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"16 mars 2019"));
	this.activiteArray.add(new Activite(14, "Expositions", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"en permanences"));
	this.activiteArray.add(new Activite(15, "Anniversaires numériques", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"samedi et tous les jours pendant les vacances scolaires"));
	this.activiteArray.add(new Activite(16, "Contact", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"journée: mercredi et samedi, après-midi: mardi, jeudi et vendredi, pendant les vacances scolaires toute la journée"));
	this.activiteArray.add(new Activite(3, "artfabrique", "orem Elsass ipsum vielmols, und baeckeoffe", "orem Elsass ipsum vielmols, und baeckeoffe morbi varius lacus mamsell schneck rhoncus aliquam elementum Carola id, leo dolor kuglopf Heineken ac leo auctor, kartoffelsalad Chulien Christkindelsmärik yeuh. sagittis libero. vulputate turpis, knepfle Mauris amet s'guelt météor non DNA, placerat nullam sed schpeck Gal.", 
			"mardi et jeudi soirs"));
	}
	
}
		
	
	

