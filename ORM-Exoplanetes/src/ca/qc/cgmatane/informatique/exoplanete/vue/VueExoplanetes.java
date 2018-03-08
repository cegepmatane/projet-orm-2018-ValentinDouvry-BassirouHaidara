package ca.qc.cgmatane.informatique.exoplanete.vue;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class VueExoplanetes extends Application
{
	protected StackPane racine;
 	protected String stringTest;
	
	
	public void start(Stage scenePrincipale)
	{
		stringTest = "Hello word";
		
		this.racine = new StackPane();
		
	}
}
