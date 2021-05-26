package javafxkolekcije;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ComboboxEntityDemo extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		ObservableList<ElementListe> options = 
			    FXCollections.observableArrayList(
			        new ElementListe("Opcija 1"),
			        new ElementListe("Opcija 2"),
			        new ElementListe("Opcija 3")
			    );
		ComboBox<ElementListe> comboBox = new ComboBox<ElementListe>(options);		
		
		
		Label label = new Label("Izaberite opciju:");
		
		HBox hbox = new HBox(5);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(label, comboBox);
		
		Scene scene = new Scene(hbox, 300, 250);	
    	primaryStage.setScene(scene);
    	primaryStage.show();

	}
}
