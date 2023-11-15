package com.example.jpa.springjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.jpa.dao.Courses;

@Repository
public class SpringJdbcQueries {
	@Autowired
	private JdbcTemplate jdbctemp;
	
	private static String insert_query = 
			"""
				
				INSERT INTO COURSES VALUES(?,?,?);
					
			""";
	
	private static String delete_query = 
			"""
				DELETE FROM COURSES WHERE ID = ?;	
					
			""";
	
	
	private static String select_query = 
			"""
				SELECT * FROM COURSES WHERE ID = ?;	
					
			""";
	
	private static String select_all = 
			"""
				SELECT * FROM COURSES;	
					
			""";
	
	public void insert(Courses course) {
		jdbctemp.update(insert_query, course.getId(), course.getName(),course.getAuthor());
	}
	
	public void delete(long id) {
		jdbctemp.update(delete_query, id);
	}
	
	public Courses findById(long id) {
		return jdbctemp.queryForObject(select_query, new BeanPropertyRowMapper<>(Courses.class), id);
	}
	
	public List<Courses> findall() {
		return jdbctemp.query(select_all, new BeanPropertyRowMapper<Courses>(Courses.class));
	}
}
