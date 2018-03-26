package ca.qc.cgmatane.informatique.exoplaneteAdmin.action;

import java.util.ArrayList;
import java.util.List;

import ca.qc.cgmatane.informatique.exoplaneteAdmin.dao.DaoExoplanetes;
import ca.qc.cgmatane.informatique.exoplaneteAdmin.modele.Exoplanete;
import ca.qc.cgmatane.informatique.exoplaneteAdmin.vue.VueExoplanetes;

public class ControleurExoplanetes {

	protected VueExoplanetes vueExoplanetes;
	protected DaoExoplanetes daoExoplanetes;
	protected List<Exoplanete> listeExoplanete;
	public Exoplanete testExo1;

	public ControleurExoplanetes(VueExoplanetes vue)
	{
		this.listeExoplanete = new ArrayList<Exoplanete>();
		this.vueExoplanetes = vue;
		daoExoplanetes = new DaoExoplanetes();

		listeExoplanete = daoExoplanetes.RecupererExoplanetes();
		vueExoplanetes.afficherListeExoplanete(listeExoplanete);


		/*------------------------------------------------------*/
		// Exoplanete Test pour fonction ajouter dans DAO
		testExo1 = new Exoplanete();
		//daoExoplanetes.ajouterExoplanetes(testExo1);
		//daoExoplanetes.supprimerExoplanetes(testExo1);
		//daoExoplanetes.fermer();
		/*-------------------------------------------*/


	}

	public void supprimerExoplanete(Exoplanete exoplanete)
	{
		daoExoplanetes.supprimerExoplanetes(exoplanete);

	}

	public void ajouterExoplanete()
	{
		vueExoplanetes.afficherFenetreAjouter();
		
	}
	
	public void enregistrerExoplanete()
	{	
		Exoplanete exoplanete;
		exoplanete = vueExoplanetes.ajouterExoplanete();
		daoExoplanetes.ajouterExoplanetes(exoplanete);
		//System.out.println(exoplanete.getPlanete());
	}

	public void modifierExoplanete(Exoplanete exoplanete)
	{

	}

	public void fermerApplication()
	{
		System.exit(0);
	}
}
