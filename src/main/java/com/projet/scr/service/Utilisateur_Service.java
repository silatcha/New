package com.projet.scr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.scr.model.Utilisateur;
import com.projet.scr.repository.Traitement_User;

@Service
public class Utilisateur_Service {

	@Autowired
	private Traitement_User tu;
	
	
	public List<Utilisateur> listAll(){
		return tu.findAll();
	}
	
	public void ajouter(Utilisateur b) {
		tu.save(b);
	
	}
	
	public Utilisateur rechercher(long id) {
		return tu.findById(id).get();
	}
	
	public void delete(long id) {
		tu.deleteById(id);
	}
	
}
