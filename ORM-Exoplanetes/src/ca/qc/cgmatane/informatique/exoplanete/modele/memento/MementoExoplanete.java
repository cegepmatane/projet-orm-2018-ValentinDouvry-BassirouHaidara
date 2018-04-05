package ca.qc.cgmatane.informatique.exoplanete.modele.memento;

import ca.qc.cgmatane.informatique.exoplanete.modele.Exoplanete;

public class MementoExoplanete
{

	protected Exoplanete exoplanete;
	protected int version;
	protected int hash;

	static protected int versionActuelle = 0;

	public MementoExoplanete(Exoplanete original)
	{
		this.exoplanete = new Exoplanete();
		this.version = versionActuelle++;
		this.hash = this.exoplanete.hashCode();
	}

	public Exoplanete getExoplanete() {
		return exoplanete ;
	}

	public int getVersion() {
		return version;
	}


	public int getHash() {
		return hash;
	}
}
