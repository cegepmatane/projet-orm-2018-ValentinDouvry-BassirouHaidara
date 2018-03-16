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
		
		
		/*------------------------------------------------------*/
		// Exoplanete Test pour fonction ajouter dans DAO
		testExo1 = new Exoplanete();
		testExo1.setPlanete("PlaneteTest");
		testExo1.setEtoile("etoile");
		testExo1.setTypeEtoile("G");
		testExo1.setMasse("masse");
		testExo1.setRayon("rayon");
		testExo1.setFlux("flux");
		testExo1.setTemperature("Temperature");
		testExo1.setPeriode("periode");
		testExo1.setDistance("distance");
		testExo1.setZone("zone");
		testExo1.setIst(0);
		testExo1.setSph(0);
		testExo1.setHzd("hzd");
		testExo1.setHzc("hzc");
		testExo1.setHza("hza");
		testExo1.setpClasse("pClasse");
		testExo1.sethClasse("hclasse");
		testExo1.setPhi(0);
		testExo1.setDistance2("distance2");
		testExo1.setStatus("status");
		testExo1.setDecouverte("decouverte");
		
		daoExoplanetes.ajouterExoplanetes(testExo1);
		daoExoplanetes.fermer();
		
		/*-------------------------------------------*/
		
		
	}

}
