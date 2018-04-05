package ca.qc.cgmatane.informatique.exoplanete.modele;

import java.util.HashMap;
import java.util.Map.Entry;

import ca.qc.cgmatane.informatique.exoplanete.dao.DaoMemento;

public class MemoireExoplanete
{
	protected  DaoMemento daoMemento;
	protected HashMap<String,MementoExoplanete> listeExopanete;

	public MemoireExoplanete()
	{
		this.listeExopanete= new HashMap<String, MementoExoplanete>();
		this.daoMemento = new DaoMemento();
	}


	public void memoriser(MementoExoplanete memento)
	{
		this.listeExopanete.put(memento.exoplanete.getPlanete(), memento);
		daoMemento.sauvegarder(memento);
	}

	public HashMap<String,MementoExoplanete> getListe()
	{
		return listeExopanete;
	}

	public void setListe(HashMap<String,MementoExoplanete> listeExopanete)
	{
		this.listeExopanete = listeExopanete;
		for(Entry<String, MementoExoplanete> entreeEntry : listeExopanete.entrySet())
		{
			daoMemento.sauvegarder(entreeEntry.getValue());
		}
	}
}


