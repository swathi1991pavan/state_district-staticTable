package com.example.statedistrict.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.statedistrict.model.District;
import com.example.statedistrict.model.State;
import com.example.statedistrict.repository.StateRepository;


@Service
public class StateService {
	
	@Autowired
    private StateRepository stateRepository;
	
	public ArrayList<State> getStates() {
		List<State> employeeList = stateRepository.findAll();
        ArrayList<State> states = new ArrayList<>(employeeList);
        return states;
	}

	public List<District> findByStateName(String stateName) {
		State state = stateRepository.findByStateName(stateName);
        if (state != null) {
            return state.getDistricts();
        }
        return null; // Return an appropriate response if state not found
    }
		
	
}
/*@Override
public List<Employee> findEmployeesNameStartingBy(String name) {
	return employeeJpaRepository.findByEmployeeNameStartingWith(name);
}*/