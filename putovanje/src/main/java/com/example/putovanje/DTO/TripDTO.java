package com.example.putovanje.DTO;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class TripDTO {
	
	private int id_korisnik;
	private String coment;
	private String destination;
	private Date enddate;
	private Date startdate;


}
