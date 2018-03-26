package ca.qc.cgmatane.informatique.exoplaneteAdmin.vue;


import java.util.List;

import ca.qc.cgmatane.informatique.exoplaneteAdmin.action.ControleurExoplanetes;
import ca.qc.cgmatane.informatique.exoplaneteAdmin.modele.Exoplanete;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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
	protected Button enregister;

	protected ScrollPane scrollPane;
	protected Label secondFenetre;
	protected GridPane gridPane;
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
	protected TextField planeTextField;
	protected TextField etoileTextField;
	protected TextField typeTextField;
	protected TextField masseTextField;
	protected TextField fluxTextField;
	protected TextField temperatureTextField ;
	protected TextField periodeTextField;
	protected TextField distanceTextField;
	protected TextField zoneTextField;
	protected TextField decouverteTextField;


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
		gridPane = new GridPane();
		gridPane.getChildren().add(secondFenetre);
		sceneSecondaire = new Scene(gridPane,500,500);
		fenetreAjouter = new Stage();
		fenetreAjouter.setTitle("Fenetre Ajouter");
		fenetreAjouter.setScene(sceneSecondaire);
		enregister = new Button("Enregistrer");
		GridPane.setConstraints(enregister, 2, 2, 1, 1,HPos.CENTER, VPos.BOTTOM, null, null);
		gridPane.getChildren().add(enregister);
		enregister.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				controleurExoplanetes.enregistrerExoplanete();
				fenetreAjouter.close();
			}
		});

		 labelPlanete = new Label("Planete");
		 labelEtoile = new Label("Etoile");
		 labelTypeEtoile = new Label("TypeEtoile");
		 labelMasse = new Label("Masse");
		 labelFlux = new Label("Flux");
		 labelTemperature = new Label("Temperature");
		 labelPeriode = new Label("Periode");
		 labelDistance = new Label("Distance");
		 labelZone = new Label("zone");
		 labelDecouverte = new Label("Decouverte");
		 planeTextField = new TextField();
		 etoileTextField = new TextField();
		 typeTextField = new TextField();
		 masseTextField = new TextField();
		 fluxTextField = new TextField();
		 temperatureTextField = new TextField();
		 periodeTextField = new TextField();
		 distanceTextField = new TextField();
		 zoneTextField = new TextField();
		 decouverteTextField = new TextField();


		 gridPane.setPadding(new Insets(15,15,15,15));
		 gridPane.setVgap(5);
		 gridPane.setHgap(5);

		 gridPane.setConstraints(planeTextField,0,0);
		 gridPane.getChildren().add(planeTextField);
		 gridPane.setConstraints(labelPlanete,1,0);
		 gridPane.getChildren().add(labelPlanete);

		 gridPane.setConstraints(etoileTextField,0,1);
		 gridPane.getChildren().add(etoileTextField);
		 gridPane.setConstraints(labelEtoile,1,1);
		 gridPane.getChildren().add(labelEtoile);


	     gridPane.setConstraints(typeTextField,0,2);
		 gridPane.getChildren().add(typeTextField);
		 gridPane.setConstraints(labelTypeEtoile,1,2);
		 gridPane.getChildren().add(labelTypeEtoile);


		 gridPane.setConstraints(masseTextField,0,3);
		 gridPane.getChildren().add(masseTextField);
		 gridPane.setConstraints(labelMasse,1,3);
		 gridPane.getChildren().add(labelMasse);


		 gridPane.setConstraints(fluxTextField,0,4);
		 gridPane.getChildren().add(fluxTextField);
		 gridPane.setConstraints(labelFlux,1,4);
		 gridPane.getChildren().add(labelFlux);


		 gridPane.setConstraints(temperatureTextField,0,5);
		 gridPane.getChildren().add(temperatureTextField);
		 gridPane.setConstraints(labelTemperature,1,5);
		 gridPane.getChildren().add(labelTemperature);


		 gridPane.setConstraints(periodeTextField,0,6);
		 gridPane.getChildren().add(periodeTextField);
		 gridPane.setConstraints(labelPeriode,1,6);
		 gridPane.getChildren().add(labelPeriode);

		 gridPane.setConstraints(distanceTextField,0,7);
		 gridPane.getChildren().add(distanceTextField);
		 gridPane.setConstraints(labelDistance,1,7);
		 gridPane.getChildren().add(labelDistance);

		 gridPane.setConstraints(zoneTextField,0,8);
		 gridPane.getChildren().add(zoneTextField);
		 gridPane.setConstraints(labelZone,1,8);
		 gridPane.getChildren().add(labelZone);

		 gridPane.setConstraints(decouverteTextField,0,9);
		 gridPane.getChildren().add(decouverteTextField);
		 gridPane.setConstraints(labelDecouverte,1,9);
		 gridPane.getChildren().add(labelDecouverte);



	}

	public void afficherListeExoplanete(List<Exoplanete> listExoplanete)
	{

		VBox box = new VBox();
		for (Exoplanete exoplanete : listExoplanete) {
			HBox hBox = new HBox();
			Text nomPlanete = new Text();
			String texte = "";
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
			hBox.getChildren().addAll(nomPlanete, supprimer);
			box.getChildren().add(hBox);

		}
		this.scrollPane.setContent(box);

		/*this.texteExoplanetes.setWrappingWidth(500);
		this.texteExoplanetes.setText(texte);*/


	}
	public Exoplanete ajouterExoplanete()
	{
		Exoplanete exoplanete = new Exoplanete();
		exoplanete.setPlanete(planeTextField.getText());
		exoplanete.setEtoile(etoileTextField.getText());
		exoplanete.setTypeEtoile(typeTextField.getText());
		exoplanete.setMasse(masseTextField.getText());
		exoplanete.setFlux(fluxTextField.getText());
		exoplanete.setTemperature(temperatureTextField.getText());
		exoplanete.setPeriode(periodeTextField.getText());
		exoplanete.setDistance(distanceTextField.getText());
		exoplanete.setZone(zoneTextField.getText());
		exoplanete.setDecouverte(decouverteTextField.getText());
		return exoplanete;
	}

	public void afficherFenetreAjouter()
	{
		fenetreAjouter.show();
	}
}
