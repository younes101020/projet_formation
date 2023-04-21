package com.exemple.demo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private double amount;
	
	private String description;
	
	@ManyToMany(mappedBy = "expenses", fetch = FetchType.EAGER)
	private List<Participant> participants = new ArrayList<Participant>();
	
	@ManyToOne
	@JoinColumn(name="travel_id")
	private Travel travel;
	
	private Date createdAt;
	
	private Date updatedAt;
	
	private Date deletedAt;
	
	private Boolean isActive;
}
