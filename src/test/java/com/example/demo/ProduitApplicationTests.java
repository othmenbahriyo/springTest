package com.example.demo;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Acheter;
import com.example.demo.model.Acheter.Pk;
import com.example.demo.model.Fournisseur;
import com.example.demo.model.Produit;
import com.example.demo.repos.AchatReposetory;
import com.example.demo.repos.fournisseurReposetory;
import com.example.demo.repos.produitReposetory;



@SpringBootTest
class ProduitApplicationTests {

	
	@Autowired
	private produitReposetory produitReposetory; 
	@Autowired
	private fournisseurReposetory fournisseurReposetory; 
	@Autowired
	private AchatReposetory achatReposetory; 

	@Test
	public void testCreateProduit() {
		Produit p = new Produit("Ordinateur portable", "INFORMATIQUE");
		Produit p1 = new Produit("ECRANS","INFORMATIQUE");
		produitReposetory.save(p);
		produitReposetory.save(p1);		
	}
	
	
	@Test
	public void testCreatefrs() {
		Fournisseur p = new Fournisseur("Apple", "");
		Fournisseur p1 = new Fournisseur("Huawei", "");
		Fournisseur p2 = new Fournisseur("Acer", "");
		Fournisseur p3 = new Fournisseur("LENOVO", "");
		fournisseurReposetory.save(p);
		fournisseurReposetory.save(p1);	
		fournisseurReposetory.save(p2);
		fournisseurReposetory.save(p3);	
	}
	
	@Test
	public void testCreatAchat() {
		Pk p = new Pk(1 , 1);
		Acheter a1 = new Acheter(p ,  25.5);
		Pk p1 = new Pk(1 , 2);
		Acheter a2 = new Acheter(p1 ,  25.5);
		Pk p2 = new Pk(2 , 2);
		Acheter a3 = new Acheter(p2 ,  25.5);
		Pk p3 = new Pk(1 , 1);
		Acheter a4 = new Acheter(p3 ,  25.5);
		Pk p4 = new Pk(4 , 1);
		Acheter a5 = new Acheter(p4 ,  25.5);
		Pk p5 = new Pk(2 , 3);
		Acheter a6 = new Acheter(p5 ,  25.5);
		
		achatReposetory.save(a1) ;
		achatReposetory.save(a2) ;
		achatReposetory.save(a3) ;
		achatReposetory.save(a4) ;
		achatReposetory.save(a5) ;
		achatReposetory.save(a6) ;

		
	}



	
	

	
}
