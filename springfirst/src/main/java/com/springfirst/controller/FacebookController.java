package com.springfirst.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller for web applications

@RestController //for web services
public class FacebookController {
	
	// we can use request mapping instead of get mapping, post mapping, put mapping and delete mapping
	
	//@RequestMapping(method = RequestMethod.GET, value = "viewAllProfile")
	
	// for view profile
	@GetMapping("viewAllProfile")
	public String all() {
		return "viewed all";
	}
	
	// for create profile
	@PostMapping("createRecord")
	public String createProfile() {
		return "profile created";
	}
	
	// for update profile
	@PutMapping("updateRecord")
	public String updateProfile() {
		return "profile updated";
	}
	
	// for delete profile
	@DeleteMapping("deleteRecord")
	public String deleteProfile() {
		return "profile deleted";
	}

}
