package ca.qc.cgmatane.informatique.exoplaneteAdmin.vue;


import java.util.List;

import ca.qc.cgmatane.informatique.exoplaneteAdmin.action.ControleurExoplanetes;
import ca.qc.cgmatane.informatique.exoplaneteAdmin.modele.Exoplanete;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VueExoplanetes extends Application
{
	protected ControleurExoplanetes controleur;
	protected StackPane racine;
 	protected String stringTest;
	protected Text texteExoplanetes;
	
	public void start(Stage scenePrincipale)
	{
		//stringTest = "Hello word";
		
		this.racine = new StackPane();
		
		texteExoplanetes = new Text();
		texteExoplanetes.setText(stringTest);
		racine.getChildren().add(texteExoplanetes);
		Scene scene = new Scene(racine, 500,500);
		scenePrincipale.setTitle("Exoplanetes-Admin");
		scenePrincipale.setScene(scene);
		scenePrincipale.setResizable(false);
		scenePrincipale.show();
		this.controleur = new ControleurExoplanetes(this);
		
	}
	
	public void afficherListeExoplanete(List<Exoplanete> listExoplanete)
	{
		String texte = "";
		for (Exoplanete exoplanete : listExoplanete) {
			texte+=exoplanete.getPlanete();
			texte+= " - ";
		}
		this.texteExoplanetes.setWrappingWidth(500);
		this.texteExoplanetes.setText(texte);
		
	}
}
