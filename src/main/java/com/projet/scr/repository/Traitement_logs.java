package com.projet.scr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.scr.model.Logs;

@Repository
public interface Traitement_logs extends JpaRepository<Logs,Long>{

}
