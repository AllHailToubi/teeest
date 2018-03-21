package ma.ensa.dao;

import java.util.Set;

import org.springframework.stereotype.Repository;

import ma.ensa.model.LigneCommande;

@Repository(value="ligneCommandeDao")
public interface LigneCommandeDaoImpl {

	void save(LigneCommande ligneCommande);

	public Set<LigneCommande> findOne(int id);

}
