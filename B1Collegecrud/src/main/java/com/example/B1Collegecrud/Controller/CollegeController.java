package com.example.B1Collegecrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.B1Collegecrud.Service.CollegeService;
import com.example.B1Collegecrud.model.College;

@RestController
public class CollegeController {

	    @Autowired
	    private CollegeService collegeservice;
	
		@PostMapping ("/registercollege")
		public College registerCollege (@RequestBody College college) {
		return collegeservice.registerCollege(college);
		}
		
		@GetMapping("/getcolleges")
		public List<College>getColleges() { 
		return collegeservice.getColleges ();
		}
		
		@DeleteMapping ("/deletecollege/{id}") 
		public String deleteCollege (@PathVariable Long id) {
		try {
		boolean bool=collegeservice.deleteCollegeByIds(id); 
		if (bool==true) {
		    return "Succesfully Deleted";
		}
		else
		    return "Unsuccesfull";
	    }
	   	catch(Exception e) {
		    return "Unsuccessfull";
		}
		} 

		@PutMapping("/updatecollege/{id}")
		public College updateCollege(@RequestBody College college, @PathVariable Long id) { 
		return collegeservice.updateCollege(college, id);
		}
}	
