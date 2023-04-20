package com.exemple.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.exemple.demo.entities.Compte;
import com.exemple.demo.enums.TypeCompte;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte, Long> {
	@RestResource(path = "/byType")
	List<Compte> findByType(@Param(value="type") TypeCompte typeCompte);
}
