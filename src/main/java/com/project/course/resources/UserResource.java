package com.project.course.resources;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.course.entities.User;


public interface UserResource extends JpaRepository<User,Long> {
	
	
}
