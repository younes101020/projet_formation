package com.exemple.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.demo.entities.Travel;

public interface TravelRepository extends JpaRepository<Travel, Long>{

}
