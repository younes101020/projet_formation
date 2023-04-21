package com.exemple.demo;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.exemple.demo.enums.TypeExpense;
import com.exemple.demo.repositories.ExpenseRepository;

@SpringBootApplication
public class CoursIntroBddSpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursIntroBddSpringJpaApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(ExpenseRepository compteRepository) {
		return args -> {
			
			/*
			compteRepository.save(new Compte(null,"BNP003F", 15000, new Date(), TypeCompte.PEL));
			compteRepository.save(new Compte(null,"BNP004F", 5000, new Date(), TypeCompte.CHEQUE));
			compteRepository.save(new Compte(null,"BNP005F", 3000, new Date(), TypeCompte.LIVRET_A));
			compteRepository.save(new Compte(null,"BNP006F", 1000, new Date(), TypeCompte.LIVRET_A));
			
			compteRepository.findAll().forEach(compte -> {
				System.out.println(compte.getNumeroCompte() + " " + compte.getType());
			});
			*/
		};
	}

}
