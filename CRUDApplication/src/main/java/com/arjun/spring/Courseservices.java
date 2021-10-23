package com.arjun.spring;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Courseservices {

	@Autowired
	private courserepository repo;
	
	public List<course> getcourses()
	{
	   return 	(List<course>) repo.findAll();
		
	}

	public void Addcourse(course course) {
		// TODO Auto-generated method stub
		repo.save(course);
		System.out.println("successfully saved it");
		
	}

	public void deletecourse(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	public void updatecourse(course course) {
		// TODO Auto-generated method stub
		repo.save(course);
		
	}

	public Optional<course> findbyid(String id) {
		// TODO Auto-generated method stub
		
		return  repo.findById(id);
	}

}
