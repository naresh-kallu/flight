package com.tectoro.airline.pojo;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Passenger {
	@Id
	private int passergerId;
	private String passengerName;
	private String gender;
	private int age;

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(int passergerId, String passengerName, String gender, int age) {
		super();
		this.passergerId = passergerId;
		this.passengerName = passengerName;
		this.gender = gender;
		this.age = age;
	}

	public int getPassergerId() {
		return passergerId;
	}

	public void setPassergerId(int passergerId) {
		this.passergerId = passergerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
