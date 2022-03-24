package com.tectoro.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.airline.pojo.Airline;
import com.tectoro.airline.pojo.Ticket;
import com.tectoro.airline.service.Service;

@RestController
public class Controller {
	@Autowired
	private Service service;

	@PostMapping("/postingairline")
	public Airline move(@RequestBody Airline flight) {
		
		return service.move(flight);

	}
	/*
	 * @PostMapping(value = "/postingticket") public Ticket post(@RequestBody Ticket
	 * ticket) { Ticket t = null; t = service.post(ticket); if (t != null) { return
	 * t;
	 * 
	 * } return null;
	 * 
	 * }
	 */

	

}
