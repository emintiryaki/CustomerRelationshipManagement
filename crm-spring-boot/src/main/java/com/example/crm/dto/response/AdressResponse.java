package com.example.crm.dto.response;

import com.example.crm.entity.AddressType;

public class AdressResponse {
	private int id;
	private String street;
	private String city;
	private String country;
	private String zipType;
	private AddressType type;
	public AdressResponse() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipType() {
		return zipType;
	}
	public void setZipType(String zipType) {
		this.zipType = zipType;
	}
	public AddressType getType() {
		return type;
	}
	public void setType(AddressType type) {
		this.type = type;
	}
	
	
}
