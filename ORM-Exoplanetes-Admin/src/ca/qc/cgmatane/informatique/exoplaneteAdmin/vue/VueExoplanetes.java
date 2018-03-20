package ca.qc.cgmatane.informatique.exoplaneteAdmin.vue;


import java.util.List;

import ca.qc.cgmatane.informatique.exoplaneteAdmin.action.ControleurExoplanetes;
import ca.qc.cgmatane.informatique.exoplaneteAdmin.modele.Exoplanete;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VueExoplanetes extends Application
{
	protected ControleurExoplanetes controleurExoplanetes;
	protected StackPane racine;
 	protected String stringTest;
	protected Text texteExoplanetes;
	//protected Button ajouter;
	//protected Button modifier;
	//protected Button effacer;

	public void start(Stage scenePrincipale)
	{
		//stringTest = "Hello word";

		this.racine = new StackPane();

		//texteExoplanetes = new Text();
		//texteExoplanetes.setText(stringTest);
		//racine.getChildren().add(texteExoplanetes);
		Scene scene = new Scene(racine, 500,500);
		scenePrincipale.setTitle("Exoplanetes-Admin");
		scenePrincipale.setScene(scene);
		scenePrincipale.setResizable(false);
		scenePrincipale.show();
		this.controleurExoplanetes = new ControleurExoplanetes(this);
	}

	public void afficherListeExoplanete(List<Exoplanete> listExoplanete)
	{
				
		VBox box = new VBox();
		for (Exoplanete exoplanete : listExoplanete) {
			HBox hBox = new HBox();
			Text nomPlanete = new Text();
			String texte = "";
			Button modifier = new Button("Modifier");
			modifier.setOnAction(new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent event)
				{
					controleurExoplanetes.modifierExoplanete(exoplanete);
				}
			});
			Button supprimer = new Button("Supprimer");
			supprimer.setOnAction(new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent event)
				{
					controleurExoplanetes.supprimerExoplanete(exoplanete);
				}
			});
			texte = exoplanete.getPlanete();
			nomPlanete.setText(texte);
			hBox.getChildren().addAll(nomPlanete, modifier, supprimer);
			box.getChildren().add(hBox);
			
		}
		this.racine.getChildren().add(box);
		
		/*this.texteExoplanetes.setWrappingWidth(500);
		this.texteExoplanetes.setText(texte);*/	
		

	}
}
