package com.tectoro.airline.pojo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="air2")
public class Airline {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightId;
	private String flightName;
	private int businessSeats;
	private int economySeats;
	private int businessPrice;
	private int economyPrice;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "flightId")
	private List<Ticket> tickets;
	
	
	
	
	public Airline() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Airline(int flightId, String flightName, int businessSeats, int economySeats, int businessPrice,
			int economyPrice, List<Ticket> tickets) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.businessSeats = businessSeats;
		this.economySeats = economySeats;
		this.businessPrice = businessPrice;
		this.economyPrice = economyPrice;
		this.tickets = tickets;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public int getBusinessSeats() {
		return businessSeats;
	}
	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}
	public int getEconomySeats() {
		return economySeats;
	}
	public void setEconomySeats(int economySeats) {
		this.economySeats = economySeats;
	}
	public int getBusinessPrice() {
		return businessPrice;
	}
	public void setBusinessPrice(int businessPrice) {
		this.businessPrice = businessPrice;
	}
	public int getEconomyPrice() {
		return economyPrice;
	}
	public void setEconomyPrice(int economyPrice) {
		this.economyPrice = economyPrice;
	}
	public List<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	
}
