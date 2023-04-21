package com.exemple.demo.services;

import java.util.List;

import com.exemple.demo.entities.Expense;
import com.exemple.demo.entities.Participant;
import com.exemple.demo.entities.Travel;

public interface ExpenseService {
	Expense save(Expense client);
	void delete(Expense expense);
	void archive(Expense expense);
	List<Expense> findAll();
	List<Expense> findByIsActive(boolean isactive);
	List<Expense> findByTravel(Travel travel);
	List<Expense> findByParticipant(Participant participant);
	List<Expense> findByParticpantAndByTravel(Participant participant, Travel travel);	
}
