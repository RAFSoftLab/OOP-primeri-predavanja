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

public class ComboboxDemo1 extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		List<String> options = new ArrayList<String>();
		options.add("opcija 1");
		options.add("opcija 2");
		options.add("opcija 3");
		
		ObservableList<String> optionsObservable = 
			    FXCollections.observableList(options);
		ComboBox<String> comboBox = new ComboBox<String>(optionsObservable);		
		
		Label label = new Label("Izaberite opciju:");
		
		HBox hbox = new HBox(5);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(label, comboBox);
		
		
		Label label1 = new Label("Novi:");
		TextField tf = new TextField();
		Button button = new Button("Dodaj");
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				optionsObservable.add(tf.getText());
				//options.add(tf.getText());
				System.out.println(optionsObservable);
				
				
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
