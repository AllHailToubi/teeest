package ma.ensa.dao;

import java.util.Set;

import org.springframework.stereotype.Repository;

import ma.ensa.model.Commande;
@Repository(value="commandeDao")
public interface CommandeDaoImpl {
	
	public Set<Commande> findAll();
	public Commande findOne(int id);
	public int save(Commande cmd);

}
