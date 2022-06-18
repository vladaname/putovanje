package com.example.putovanje.service;


import java.util.Date;
import java.util.List;

import com.example.putovanje.DTO.TripDTO;
import com.example.putovanje.model.Korisnik;
import com.example.putovanje.model.Trip;

public interface TripService {


	List<Trip> futerTrips(Date startdate);

	Trip createTrip(TripDTO tripDTO, Korisnik k);


}
