package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Produit;
import com.example.demo.repos.produitReposetory;

public class produitServicempl implements ProduitService {
	
	
	@Autowired
	produitReposetory produitReposetory;
	
	@Override
	public Produit saveProduit(Produit p) {
		// TODO Auto-generated method stub
		return produitReposetory.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		// TODO Auto-generated method stub
		return produitReposetory.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		// TODO Auto-generated method stub
		produitReposetory.delete(p);
		
	}

	@Override
	public void deleteProduitById(Long id) {
		// TODO Auto-generated method stub
		 produitReposetory.deleteById(id);
		
	}

	@Override
	public Produit getProduit(Long id) {
		// TODO Auto-generated method stub
		return produitReposetory.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduit() {
		// TODO Auto-generated method stub
		return produitReposetory.findAll();
	}

}
