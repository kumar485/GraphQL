package com.oded.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.oded.model.Person;
import com.oded.repo.PersonRepo;

@Component
public class PersonMutQuery  implements  GraphQLMutationResolver{
	@Autowired
	private PersonRepo repo;
	public Person createVehicle(String firstname,String lastname,String address) {
		Person p=new Person();
		p.setFirstname(firstname);
		p.setAddress(address);
		p.setLastname(lastname);
	  return	repo.save(p);
	
	}
	
	
	

}
