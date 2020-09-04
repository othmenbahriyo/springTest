package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.IndexColumn;


@Entity
public class Produit {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idProduit; 
	private String Desprod; 
	private String catProd;
	
	@OneToMany(targetEntity = Acheter.class , cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "idProduit", referencedColumnName = "idProduit")
	private List<Acheter> acheter;
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Produit(String desprod, String catProd) {
		super();
		Desprod = desprod;
		this.catProd = catProd;
	}


	public Long getIdProduits() {
		return idProduit;
	}


	public void setIdProduits(Long idProduits) {
		this.idProduit = idProduits;
	}


	public String getDesprod() {
		return Desprod;
	}


	public void setDesprod(String desprod) {
		Desprod = desprod;
	}


	public String getCatProd() {
		return catProd;
	}

	

	public void setCatProd(String catProd) {
		this.catProd = catProd;
	}

	
	

	public List<Acheter> getAcheter() {
		return acheter;
	}


	public void setAcheter(List<Acheter> acheter) {
		this.acheter = acheter;
	}


	@Override
	public String toString() {
		return "Produit [idProduits=" + idProduit + ", Desprod=" + Desprod + ", catProd=" + catProd + "]";
	}
	
	
	
	
	

}
