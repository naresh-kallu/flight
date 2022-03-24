package com.tectoro.airline.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="tick2")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String date;
	private String source;
	private String destination;
	private String timeOfJourney;
	
	
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(int id, String date, String source, String destination, String timeOfJourney) {
		super();
		this.id = id;
		this.date = date;
		this.source = source;
		this.destination = destination;
		this.timeOfJourney = timeOfJourney;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTimeOfJourney() {
		return timeOfJourney;
	}
	public void setTimeOfJourney(String timeOfJourney) {
		this.timeOfJourney = timeOfJourney;
	}
	
	
	
}
