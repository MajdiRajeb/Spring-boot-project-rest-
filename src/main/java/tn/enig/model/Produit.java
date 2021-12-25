package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Produit {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numero;
	private String description;
	private double prix_ach,prix_ven;
	private int quantite;
	@ManyToOne
	@JoinColumn(name="magasin_id")
	private Magasin magasin;
	public Produit(Integer numero, String description, double prix_ach, double prix_ven, int quantite,
			Magasin magasin) {
		super();
		this.numero = numero;
		this.description = description;
		this.prix_ach = prix_ach;
		this.prix_ven = prix_ven;
		this.quantite = quantite;
		this.magasin = magasin;
	}
	public Produit() {
		super();
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix_ach() {
		return prix_ach;
	}
	public void setPrix_ach(double prix_ach) {
		this.prix_ach = prix_ach;
	}
	public double getPrix_ven() {
		return prix_ven;
	}
	public void setPrix_ven(double prix_ven) {
		this.prix_ven = prix_ven;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Magasin getMagasin() {
		return magasin;
	}
	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}
	

}
