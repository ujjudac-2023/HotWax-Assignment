package com.persondata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.persondata.entities.Party;

@Service
public class PersonService  {
	List<Party> list;
	
	public PersonService() {
		list=new ArrayList<>();
		list.add(new Party("P1000","PERSON"));
		list.add(new Party("P1001","PERSON"));
		list.add(new Party("P1002","PERSON"));
	}

	
	public List<Party> getCourses(){
		return list;
	}

}
