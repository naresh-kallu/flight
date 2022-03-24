package com.tectoro.airline.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.airline.pojo.Ticket;
@Repository
public interface Dao1 extends JpaRepository<Ticket, Integer>{

}
