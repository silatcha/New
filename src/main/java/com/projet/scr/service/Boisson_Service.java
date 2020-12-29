package com.projet.scr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.scr.model.Boisson;
import com.projet.scr.repository.Traitement_Boisson;

@Service
public class Boisson_Service {

	@Autowired
	private Traitement_Boisson tb;
	
	
	public List<Boisson> listAll(){
		return tb.findAll();
	}
	
	public void ajouter(Boisson b) {
		tb.save(b);
	
	}
	
	public Boisson rechercher(long id) {
		return tb.findById(id).get();
	}
	
	public void delete(long id) {
		tb.deleteById(id);
	}
}
