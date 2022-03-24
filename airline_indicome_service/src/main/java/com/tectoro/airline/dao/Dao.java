package com.tectoro.airline.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.airline.pojo.Airline;
@Repository
public interface Dao extends JpaRepository<Airline, Integer>{

	//Airline save(Airline flight);


}
