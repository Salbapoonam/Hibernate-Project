package com.manyTomany.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Actors {
	@Id
		int aid;
	String aname;
	@ManyToMany
	List<Movies>movie;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public List<Movies> getMovie() {
		return movie;
	}
	public void setMovie(List<Movies> movie) {
		this.movie = movie;
	}
	public Actors(int aid, String aname, List<Movies> movie) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.movie = movie;
	}
	public Actors() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Actors [aid=" + aid + ", aname=" + aname + ", movie=" + movie + "]";
	}
	
	

}
