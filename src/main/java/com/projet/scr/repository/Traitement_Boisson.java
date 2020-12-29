package com.projet.scr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.scr.model.Boisson;


@Repository
public interface Traitement_Boisson extends JpaRepository<Boisson,Long>{

}
