package com.example.statedistrict.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.statedistrict.model.District;
import com.example.statedistrict.model.State;


@Repository
public interface StateRepository extends JpaRepository<State, Long> {

	State findByStateName(String stateName);
	
	
}