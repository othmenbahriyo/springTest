package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Fournisseur;
import com.example.demo.repos.fournisseurReposetory;

public class FournisseurServicempl implements FournisseurService {
	
	@Autowired
	fournisseurReposetory fournisseurReposetory;

	@Override
	public Fournisseur saveFournisseur(Fournisseur f) {
		// TODO Auto-generated method stub
		return fournisseurReposetory.save(f);
	}

	@Override
	public Fournisseur updateFournisseur(Fournisseur f) {
		// TODO Auto-generated method stub
		return fournisseurReposetory.save(f);
	}

	@Override
	public void deleteFournisseur(Fournisseur f) {
		// TODO Auto-generated method stub
		fournisseurReposetory.delete(f);
		
	}

	@Override
	public void deleteFournisseurById(Long id) {
		// TODO Auto-generated method stub
		fournisseurReposetory.deleteById(id);
	}

	@Override
	public Fournisseur getFournisseur(Long id) {
		// TODO Auto-generated method stub
		return fournisseurReposetory.findById(id).get();
	}

	@Override
	public List<Fournisseur> getAllFournisseur() {
		// TODO Auto-generated method stub
		return fournisseurReposetory.findAll();
	}

}
