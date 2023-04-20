package com.exemple.demo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.exemple.demo.enums.TypeCompte;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Compte {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String numeroCompte;
	private double solde;
	private Date dateCreation;
	@Enumerated(EnumType.STRING)
	private TypeCompte type;
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Client> Clients = new ArrayList<Client>();
}
