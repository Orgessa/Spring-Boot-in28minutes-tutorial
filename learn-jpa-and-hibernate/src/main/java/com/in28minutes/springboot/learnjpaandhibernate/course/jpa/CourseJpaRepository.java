package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	//this method inserts a row in the table
	public void insert(Course course) {
		
		entityManager.merge(course);
		
	}
	
	
	//this method finds the course by the given id
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
	
	
	//this method deletes the course related to the given id
	public void deleteById(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}

}
