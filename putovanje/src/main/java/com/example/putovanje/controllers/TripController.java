package com.example.putovanje.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.putovanje.DTO.TripDTO;
import com.example.putovanje.model.Korisnik;
import com.example.putovanje.model.Trip;
import com.example.putovanje.service.KorisnikService;
import com.example.putovanje.service.TripService;



@RestController
public class TripController {
	
	@Autowired
	TripService tripService;
	
	@Autowired
	KorisnikService korisnikService;
	
	
	@PostMapping("/createTrip")
	public String createTrip(@RequestBody TripDTO tripDTO, @RequestAttribute int id_korisnik) {
		
		Korisnik k = korisnikService.findByKorisnik(id_korisnik);
		Trip t = tripService.createTrip(tripDTO, k);
		if(t != null) {
			return "Trip created.";
			
		}
		else {
			return "Tray again.";
		}
		
	}
	
	@GetMapping("/listFutureTrip")
	public List<Trip> listFutureTrip(@PathVariable Date startdate){
		
		List<Trip> findAllFuterTrips = tripService.futerTrips(startdate);
		if(findAllFuterTrips != null) {
			return findAllFuterTrips;
		}
		else {
			return null;
		}
		
	}
	
	
	

}
