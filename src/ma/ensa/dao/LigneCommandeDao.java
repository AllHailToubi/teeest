package ma.ensa.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.ensa.model.LigneCommande;

@Repository(value="ligneCommandeDao")
public class LigneCommandeDao implements LigneCommandeDaoImpl{

	SessionFactory sessionFactory;
	@Override
	public void save(LigneCommande ligneCommande) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(ligneCommande);
		tx.commit();
		session.close();
	}
	@Override
	public Set<LigneCommande> findOne(int id) {
		Session session=sessionFactory.openSession();
		Query query = session.createQuery( " from LigneCommande as c where commande_idcommande =:id");
		query.setParameter("id", id);
		List<LigneCommande> list = query.list();
		Set<LigneCommande> cmds = new HashSet<LigneCommande>(list);
		if(cmds.isEmpty())
			return null;
		else
			return cmds;
	}
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}