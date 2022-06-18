package com.example.putovanje.repository;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.putovanje.model.Trip;

@Repository
@Transactional
public interface TripRepository extends JpaRepository<Trip, Integer>{

	List<Trip> findByStartdateAfter(Date startdate);


}
