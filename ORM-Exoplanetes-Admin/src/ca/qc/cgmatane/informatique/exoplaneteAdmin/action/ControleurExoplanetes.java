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
	protected Exoplanete testExo1;
	
	public ControleurExoplanetes(VueExoplanetes vue)
	{
		this.listeExoplanete = new ArrayList<Exoplanete>();
		this.vueExoplanetes = vue;
		daoExoplanetes = new DaoExoplanetes();
		
		listeExoplanete = daoExoplanetes.RecupererExoplanetes();
		//vueExoplanetes.afficherListeExoplanete(listeExoplanete);
		
		/*testExo1 = new Exoplanete();
		testExo1.setPlanete("PlaneteTest");
		testExo1.setEtoile("etoile");
		testExo1.setMasse("masse");
		testExo1.setRayon("rayon");
		testExo1.setFlux("flux");
		
		
		
		
		
		daoExoplanetes.ajouterExoplanetes(testExo1);
		daoExoplanetes.fermer();*/
		
	}

}
