package com.arjun.spring;

import java.util.List;
import java.util.Optional;
//import com.arjun.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Appcontroller {
	
@Autowired
private Courseservices services;

public void ok()
{
	System.out.println("ckxjljlkd");
}

@RequestMapping("/home")
public String home()
{
	return "ok";
}
	
@RequestMapping(method = RequestMethod.GET, value = "/Allcourses")
public List<course> GetCourses()
{
	
	return services.getcourses();
}


@RequestMapping(method = RequestMethod.POST,value = "/Addcourse")
public void AddCourse(@RequestBody course course)
{
	services.Addcourse(course);
}

@RequestMapping(method = RequestMethod.DELETE, value = "/courses/delete/{id}")
public void deletecourse(@PathVariable String id)
{
	services.deletecourse(id);
}

@RequestMapping(method =  RequestMethod.PUT, value = "/courses/update")
public void updatecourse(@RequestBody course course)
{
	services.updatecourse(course);
	
}


@RequestMapping(method = RequestMethod.GET, value = "/courses/find/{id}")
public Optional<course> findbyid(@PathVariable String id)
{
	return services.findbyid(id);
}





}
