package ca.qc.cgmatane.informatique.exoplanete.modele;

import java.util.HashMap;

public class MemoireExoplanete
{
	HashMap<Integer,MementoExoplanete> listeExopanete = null;

	public MemoireExoplanete()
	{
		this.listeExopanete= new HashMap<Integer, MementoExoplanete>();
	}

	public void memoriser(MementoExoplanete memento)
	{
		this.listeExopanete.put(memento.getVersion(), memento);
	}

	public MementoExoplanete retrouver(int version)
	{
		return this.listeExopanete.get(version);
	}

}
