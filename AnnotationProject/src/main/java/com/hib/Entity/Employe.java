package com.hib.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe {
	@Id
 private int sid;
 private String  sname;
 private double salary;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Employe(int sid, String sname, double salary) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employe [sid=" + sid + ", sname=" + sname + ", salary=" + salary + "]";
}
public Employe() {
	super();
	// TODO Auto-generated constructor stub
}
 
 

}
