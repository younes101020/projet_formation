package com.exemple.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.demo.entities.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long>{

}
