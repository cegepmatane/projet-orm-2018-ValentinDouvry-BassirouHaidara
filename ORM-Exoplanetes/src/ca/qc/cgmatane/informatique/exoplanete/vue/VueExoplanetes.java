package ca.qc.cgmatane.informatique.exoplanete.vue;


import java.util.List;

import ca.qc.cgmatane.informatique.exoplanete.action.ControleurExoplanetes;
import ca.qc.cgmatane.informatique.exoplanete.modele.Exoplanete;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VueExoplanetes extends Application
{
	protected ControleurExoplanetes controleur;
	protected StackPane racine;
 	protected String stringTest;
	protected Text texteExoplanetes;
	protected Tab ongletListeExoplanete ;
	protected Tab ongletMarquePage ;
	protected Tab ongletRecherche;
	protected Text texteListeExoplanete;
	protected Text textMarquePage;
	protected Text textRecherche;
	protected TabPane ongleTabPane;

	public void start(Stage scenePrincipale)
	{
		//stringTest = "Hello word";

		this.racine = new StackPane();
		 ongleTabPane = new TabPane();
		 ongletListeExoplanete = new Tab("ListeExoplanete");
		 ongletMarquePage = new Tab("MarquePage");
		 ongletRecherche = new Tab("Recherche");
		 ongleTabPane.getTabs().add(ongletListeExoplanete);
		 ongleTabPane.getTabs().add(ongletMarquePage);
		 ongleTabPane.getTabs().add(ongletRecherche);
		 racine.getChildren().add(ongleTabPane);
		 
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
