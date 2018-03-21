package ma.ensa.dao;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.ensa.model.Produit;

@Repository(value="produitDao")
public class ProduitDao implements ProduitDaoImpl{

	SessionFactory sessionFactory;
	
	@Override
	public Set<Produit> findAll() {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		List<Produit> list = session.createQuery("from Produit").list();
		Set<Produit> prds = new HashSet<Produit>(list);

		session.close();
		return prds;
	}

	@Override
	public Produit findOne(Long id) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Query query = session.createQuery("select p from Produit p where p.idproduit = :id");
		query.setParameter("id", id);
		List<Produit> prds = query.list();
		if(prds.isEmpty())
			return null;
		else
			return prds.get(0);
	}

	@Override
	public int save(Produit prd) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try{
	    session.save(prd);
	    tx.commit();
		session.close();
		}
		catch (Exception e){
			return 0;
			
		}
		
		return 1;
	}
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
