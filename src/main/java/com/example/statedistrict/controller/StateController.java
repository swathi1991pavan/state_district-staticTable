package com.example.statedistrict.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.statedistrict.model.District;
import com.example.statedistrict.model.State;
import com.example.statedistrict.service.DistrictService;
import com.example.statedistrict.service.StateService;


@RestController
@RequestMapping("/api/states")

public class StateController {
	
	@Autowired
    public StateService stateService ;
	
	@Autowired 
	public DistrictService districtService ;
	
	
	@GetMapping("/v1")
	
	public List<State> getStates(){
		return stateService.getStates();
	}
	
	
	@GetMapping("/v1/{Id}")
	public List<District> getDistrictsById(@PathVariable("Id") Long Id){
		return districtService.getDistrictsById(Id);
		
	}
	
	@GetMapping("/{stateName}")
    public List<District> findByStateName(@PathVariable("stateName") String stateName) {
        return stateService.findByStateName(stateName) ;
    }
}
	
