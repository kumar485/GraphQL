package com.oded.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oded.model.Person;

public interface PersonRepo  extends JpaRepository<Person,Integer>{

}
