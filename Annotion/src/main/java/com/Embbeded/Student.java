package com.Embbeded;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 private String name;
 private Courses course;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Courses getCourse() {
	return course;
}
public void setCourse(Courses course) {
	this.course = course;
}
public Student(int id, String name, Courses course) {
	super();
	this.id = id;
	this.name = name;
	this.course = course;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
}
 


}
