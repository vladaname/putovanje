package com.example.putovanje.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.putovanje.model.Korisnik;

@Repository
@Transactional
public interface KorisnikRepository extends JpaRepository<Korisnik, Integer>{

	Korisnik findByUsername(String username);

}
