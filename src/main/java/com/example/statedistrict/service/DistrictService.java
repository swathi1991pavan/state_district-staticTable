package com.example.statedistrict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.statedistrict.model.District;
import com.example.statedistrict.repository.DistrictRepository;
import com.example.statedistrict.repository.StateRepository;

@Service
public class DistrictService {
	
	@Autowired
    private DistrictRepository districtRepository;
	
	
	public List<District> getDistrictsById(Long Id) {
		List<District> districts= districtRepository.getDistrictsById(Id);
		return districts;
	}


	

	
	
}
