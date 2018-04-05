package ca.qc.cgmatane.informatique.exoplanete.modele.filtrage;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import ca.qc.cgmatane.informatique.exoplanete.modele.Exoplanete;

public abstract class Template {

		protected TreeMap<String, Exoplanete> arbreExoplanete;
		protected List<Exoplanete> listeHabitable;
		protected	List<Exoplanete> listeAtteignable;
		protected	List<Exoplanete> listeAnalysable;
		protected abstract void trierHabitable();
		protected abstract void trierAtteignable();
		protected abstract void trierAnalysable();


		public Template(TreeMap<String, Exoplanete> arbreExoplanete)
		{
			this.arbreExoplanete = arbreExoplanete;
			listeHabitable = new ArrayList<Exoplanete>();
			listeAtteignable = new ArrayList<Exoplanete>();
			listeAnalysable = new ArrayList<Exoplanete>();
		}
		public void effectuerTriallage()
		{
			trierAnalysable();
			trierAtteignable();
			trierAnalysable();
		}

		public List<Exoplanete> getListeHabitable() {
			return listeHabitable;
		}

		public List<Exoplanete> getListeAtteignable() {
			return listeAtteignable;
		}


		public List<Exoplanete> getListeAnalysable()
		{
			return listeAnalysable;
		}


}
