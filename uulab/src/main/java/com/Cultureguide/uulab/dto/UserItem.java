package com.Cultureguide.uulab.dto;

import com.Cultureguide.uulab.persistence.entity.User;

public class UserItem {

	private Long id;
	private String nom;
	private String prenom;
	private String identifiant;
	private String motDePasse;
	
	public UserItem() {
	}

	public UserItem(User c) {
		this.setId(c.getId());
		this.setNom(c.getNom());
		this.setPrenom(c.getPrenom());
		this.setIdentifiant(c.getIdentifiant());
		this.setMotDePasse(c.getMotdepasse());

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

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}


	
		
	}

