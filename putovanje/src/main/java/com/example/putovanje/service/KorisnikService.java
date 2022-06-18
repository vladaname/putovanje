package com.example.putovanje.service;

import com.example.putovanje.DTO.KorisnikDTO;
import com.example.putovanje.model.Korisnik;

public interface KorisnikService {

	Korisnik createKorisnik(KorisnikDTO korisnikDTO);

	Korisnik findByKorisnik(int idKorisnik);


}
