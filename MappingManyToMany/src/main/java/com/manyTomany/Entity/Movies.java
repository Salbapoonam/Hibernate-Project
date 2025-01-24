package com.manyTomany.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Movies {
	@Id
	int mid;
	String mnane;
	double boxoffice;
	@ManyToMany
	List<Actors>actors;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMnane() {
		return mnane;
	}
	public void setMnane(String mnane) {
		this.mnane = mnane;
	}
	public double getBoxoffice() {
		return boxoffice;
	}
	public void setBoxoffice(double boxoffice) {
		this.boxoffice = boxoffice;
	}
	public List<Actors> getActors() {
		return actors;
	}
	public void setActors(List<Actors> actors) {
		this.actors = actors;
	}
	public Movies(int mid, String mnane, double boxoffice, List<Actors> actors) {
		super();
		this.mid = mid;
		this.mnane = mnane;
		this.boxoffice = boxoffice;
		this.actors = actors;
	}
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movies [mid=" + mid + ", mnane=" + mnane + ", boxoffice=" + boxoffice + ", actors=" + actors + "]";
	}
	
	

}
