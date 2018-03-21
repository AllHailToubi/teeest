package ma.ensa.model;

import javax.persistence.*;

@Entity
public class LigneCommande {
	@Id
	private LigneCommande_PK pk;
	private String description;
	private int quantite;
	public LigneCommande_PK getPk() {
		return pk;
	}
	public void setPk(LigneCommande_PK pk) {
		this.pk = pk;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public LigneCommande(LigneCommande_PK pk, String description, int quantite) {
		super();
		this.pk = pk;
		this.description = description;
		this.quantite = quantite;
	}
	public LigneCommande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Produit getP() {
		return pk.getPrd();
		}
	public Commande getC() {
		return pk.getCmd();
	}
	
	
}
