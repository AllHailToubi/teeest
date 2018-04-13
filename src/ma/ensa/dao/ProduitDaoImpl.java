package ma.ensa.dao;

import java.util.Set;

import org.springframework.stereotype.Repository;

import ma.ensa.model.Produit;

@Repository(value="produitDao")
public interface ProduitDaoImpl {
	
	public Set<Produit> findAll();
	public void save(Produit prd);
	public Produit findOne(Long id);

}
