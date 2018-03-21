package ma.ensa.model;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Produit {
	@Id
	@GeneratedValue
	private Long idproduit;
	private String description;
	private double prix;
	@OneToMany (mappedBy="pk.prd")
	private Set<LigneCommande> lcs;
	public Long getIdproduit() {
		return idproduit;
	}
	public void setIdproduit(Long idproduit) {
		this.idproduit = idproduit;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Set<LigneCommande> getLcs() {
		return lcs;
	}
	public void setLcs(Set<LigneCommande> lcs) {
		this.lcs = lcs;
	}
	public Produit(String description, double prix, Set<LigneCommande> lcs) {
		super();
		this.description = description;
		this.prix = prix;
		this.lcs = lcs;
	}
	public Produit() {
		super();
	}
	
}
