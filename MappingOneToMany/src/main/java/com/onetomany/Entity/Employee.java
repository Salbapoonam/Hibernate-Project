package com.onetomany.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//POJO:Plain old java Object
@Entity
public class Employee {
	@Id
	private int eid;
	private String ename;
	 private double esalary;
	 @OneToMany
	 List<Projects>project;
	 
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", project=" + project + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public List<Projects> getProject() {
		return project;
	}
	public void setProject(List<Projects> project) {
		this.project = project;
	}
	public Employee(int eid, String ename, double esalary, List<Projects> project) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.project = project;
	}

}
