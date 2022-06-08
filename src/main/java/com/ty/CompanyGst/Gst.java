package com.ty.CompanyGst;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gst {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private double gstNumber;
	private String state;
	private String country;
	@OneToOne
	private Company company;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(double gstNumber) {
		this.gstNumber = gstNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
}
