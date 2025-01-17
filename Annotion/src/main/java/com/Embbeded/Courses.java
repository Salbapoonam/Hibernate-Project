package com.Embbeded;

import javax.persistence.Embeddable;

@Embeddable
public class Courses {
	private String cname;
	private double fees;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public Courses(String cname, double fees) {
		super();
		this.cname = cname;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Courses [cname=" + cname + ", fees=" + fees + "]";
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
