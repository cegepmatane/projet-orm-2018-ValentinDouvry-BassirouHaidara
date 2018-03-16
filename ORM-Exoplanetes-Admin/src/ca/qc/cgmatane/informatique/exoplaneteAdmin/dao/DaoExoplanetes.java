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
	List<Exoplanete> listeExoplanete;
	public DaoExoplanetes()
	{
		listeExoplanete = new ArrayList<Exoplanete>();
	}

	public List<Exoplanete> RecupererExoplanetes()
	{
		
		Configuration configuration = new Configuration();
		configuration.addClass(Exoplanete.class);
		SessionFactory sessionControleur = configuration.buildSessionFactory();
		Session session = sessionControleur.openSession();
		
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
		
		session.close();
		sessionControleur.close();
		return listeExoplanete;
		
	}
}
