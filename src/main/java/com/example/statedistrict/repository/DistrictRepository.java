package com.example.statedistrict.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.statedistrict.model.District;


@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {

	List<District> getDistrictsById(Long id);
	
	

	

}





