package com.arjun.spring;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class course
{
	@Id
	String id;
	public void setId(String id) {
		this.id = id;
	}
	String name;
	String author;
	String description;
	@Override
	public String toString() {
		return "courses [id=" + id + ", name=" + name + ", author=" + author + ", description=" + description + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
