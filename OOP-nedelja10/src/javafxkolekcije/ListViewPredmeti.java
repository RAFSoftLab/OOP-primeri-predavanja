package javafxkolekcije;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ListViewPredmeti extends Application {

	private static List<Student> studenti = new ArrayList<Student>();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
				
		
		
		Label l = new Label("Ime i prezime studenta:");
		TextField tf = new TextField();
		
		HBox hbox = new HBox(10);
		hbox.setAlignment(Pos.BASELINE_LEFT);
		
		hbox.getChildren().add(l);
		hbox.getChildren().add(tf);
		
		VBox vbox = new VBox(5);
		vbox.setAlignment(Pos.TOP_LEFT);
		vbox.setPadding(new Insets(0, 0, 0, 30));
		vbox.getChildren().add(hbox);
		
		
		List<Predmet> predmeti = kreirajListuPredmeta();
		
		ListView<Predmet> listViewPredmeti = new ListView<Predmet>();
		ObservableList<Predmet> predmetiOl = FXCollections.observableList(predmeti);
		listViewPredmeti.getItems().addAll(predmetiOl);
		listViewPredmeti.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		vbox.getChildren().add(listViewPredmeti);
		
		 
		Scene scene = new Scene(vbox, 400, 300);
		primaryStage.setScene(scene);
		
		
		
		Button bSacuvaj = new Button("Sacuvaj");
		Button bIspisi = new Button("Ispisi sve");
		
		HBox buttons = new HBox(5);
		
		buttons.getChildren().addAll(bSacuvaj, bIspisi);
		
		
		
		vbox.getChildren().add(buttons);
		
		bSacuvaj.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String imeiPrezime = tf.getText();
				Student s = new Student(imeiPrezime);
				
				s.setPredmeti(listViewPredmeti.getSelectionModel().getSelectedItems());
				
				studenti.add(s);				
			}
		});	
		
		bIspisi.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				for(Student s:studenti){
					System.out.println(s.getImeIPrezime());
					System.out.println("Predmeti:");
					for(Predmet p:s.getPredmeti())
						System.out.println(p.getNazivPredmeta());
				}
			}
		});	 
		
		
		
		primaryStage.show();
		
		
	}
	
	private static List<Predmet> kreirajListuPredmeta(){
		List<Predmet> predmeti = new ArrayList<Predmet>();
		predmeti.add(new Predmet("Uvod u programiranje"));
		predmeti.add(new Predmet("Objektno-orijentisano programiranje"));
		predmeti.add(new Predmet("Analiza"));
		predmeti.add(new Predmet("Engleski jezik"));
		predmeti.add(new Predmet("Uvod u programiranje"));
		predmeti.add(new Predmet("Objektno-orijentisano programiranje"));
		predmeti.add(new Predmet("Analiza"));
		predmeti.add(new Predmet("Engleski jezik"));
		predmeti.add(new Predmet("Uvod u programiranje"));
		predmeti.add(new Predmet("Objektno-orijentisano programiranje"));
		predmeti.add(new Predmet("Analiza"));
		predmeti.add(new Predmet("Engleski jezik"));
		return predmeti;
	}


}
