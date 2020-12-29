package com.projet.scr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.scr.model.Livrer;

@Repository
public interface Traitement_Livrer extends JpaRepository<Livrer,Long> {

}
