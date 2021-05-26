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

public class ComboboxDemo extends Application {
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		ObservableList<String> options = 
			    FXCollections.observableArrayList(
			        "Opcija 1",
			        "Opcija 2",
			        "Opcija 3"
			    );
		ComboBox<String> comboBox = new ComboBox<String>(options);
		
		
		comboBox.getItems().addAll("Opcija 4" , "Opcija 5");
		
		comboBox.setValue("Opcija 4");
		
		comboBox.setVisibleRowCount(5);
		
		String s = comboBox.getValue();
		
		Label label = new Label("Izaberite opciju:");
		
		HBox hbox = new HBox(5);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(label, comboBox);
		
		Scene scene = new Scene(hbox, 300, 250);	
    	primaryStage.setScene(scene);
    	primaryStage.show();

	}

	

}
