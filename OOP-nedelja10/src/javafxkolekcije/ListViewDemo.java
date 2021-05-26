package javafxkolekcije;

import java.util.Collections;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewDemo extends Application {

	public static void main(String[] args) {	
		launch(args);

}

@Override
public void start(Stage primaryStage) throws Exception {
	
	
	
	ListView<String> list = new ListView<String>();	
	
	
	ObservableList<String> items =FXCollections.observableArrayList (
		    "Jednokrevetna", "Dvokrevetna", "Studio", "Porodicni apartman");
	list.setItems(items);
	Collections.sort(items);

	
	
	// preuzimanje selekcije	
	Button ispisiSelektovaneB = new Button("Ispisi selekciju");
	
	ispisiSelektovaneB.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {			
			System.out.println("Selektovani element: "+list.getSelectionModel().getSelectedItem());
			
		}
	});
	
	VBox vbox = new VBox(5);
	vbox.setAlignment(Pos.CENTER);
	vbox.getChildren().addAll(list, ispisiSelektovaneB);
	
	Scene scene = new Scene(vbox, 300, 250);	
	primaryStage.setScene(scene);
	primaryStage.show();
	
	
	
}
}
