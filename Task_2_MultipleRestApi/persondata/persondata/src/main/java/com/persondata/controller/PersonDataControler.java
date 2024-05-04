package com.persondata.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.persondata.entities.Party;
import com.persondata.service.PersonService;

@RestController
public class PersonDataControler {

	
private PersonService courseservice =new PersonService();
	
//	
//	@GetMapping("/persondata")
//	public String home() {
//		return "This is Home Page";
//	}
	
	@GetMapping("/persondata")
	public List<Party> getCourses(){
		return this.courseservice.getCourses();
	}
	
}
