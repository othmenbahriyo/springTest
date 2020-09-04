package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Fournisseur;

public interface FournisseurService {
	Fournisseur saveFournisseur(Fournisseur f);
	Fournisseur updateFournisseur(Fournisseur f);
	void deleteFournisseur(Fournisseur f);
	void deleteFournisseurById(Long id);
	Fournisseur getFournisseur(Long id);
	List<Fournisseur> getAllFournisseur();

}
