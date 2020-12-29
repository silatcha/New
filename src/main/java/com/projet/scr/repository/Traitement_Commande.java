package com.projet.scr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.scr.model.Commander;

@Repository
public interface Traitement_Commande extends JpaRepository<Commander,Long>{

}
