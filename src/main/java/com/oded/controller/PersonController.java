package com.oded.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oded.model.Person;
import com.oded.repo.PersonRepo;

@RestController
public class PersonController {
	@Autowired
	private PersonRepo repo;
	@PostMapping("/create")
	public String addPerson(@RequestBody Person per) {
		 repo.save(per);
		return "added person";
		
	}

}
