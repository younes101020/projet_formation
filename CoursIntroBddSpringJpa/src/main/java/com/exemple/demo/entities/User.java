package com.exemple.demo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String firstname;
	private String password;
	@Column(unique = true)
	private String mail;
	
	@OneToMany(mappedBy = "travel", cascade = CascadeType.ALL)
	private List<Expense> expenses = new ArrayList<Expense>();
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<User> users = new ArrayList<User>();
	
}
