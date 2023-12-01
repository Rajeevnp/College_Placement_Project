package com.example.B1Collegecrud.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.B1Collegecrud.Repository.CollegeRepository;
import com.example.B1Collegecrud.model.College;

import jakarta.transaction.Transactional;

@Service
@Transactional
      public class CollegeService {
      @Autowired
     private CollegeRepository collegeRepository;     
  
     //Create
	 public College registerCollege(College college) {
	 return collegeRepository.save(college);
  }	
	 //Read
	 public List<College>getColleges() { 
     return(List<College>)collegeRepository.findAll();
	 }
	 
	 //Update
	 public College updateCollege(College newcollege, Long id) {
	 //Long id-newcollege.getId(); 
	 College oldclg=collegeRepository.findById(id).get();
	 oldclg.setAdmin (newcollege.getAdmin()); 
	 oldclg.setCollegeName(newcollege.getCollegeName());
	 oldclg.setLocation(newcollege.getLocation());
	 return collegeRepository.save(oldclg);
  }
	//Delete
	 public Boolean deleteCollegeByIds(Long id) { 
			Boolean b=false;
			try { 
				collegeRepository.deleteById(id); 
				b=true;
			}
			catch (Exception e) {
			e.printStackTrace();
			}
			return b;

	}
}

