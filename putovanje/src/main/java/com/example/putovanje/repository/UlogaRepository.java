package com.example.putovanje.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.putovanje.model.Uloga;

@Repository
@Transactional
public interface UlogaRepository extends JpaRepository<Uloga, Integer>{

}
