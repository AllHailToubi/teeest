package ma.ensa.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class LigneCommande_PK implements Serializable{

	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name="produit_idproduit")
	private Produit prd;
	@ManyToOne
	@JoinColumn(name="commande_idcommande")
	private Commande cmd;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cmd == null) ? 0 : cmd.hashCode());
		result = prime * result + ((prd == null) ? 0 : prd.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LigneCommande_PK other = (LigneCommande_PK) obj;
		if (cmd == null) {
			if (other.cmd != null)
				return false;
		} else if (!cmd.equals(other.cmd))
			return false;
		if (prd == null) {
			if (other.prd != null)
				return false;
		} else if (!prd.equals(other.prd))
			return false;
		return true;
	}
	public LigneCommande_PK() {
		super();
	}
	public LigneCommande_PK(Produit prd, Commande cmd) {
		super();
		this.prd = prd;
		this.cmd = cmd;
	}
	public Produit getPrd() {
		return prd;
	}
	public void setPrd(Produit prd) {
		this.prd = prd;
	}
	public Commande getCmd() {
		return cmd;
	}
	public void setCmd(Commande cmd) {
		this.cmd = cmd;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
