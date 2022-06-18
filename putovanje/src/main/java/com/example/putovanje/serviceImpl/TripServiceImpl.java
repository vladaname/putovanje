package com.example.putovanje.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.putovanje.DTO.TripDTO;
import com.example.putovanje.model.Korisnik;
import com.example.putovanje.model.Trip;
import com.example.putovanje.repository.TripRepository;
import com.example.putovanje.service.TripService;

@Service
public class TripServiceImpl implements TripService{
	
	@Autowired
	TripRepository tripRepository;

	@Override
	public Trip createTrip(TripDTO tripDTO, Korisnik k) {
		Trip t = new Trip();
		t.setDestination(tripDTO.getDestination());
		Date date = new Date();
		t.setStartdate(date);
		t.setEnddate(date);
		t.setComent(tripDTO.getComent());
		t.setKorisnik(k);
		
		return tripRepository.saveAndFlush(t);
	}

	@Override
	public List<Trip> futerTrips(Date startdate) {
		// TODO Auto-generated method stub
		List<Trip> allFuterTrips = tripRepository.findByStartdateAfter(startdate);
		return allFuterTrips;
	}


	

	

}
