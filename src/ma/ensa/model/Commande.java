package ma.ensa.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Commande {
	@Id
	@GeneratedValue
	private int idcommande;
	private LocalDate datecreation;
	private String description;
	@OneToMany (mappedBy="pk.cmd")
	private Set<LigneCommande> lcs;
	public int getIdcommande() {
		return idcommande;
	}
	public void setIdcommande(int idcommande) {
		this.idcommande = idcommande;
	}
	public LocalDate getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(LocalDate datecreation) {
		this.datecreation = datecreation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<LigneCommande> getLcs() {
		return lcs;
	}
	public void setLcs(Set<LigneCommande> lcs) {
		this.lcs = lcs;
	}
	public Commande(LocalDate date, String description, Set<LigneCommande> lcs) {
		super();
		this.datecreation = date;
		this.description = description;
		this.lcs = lcs;
	}
	public Commande() {
		super();
	}
	
	
}
