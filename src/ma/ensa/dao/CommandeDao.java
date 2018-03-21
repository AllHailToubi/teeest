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

import ma.ensa.model.Commande;
import ma.ensa.model.Produit;

@Repository(value="commandeDao")
public class CommandeDao implements CommandeDaoImpl{

	SessionFactory sessionFactory;
	
	@Override
	public Set<Commande> findAll() {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		List<Commande> list = session.createQuery("from Commande").list();
		Set<Commande> cmds = new HashSet<Commande>(list);
		return cmds;
	}

	@Override
	public Commande findOne(int id) {
		Session session=sessionFactory.openSession();
		Query query = session.createQuery("select c from Commande c where c.idcommande = :id");
		query.setParameter("id", id);
		List<Commande> cmds = query.list();
		if(cmds.isEmpty())
			return null;
		else
			return cmds.get(0);
	}

	@Override
	public int save(Commande cmd) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(cmd);
		tx.commit();
		session.close();
		return cmd.getIdcommande();
	}
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
}
