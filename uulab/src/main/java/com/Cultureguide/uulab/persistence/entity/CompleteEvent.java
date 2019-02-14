package com.Cultureguide.uulab.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Evenement complet")
@Entity
public class CompleteEvent {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;
	
	@Column(name="Nom")
	private String nom;
	
	@Column(name="Adresse")
	private String adresse;
	
	@Column(name="Date")
	private int date;
	
	@Column(name="Heure")
	private int heure;
	
	@Column(name="Catégorie")
	private String catégorie;
	
	@Column(name="Tag")
	private String tag;
	
	@Column(name="TagGroup")
	private String tagGroup;
	
	@Column(name="Visible")
	private boolean visible;

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

	public String getTagGroup() {
		return tagGroup;
	}

	public void setTagGroup(String tagGroup) {
		this.tagGroup = tagGroup;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public CompleteEvent save(CompleteEvent completeEvent) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object findByTag(String tag2) {
		// TODO Auto-generated method stub
		return null;
	}

}
