package ca.qc.cgmatane.informatique.exoplanete.vue;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class VueExoplanetes extends Application
{
	protected StackPane racine;
 	protected List<String> listeTest;
	
	
	public void start(Stage scenePrincipale)
	{
		this.listeTest = new ArrayList<String>();
		listeTest.add("OUI");
		listeTest.add("NON");
		listeTest.add("Bonjour");
		listeTest.add("Coucou");
		listeTest.add("Salut");
		listeTest.add("OUI");
		listeTest.add("Yo");
		listeTest.add("Hello");
		
		this.racine = new StackPane();
		
	}
}
