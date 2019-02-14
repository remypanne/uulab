package com.Cultureguide.uulab.dto;

import com.Cultureguide.uulab.persistence.entity.CompleteEvent;

public class CompleteEventItem {

	private Long id;
	private String nom;
	private String adresse;
	private int date;
	private int heure;
	private String catégorie;
	private String tag;
	
	public CompleteEventItem() {
	}
	
	public CompleteEventItem(CompleteEvent c) {
		this.setId(c.getId());
		this.setNom(c.getNom());
		this.setAdresse(c.getAdresse());
		this.setDate(c.getDate());
		this.setHeure(c.getHeure());
		this.setCatégorie(c.getCatégorie());
		this.setTag(c.getTag());
		
}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public String getCatégorie() {
		return catégorie;
	}

	public void setCatégorie(String catégorie) {
		this.catégorie = catégorie;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
}
