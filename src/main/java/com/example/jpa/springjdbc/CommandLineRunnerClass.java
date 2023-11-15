package com.example.jpa.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpa.dao.Courses;
import com.example.jpa.jpaqueries.jpaqueriesrepository;
import com.example.jpa.springdatajpa.SpringDataJpa;

@Component
public class CommandLineRunnerClass implements CommandLineRunner{

	@Autowired
	SpringDataJpa queriesobj;
	
	@Override
	public void run(String... args) throws Exception {
		
		queriesobj.save(new Courses(1, "Spring boot Spring JPA", "Navin"));
		queriesobj.save(new Courses(2, "Java Spring JPA", "Ranga"));
		queriesobj.save(new Courses(3, "C Spring JPA", "Deepika"));
		
		queriesobj.deleteById(1l);
		System.out.println(queriesobj.findById(2l));
		System.out.println(queriesobj.findAll());
		
		System.out.println(queriesobj.findByAuthor("Deepika"));
		System.out.println(queriesobj.findByName("Java Spring JPA"));
	}
	

}
