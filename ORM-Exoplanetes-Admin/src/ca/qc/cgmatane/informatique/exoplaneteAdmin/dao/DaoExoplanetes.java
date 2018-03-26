package ca.qc.cgmatane.informatique.exoplaneteAdmin.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ca.qc.cgmatane.informatique.exoplaneteAdmin.modele.Exoplanete;

public class DaoExoplanetes
{
	//test
	private List<Exoplanete> listeExoplanete;
	private Session session;
	private SessionFactory sessionControleur;
	
	public DaoExoplanetes()
	{
		listeExoplanete = new ArrayList<Exoplanete>();
		
		Configuration configuration = new Configuration();
		configuration.addClass(Exoplanete.class);
		sessionControleur = configuration.buildSessionFactory();
		session = sessionControleur.openSession();
	}

	public List<Exoplanete> RecupererExoplanetes()
	{
		Transaction operation = null;
		try
		{
			operation = session.beginTransaction();

		}
		catch (Exception e) {
			if(operation != null )  operation.rollback();

		}

		@SuppressWarnings("deprecation")
		Iterator visiteurExoplanete = session.createQuery("FROM Exoplanete").iterate();

		while(visiteurExoplanete.hasNext())
		{
			Exoplanete exoplanete = (Exoplanete) visiteurExoplanete.next();
			//System.out.println(exoplanete.getPlanete());
			listeExoplanete.add(exoplanete);
		}
		
		return listeExoplanete;
	}
	
	public void ajouterExoplanetes(Exoplanete exoplanete)
	{
		session.save(exoplanete);
	}
	
	public void supprimerExoplanetes(Exoplanete exoplanete)
	{
		Transaction transaction = session.getTransaction();
		session.delete(exoplanete);
		transaction.commit();
	}
	
	public void fermer()
	{
		// Nettoyage final (une seule fois)
		session.close();
		sessionControleur.close();
		
	}
}
