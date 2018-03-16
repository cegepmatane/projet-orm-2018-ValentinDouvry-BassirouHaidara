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
	
	public ControleurExoplanetes(VueExoplanetes vue)
	{
		this.listeExoplanete = new ArrayList<Exoplanete>();
		this.vueExoplanetes = vue;
		daoExoplanetes = new DaoExoplanetes();
		
		listeExoplanete = daoExoplanetes.RecupererExoplanetes();
		//vueExoplanetes.afficherListeExoplanete(listeExoplanete);
		
		
		
	}

}
