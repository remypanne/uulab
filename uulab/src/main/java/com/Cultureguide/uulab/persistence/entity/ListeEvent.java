package com.Cultureguide.uulab.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Liste d'événements")
@Entity
public class ListeEvent {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;
	
	@Column(name="Nom")
	private String nom;
	
	@Column(name="Catégorie")
	private String catégorie;
	
	@Column(name="Description")
	private String description;
	
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

	public String getCatégorie() {
		return catégorie;
	}

	public void setCatégorie(String catégorie) {
		this.catégorie = catégorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	
}
