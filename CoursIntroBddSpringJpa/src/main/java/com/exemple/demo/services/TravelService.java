package com.exemple.demo.services;

import java.util.List;

import com.exemple.demo.entities.Travel;

public interface TravelService {
	
	List<Travel>getAllTravels();
	
	Travel save(Travel travel);
	
	public void delete(Travel traval);
	
	Travel update(Travel travel);

}
