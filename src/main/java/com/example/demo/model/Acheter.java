package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Acheter {
	
	
	
	 @Embeddable
	    public static class Pk implements Serializable {
	        @Column(name = "idProduit", nullable = false, updatable = false)
	        private int idProduit;

	        @Column(nullable = false, updatable = false)
	        private int idFRS;

			public int getIdProduit() {
				return idProduit;
			}

			public void setIdProduit(int idProduit) {
				this.idProduit = idProduit;
			}

			public long getIdFRS() {
				return idFRS;
			}

			public void setIdFRS(int idFRS) {
				this.idFRS = idFRS;
			}

			public Pk() {
				super();
				// TODO Auto-generated constructor stub
			}

			public Pk(int idProduit, int idFRS) {
				super();
				this.idProduit = idProduit;
				this.idFRS = idFRS;
			}
	        
	        
			
	    }
	 
	 
	 
	@EmbeddedId
	private Pk pk;
	
	private Double prix;
	

	public Acheter() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Acheter(Pk pk, Double prix) {
		super();
		this.pk = pk;
		this.prix = prix;
	}



	public Pk getPk() {
		return pk;
	}



	public void setPk(Pk pk) {
		this.pk = pk;
	}



	public Double getPrix() {
		return prix;
	}



	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	
	


	
	
	
	
	

}
