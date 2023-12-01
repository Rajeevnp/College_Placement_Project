package com.example.B1Collegecrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="college")
public class College {
    
	@jakarta.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String Admin;
	private String CollegeName;
	private String Location;	
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getAdmin() {
		return Admin;
	}
	public void setAdmin(String admin) {
		Admin = admin;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}

	
	
	
	
}
