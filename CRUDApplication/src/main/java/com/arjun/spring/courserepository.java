package com.arjun.spring;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface courserepository extends CrudRepository<course, String> {

}
