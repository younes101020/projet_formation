package com.exemple.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.demo.entities.Travel;
import com.exemple.demo.repositories.TravelRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TravelServiceImpl  implements TravelService {
	
	@Autowired
	private TravelRepository travelRepository;
		
	public List<Travel> getAllTravels() {
		return travelRepository.findAll();
	}

	@Override
	public Travel save(Travel travel) {
		// TODO Auto-generated method stub
		return travelRepository.save(travel);
	}
	
	@Override
	public void delete(Travel travel) {
		travelRepository.delete(travel);
	}
	
	@Override
	public Travel update(Travel travel) {
		 Optional<Travel> existingTravel = travelRepository.findById((long) travel.getId());
	        if (existingTravel.isPresent()) {
	            Travel updatedTravel = existingTravel.get();
	            updatedTravel.setName(travel.getName());
	            updatedTravel.setStartedAt(travel.getStartedAt());
	            updatedTravel.setEndedAt(travel.getEndedAt());
	            updatedTravel.setParticipants(travel.getParticipants());
	            updatedTravel.setExpenses(travel.getExpenses());
	            updatedTravel.setUser(travel.getUser());
	            return travelRepository.save(updatedTravel);
	        } else {
	            throw new EntityNotFoundException("le voyage n'a pas été trouver" + travel.getId());
	        }
	}
	
}
