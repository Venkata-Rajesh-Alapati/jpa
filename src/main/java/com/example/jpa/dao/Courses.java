package com.example.jpa.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Courses {
	@Id
	long id;
	String name;
	String author;
	
	
	
	
	public Courses() {
		super();
	}


	public Courses(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}


	public long getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public String getAuthor() {
		return author;
	}
	
	


	public void setId(long id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
}
