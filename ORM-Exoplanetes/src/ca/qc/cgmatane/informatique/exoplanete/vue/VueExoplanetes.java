package ca.qc.cgmatane.informatique.exoplanete.vue;


import java.util.List;

import ca.qc.cgmatane.informatique.exoplanete.action.ControleurExoplanetes;
import ca.qc.cgmatane.informatique.exoplanete.modele.Exoplanete;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VueExoplanetes extends Application
{
	protected ControleurExoplanetes controleur;
	protected BorderPane racine;
 	protected String stringTest;
	protected Text texteExoplanetes;
	protected Tab ongletListeExoplanete ;
	protected Tab ongletMarquePage ;
	protected Tab ongletRecherche;
	protected Text texteListeExoplanete;
	protected Text textMarquePage;
	protected Text textRecherche;
	protected TabPane ongleTabPane;
	protected ScrollPane scrollPane;

	public void start(Stage scenePrincipale)
	{
		//stringTest = "Hello word";

		this.racine = new BorderPane();
		ongleTabPane = new TabPane();
		ongletListeExoplanete = new Tab("ListeExoplanete");
		ongletMarquePage = new Tab("MarquePage");
		ongletRecherche = new Tab("Recherche");
		ongleTabPane.getTabs().add(ongletListeExoplanete);
		ongleTabPane.getTabs().add(ongletMarquePage);
		ongleTabPane.getTabs().add(ongletRecherche);
		racine.setTop(ongleTabPane);
		
		this.scrollPane = new ScrollPane();

		this.racine.setCenter(scrollPane);
		 
		Scene scene = new Scene(racine, 500,500);
		scenePrincipale.setTitle("Exoplanetes");
		scenePrincipale.setScene(scene);
		scenePrincipale.setResizable(false);
		scenePrincipale.show();
		this.controleur = new ControleurExoplanetes(this);

	}

	public void afficherListeExoplanete(List<Exoplanete> listExoplanete)
	{
		VBox box = new VBox();
		for (Exoplanete exoplanete : listExoplanete) {
			HBox hBox = new HBox();
			Text nomPlanete = new Text();
			String texte = "";
			texte = exoplanete.getPlanete();
			nomPlanete.setText(texte);
			hBox.getChildren().addAll(nomPlanete);
			box.getChildren().add(hBox);

		}
		this.scrollPane.setContent(box);
	}
}