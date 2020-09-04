package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Fournisseur {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idFRS; 
	private String nomFRS; 
	private String VilFRS;
	
	//@ManyToOne(cascade = CascadeType.ALL)
	//private Acheter acheter;
	
	
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Fournisseur(String nomFRS, String vilFRS) {
		super();
		this.nomFRS = nomFRS;
		VilFRS = vilFRS;
	}


	public Long getIdFRS() {
		return idFRS;
	}


	public void setIdFRS(Long idFRS) {
		this.idFRS = idFRS;
	}


	public String getNomFRS() {
		return nomFRS;
	}


	public void setNomFRS(String nomFRS) {
		this.nomFRS = nomFRS;
	}


	public String getVilFRS() {
		return VilFRS;
	}


	public void setVilFRS(String vilFRS) {
		VilFRS = vilFRS;
	}


	@Override
	public String toString() {
		return "Fournisseur [idFRS=" + idFRS + ", nomFRS=" + nomFRS + ", VilFRS=" + VilFRS + "]";
	}
	
	
	
	
	
	

}
