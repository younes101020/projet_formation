package com.exemple.demo.service;

import com.exemple.demo.entities.Expense;

public interface BudgetService {
	// TRAVEL
	Travel saveTravel(Travel travel);
	
	// PARTICIPANT
	Participant saveParticpant(Participant participant);
	
	// EXPENSE
	Expense saveExpense(Expense expense);
	List<Expense> findAll
}
