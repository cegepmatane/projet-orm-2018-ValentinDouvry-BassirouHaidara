package ca.qc.cgmatane.informatique.exoplanete.modele.filtrage;

import java.util.TreeMap;
import java.util.Map.Entry;

import ca.qc.cgmatane.informatique.exoplanete.modele.Exoplanete;

public class Vadeboncoeur extends Template {


	public Vadeboncoeur(TreeMap<String, Exoplanete> arbreExoplanete) {
		super(arbreExoplanete);

	}

	protected void trierHabitable()
	{
		for(Entry<String, Exoplanete> entreEntry : arbreExoplanete.entrySet())
		{
			Exoplanete exoplanete = entreEntry.getValue();
			int temperature = Integer.valueOf(exoplanete.getTemperature());
			if(temperature < 240)
				this.listeHabitable.add(exoplanete);


		}
	}
	protected void trierAtteignable()
	{
		for(Entry<String, Exoplanete> entreEntry : arbreExoplanete.entrySet())
		{
			Exoplanete exoplanete = entreEntry.getValue();
			float distance = 0;
			String distanceString = exoplanete.getDistance();

			if(distance < 20)
				this.listeAtteignable.add(exoplanete);

		}

	}
	protected void trierAnalysable()
	{

	}

}
