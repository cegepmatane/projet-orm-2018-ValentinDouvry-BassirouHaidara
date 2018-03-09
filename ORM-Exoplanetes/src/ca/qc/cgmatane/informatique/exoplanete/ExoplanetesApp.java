package ca.qc.cgmatane.informatique.exoplanete;

import ca.qc.cgmatane.informatique.exoplanete.vue.VueExoplanetes;

public class ExoplanetesApp {

	public static void main(String[] parametres) 
	{
		VueExoplanetes vueExoplanetes = new VueExoplanetes();
		vueExoplanetes.launch(VueExoplanetes.class, parametres);

		
	}

}
