package ca.qc.cgmatane.informatique.exoplanete.vue;


import ca.qc.cgmatane.informatique.exoplanete.action.ControleurExoplanetes;
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
		stringTest = "Hello word";
		
		this.racine = new StackPane();
		
		texteExoplanetes = new Text();
		texteExoplanetes.setText(stringTest);
		racine.getChildren().add(texteExoplanetes);
		Scene scene = new Scene(racine, 500,500);
		scenePrincipale.setTitle("Exoplanetes");
		scenePrincipale.setScene(scene);
		scenePrincipale.setResizable(false);
		scenePrincipale.show();
		this.controleur = new ControleurExoplanetes(this);
		
	}
}
