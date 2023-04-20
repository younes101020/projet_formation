package com.exemple.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.exemple.demo.entities.Expense;

@RepositoryRestResource
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
//	@RestResource(path = "/byType")
//	List<Compte> findByType(@Param(value="type") TypeCompte typeCompte);
}
