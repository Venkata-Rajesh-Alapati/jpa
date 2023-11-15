package com.example.jpa.jpaqueries;



import org.springframework.stereotype.Repository;

import com.example.jpa.dao.Courses;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class jpaqueriesrepository {

	@PersistenceContext
	EntityManager em;
	
	public void insert(Courses course) {
		em.merge(course);
	}
	
	public Courses findById(long id) {
		return em.find(Courses.class, id);
	}
	
	public void delete(long id) {
		Courses course = em.find(Courses.class, id);
		em.remove(course);
	}
}
