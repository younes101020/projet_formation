package com.exemple.demo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

public class Conseiller {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nom;
	private String prenom;
	@Column(unique = true)
	private String mail;
	private Date dateNaissance;
	@ManyToMany(mappedBy = "Clients", fetch = FetchType.EAGER)
	private List<Compte> comptes = new ArrayList<Compte>();
}
