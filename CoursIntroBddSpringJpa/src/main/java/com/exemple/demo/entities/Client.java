package com.exemple.demo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
	
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
