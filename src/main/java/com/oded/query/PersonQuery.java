package com.oded.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.oded.model.Person;
import com.oded.repo.PersonRepo;

@Service
public class PersonQuery implements  GraphQLQueryResolver {
	@Autowired
	private PersonRepo repo;
	
	public List<Person>getAllPersons() {
		return repo.findAll();
		
	}
	
	public Optional<Person> getPerson(int id) {
		return repo.findById(id);
		
	}

}
