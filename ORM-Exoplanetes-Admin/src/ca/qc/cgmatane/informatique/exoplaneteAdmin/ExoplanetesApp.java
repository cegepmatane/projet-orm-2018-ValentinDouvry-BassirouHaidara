package ca.qc.cgmatane.informatique.exoplaneteAdmin;

import ca.qc.cgmatane.informatique.exoplaneteAdmin.vue.VueExoplanetes;

public class ExoplanetesApp {

	public static void main(String[] parametres) 
	{
		VueExoplanetes vueExoplanetes = new VueExoplanetes();
		vueExoplanetes.launch(VueExoplanetes.class, parametres);

		
	}

}
