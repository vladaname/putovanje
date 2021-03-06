package com.example.putovanje.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.putovanje.DTO.KorisnikDTO;
import com.example.putovanje.model.Korisnik;
import com.example.putovanje.model.Uloga;
import com.example.putovanje.repository.KorisnikRepository;
import com.example.putovanje.repository.UlogaRepository;
import com.example.putovanje.service.KorisnikService;

@Service
public class KorisnikServiceImpl implements KorisnikService {
	
	@Autowired
	KorisnikRepository korisnikRepository;
	@Autowired
	UlogaRepository ulogaRepository;
	
	private static final Integer ID_ULOGA_KORISNIK = 1;


	@Override
	public Korisnik createKorisnik(KorisnikDTO korisnikDTO) {
		// TODO Auto-generated method stub
			Korisnik k = new  Korisnik();
			k.setName(korisnikDTO.getName());
			k.setSurname(korisnikDTO.getSurname());
			k.setEmail(korisnikDTO.getEmail());
			k.setUsername(korisnikDTO.getUsername());
			k.setPass(korisnikDTO.getPass());
//			Optional<Uloga> getUloga = ulogaRepository.findById(1);
//            Uloga ul = getUloga.get();	
			Uloga ul = ulogaRepository.getById(ID_ULOGA_KORISNIK);
			k.setUloga(ul);
			return korisnikRepository.saveAndFlush(k);
		
	}


	@Override
	public Korisnik findByKorisnik(int idKorisnik) {
		// TODO Auto-generated method stub
		Optional<Korisnik> k = korisnikRepository.findById(idKorisnik);
		Korisnik korisnik = k.get();
		return korisnik;
	}


}
