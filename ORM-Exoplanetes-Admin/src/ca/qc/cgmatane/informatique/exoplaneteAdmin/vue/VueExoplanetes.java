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

import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VueExoplanetes extends Application
{
	protected ControleurExoplanetes controleur;
	protected StackPane racine;
 	protected String stringTest;
	protected Text texteExoplanetes;
	protected Button ajouter ;
	protected Button modifier ;
	protected Button effacer ;

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
		ajouter = new Button();
		ajouter.setTranslateX(-20);
		ajouter.setTranslateY(-10);



		modifier = new Button();
		modifier.setTranslateX(-20);
		modifier.setTranslateY(20);
		effacer = new Button();
		effacer.setTranslateX(-20);
		effacer.setTranslateY(50);
		ajouter.setText("Ajouter");
		modifier.setText("Modifier");
		effacer.setText("Effacer");
		racine.getChildren().addAll(ajouter,modifier,effacer);
	//Action du click sur le bouton ajouter
		ajouter.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)

			{


				System.out.println("test");

			}




		});

		//Action du click sur le bouton modifier
				modifier.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent event)

					{


						System.out.println("test");

					}




				});

				//Action du click sur le bouton effacer
				effacer.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent event)

					{


						System.out.println("test");

					}




				});










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
