package com.exemple.demo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Travel {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Date startedAt;
	private Date endedAt;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	private boolean isActive;
	@ManyToMany(mappedBy = "travels", fetch = FetchType.EAGER)
	private List<Participant> participants = new ArrayList<Participant>();
	
	@OneToMany(mappedBy = "travel", cascade = CascadeType.ALL)
	private List<Expense> expenses = new ArrayList<Expense>();
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
}
