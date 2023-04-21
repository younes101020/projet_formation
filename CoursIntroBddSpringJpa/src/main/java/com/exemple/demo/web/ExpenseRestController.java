package com.exemple.demo.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.demo.repositories.ExpenseRepository;

@RestController
public class ExpenseRestController {
	
	/*@Autowired
	private CompteRepository compteRepository;
	
	@GetMapping(path= "/comptes")
	public List<Compte>getAllcoomptes(){
		return compteRepository.findAll();
	}
	@GetMapping(path= "/comptes/{id}")
	public Compte getCompteById(@PathVariable(name="id") Long id){
		return compteRepository.findById(id).get();
	}
	*/
	
}
