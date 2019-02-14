package com.Cultureguide.uulab.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="User")
@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;
	
	@Column(name="Nom")
	private String nom;
	
	@Column(name="Prenom")
	private String prenom;
	
	@Column(name="Identifiant")
	private String identifiant;
	
	@Column(name="MotDePasse")
	private String motDePasse;
	
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMotdepasse() {
		return motDePasse;
	}

	public void setMotdepasse(String motdePasse) {
		this.motDePasse = motdePasse;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	
}
