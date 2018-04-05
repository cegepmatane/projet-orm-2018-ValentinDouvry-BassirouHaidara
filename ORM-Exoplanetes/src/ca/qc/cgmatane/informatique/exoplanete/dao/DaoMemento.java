package ca.qc.cgmatane.informatique.exoplanete.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import ca.qc.cgmatane.informatique.exoplanete.modele.MementoExoplanete;

public class DaoMemento
{

	public DaoMemento()
	{

	}

	public void sauvegarder(MementoExoplanete memento)
	{
		String chemin = memento.getExoplanete().getPlanete() + memento.getVersion() +".xml";
		String xml = "<memento><version>" + memento.getVersion() + "</version><exoplanete><planete>" + memento.getExoplanete().getPlanete() +"</planete></exoplanete></memento>";
		FileOutputStream flux = null;

		try {
			flux = new FileOutputStream(chemin);
			try {
				flux.write(xml.getBytes());
				flux.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
