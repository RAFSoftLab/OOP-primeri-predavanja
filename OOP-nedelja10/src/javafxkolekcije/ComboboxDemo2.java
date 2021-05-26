package javafxkolekcije;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboboxDemo2 extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		List<ElementCombo> options = new ArrayList<ElementCombo>();
		options.add(new ElementCombo("opcija", "1"));
		options.add(new ElementCombo("opcija", "2"));
		options.add(new ElementCombo("opcija", "3"));
		
		ObservableList<ElementCombo> optionsObservable = 
			    FXCollections.observableList(options);
		ComboBox<ElementCombo> comboBox = new ComboBox<ElementCombo>(optionsObservable);		
		
		Label label = new Label("Izaberite opciju:");
		
		HBox hbox = new HBox(5);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(label, comboBox);
		
		
		Label label1 = new Label("Novi:");
		TextField tf = new TextField();
		Button button = new Button("Promeni");
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {		
				/*
				ElementCombo ec = comboBox.getValue();
				comboBox.getItems().remove(ec);				
				ec.setElem1(tf.getText());
				comboBox.getItems().add(ec);
				comboBox.getSelectionModel().select(ec);
				System.out.println(comboBox.getItems());
			*/
			
				
				comboBox.getValue().setElem1(tf.getText());
				
				System.out.println(comboBox.getItems());
				
			
			}
		});
		
		
		HBox hbox1 = new HBox(5);
		hbox1.setAlignment(Pos.CENTER);
		
		hbox1.getChildren().addAll(label1, tf, button);
		
		VBox vbox = new VBox(5);
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(hbox, hbox1);
		
		Scene scene = new Scene(vbox, 300, 250);	
    	primaryStage.setScene(scene);
    	primaryStage.show();

	}

}
