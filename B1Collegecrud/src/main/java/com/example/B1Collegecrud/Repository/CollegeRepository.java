package com.example.B1Collegecrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.B1Collegecrud.model.College;

public interface CollegeRepository extends JpaRepository<College,Long> {

	
	
}
