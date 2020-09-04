package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Produit;
import com.example.demo.repos.produitReposetory;
import com.example.demo.service.ProduitService;

@Controller
public class ProduitController {
	
	@Autowired
	produitReposetory produitReposetory;
	
	@GetMapping("/AllP")
	public List<Produit> getAllUsers() {
		return 	produitReposetory.findAll();
	}

}
