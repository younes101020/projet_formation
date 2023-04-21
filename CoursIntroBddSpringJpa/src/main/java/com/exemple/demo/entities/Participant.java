package com.exemple.demo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "participant")
@NoArgsConstructor
@AllArgsConstructor
public class Participant {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    @Column(nullable = false)
    private String name;
 
    @Column(nullable = false)
    private String email;
 
    @Column(nullable = false)
    private double contribution;
 
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Travel> travels = new ArrayList<Travel>();
    
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Expense> expenses = new ArrayList<Expense>(); 
    
    @ManyToOne
	@JoinColumn(name="user_id")
	private User user;
    
    

}
