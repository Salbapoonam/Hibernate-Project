package com.Anno;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "Vehicle_info")
public class Vehicle {
	@Id

	@Column(name = "VID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(name = "VNAME")
	String name;
	@Column(name = "VMILAGE")
	int milage;
	@Column(name = "VPRICE")
	double price;

	@Temporal(TemporalType.DATE)
	Date date;

	@Transient
	int x;
	@Lob
	byte[]img;


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	public Vehicle(int id, String name, int milage, double price, Date date, int x, byte[] img) {
		super();
		this.id = id;
		this.name = name;
		this.milage = milage;
		this.price = price;
		this.date = date;
		this.x = x;
		this.img = img;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

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

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", milage=" + milage + ", price=" + price + ", date=" + date
				+ ", x=" + x + ", img=" + Arrays.toString(img) + "]";
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

}
