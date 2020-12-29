package com.projet.scr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.scr.model.Facture;

@Repository
public interface Traitement_Fac extends JpaRepository<Facture,Long>{

}
