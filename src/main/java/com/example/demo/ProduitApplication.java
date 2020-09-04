package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Produit;
import com.example.demo.repos.AchatReposetory;
import com.example.demo.repos.fournisseurReposetory;
import com.example.demo.repos.produitReposetory;
import com.example.demo.service.ProduitService;

@SpringBootApplication
public class ProduitApplication {

	@Autowired
	private ProduitService produitReposetory; 
	@Autowired
	private fournisseurReposetory fournisseurReposetory; 
	@Autowired
	private AchatReposetory achatReposetory; 
	
	public static void main(String[] args) {
		
		SpringApplication.run(ProduitApplication.class, args);

	


		
	}
	
}
