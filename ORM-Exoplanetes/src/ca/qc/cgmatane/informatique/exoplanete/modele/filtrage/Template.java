package ca.qc.cgmatane.informatique.exoplanete.modele.filtrage;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import ca.qc.cgmatane.informatique.exoplanete.modele.Exoplanete;

public abstract class Template {

		TreeMap<String, Exoplanete> arbreExoplanete;
		List<Exoplanete> listeHabitable;
		List<Exoplanete> listeAtteignable;
		List<Exoplanete> listeAnalysable;

		public Template(TreeMap<String, Exoplanete> arbreExoplanete)
		{
			this.arbreExoplanete = arbreExoplanete;
			listeHabitable = new ArrayList<Exoplanete>();
			listeAtteignable = new ArrayList<Exoplanete>();
			listeAnalysable = new ArrayList<Exoplanete>();
		}
		public void effectuerTriallage()
		{

		}


}
