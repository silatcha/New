package com.projet.scr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.scr.model.Utilisateur;

@Repository
public interface Traitement_User extends JpaRepository<Utilisateur,Long> {

}
