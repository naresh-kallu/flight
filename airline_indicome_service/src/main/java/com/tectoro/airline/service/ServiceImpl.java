package com.tectoro.airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.tectoro.airline.dao.Dao;
import com.tectoro.airline.dao.Dao1;
import com.tectoro.airline.pojo.Airline;
import com.tectoro.airline.pojo.Ticket;
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
	@Autowired
	private Dao dao;
	//@Qualifier("Airline")
	public Airline move(Airline flight) {
		return dao.save(flight);
	}
	/*
	 * @Qualifier("Ticket") public Ticket post(Ticket ticket) { return
	 * dao1.save(ticket); }
	 */

	
	
}
