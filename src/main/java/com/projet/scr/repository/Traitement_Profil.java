package com.projet.scr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.scr.model.Profil;

@Repository
public interface Traitement_Profil extends JpaRepository<Profil,Long>{

}
