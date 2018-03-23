package ca.qc.cgmatane.informatique.exoplaneteAdmin.vue;


import java.util.List;

import ca.qc.cgmatane.informatique.exoplaneteAdmin.action.ControleurExoplanetes;
import ca.qc.cgmatane.informatique.exoplaneteAdmin.modele.Exoplanete;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VueExoplanetes extends Application
{
	protected ControleurExoplanetes controleurExoplanetes;
	protected BorderPane racine;
 	protected String stringTest;
	protected Text texteExoplanetes;
	protected Button ajouter;
	protected Button quitter;
	
	//protected Button modifier;
	//protected Button effacer;
	protected ScrollPane scrollPane;
	protected Label secondFenetre;
	protected HBox hbox2;
	protected Scene sceneSecondaire;
	protected Stage fenetreAjouter;
	
	protected Label labelPlanete;
	protected Label labelEtoile;
	protected Label labelTypeEtoile;
	protected Label labelMasse;
	protected Label labelFlux;
	protected Label labelTemperature;
	protected Label labelPeriode;
	protected Label labelDistance;
	protected Label labelZone;
	protected Label labelDecouverte;
	
	
	public void start(Stage scenePrincipale)
	{
		//stringTest = "Hello word";
		this.racine = new BorderPane();
		this.scrollPane = new ScrollPane();
		
		this.ajouter = new Button("Ajouter");
		ajouter.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				controleurExoplanetes.ajouterExoplanete();						
			}
		});
		
		this.quitter = new Button("Quitter");
		quitter.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				controleurExoplanetes.fermerApplication();						
			}
		});
		HBox hBox = new HBox();
		hBox.getChildren().addAll(ajouter,quitter);
		this.racine.setTop(hBox);
		
		this.racine.setCenter(scrollPane);
		//texteExoplanetes = new Text();
		//texteExoplanetes.setText(stringTest);
		//racine.getChildren().add(texteExoplanetes);
		Scene scene = new Scene(racine, 500,500);
		scenePrincipale.setTitle("Exoplanetes-Admin");
		scenePrincipale.setScene(scene);
		scenePrincipale.setResizable(false);
		scenePrincipale.show();
		this.controleurExoplanetes = new ControleurExoplanetes(this);
		/*----------------------------------------------------------------*/
		//Fenetre Ajouter
		secondFenetre = new Label();
		hbox2 = new HBox();
		hbox2.getChildren().add(secondFenetre);
		sceneSecondaire = new Scene(hbox2,500,500);
		fenetreAjouter = new Stage();
		fenetreAjouter.setTitle("Fenetre Ajouter");
		fenetreAjouter.setScene(sceneSecondaire);
		 labelPlanete = new Label("Planete:");
		 labelEtoile = new Label("Etoile");
		 labelTypeEtoile = new Label("TypeEtoile");
		 labelMasse = new Label("Masse");
		 labelFlux = new Label("Flux");
		 labelTemperature = new Label("Temperature");
		 labelPeriode = new Label("Periode");
		 labelDistance = new Label("Distance");
		 labelZone = new Label("zone");
		 labelDecouverte = new Label("Decouverte");
		TextField planeTextField = new TextField();
		TextField etoileTextField = new TextField();
		TextField typeTextField = new TextField();
		TextField masseTextField = new TextField();
		TextField fluxTextField = new TextField();
		TextField temperatureTextField = new TextField();
		TextField periodeTextField = new TextField();
		TextField distanceTextField = new TextField();
		TextField zoneTextField = new TextField();
		TextField decouverteTextField = new TextField();
		
		hbox2.getChildren().addAll(labelPlanete,planeTextField);
		
		
		
		
		
		
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
		this.scrollPane.setContent(box);
		
		/*this.texteExoplanetes.setWrappingWidth(500);
		this.texteExoplanetes.setText(texte);*/	
		

	}
	public void ajouterExoplanete()
	{
		
	}
	
	public void afficherFenetreAjouter() 
	{
		fenetreAjouter.show();
	}
}
