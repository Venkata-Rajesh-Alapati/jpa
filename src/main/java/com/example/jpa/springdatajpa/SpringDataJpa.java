package com.example.jpa.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.dao.Courses;

public interface SpringDataJpa extends JpaRepository<Courses, Long>{
	
	List<Courses> findByAuthor(String author);
	List<Courses> findByName(String name);
	
}
