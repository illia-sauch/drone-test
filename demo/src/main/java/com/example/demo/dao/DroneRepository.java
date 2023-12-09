package com.example.demo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.example.demo.model.Drone;
import org.springframework.data.repository.CrudRepository;


public interface DroneRepository extends CrudRepository<Drone, Integer> {

//   List<Drone> findByLastname(String lastname);

  Drone findById(int id);
  Drone save(Drone drone);
  List<Drone> findAll();
}
