package listviewcellfactory;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Artikal;
import model.Podaci;

public class ListViewEntityDemo extends Application {

	public static void main(String[] args) {	
		launch(args);

}

@Override
public void start(Stage primaryStage) throws Exception {
	
	
	
	ListView<Artikal> list = new ListView<Artikal>();	
	ObservableList<Artikal> items =FXCollections.observableList(Podaci.getInstance().getArtikli());
	
		  
	list.setItems(items);	

	
	
	// preuzimanje selekcije	
	Button ispisiSelektovaneB = new Button("Ispisi selekciju");
	
	ispisiSelektovaneB.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {			
			System.out.println("Selektovani element: "+list.getSelectionModel().getSelectedItem());
			
		}
	});
	
	TextField filterTf = new TextField();
	filterTf.setOnKeyTyped(ke -> {
		String enteredText = filterTf.getText();
		ObservableList<Artikal> filteredList = FXCollections.observableArrayList();
		for(Artikal a:Podaci.getInstance().getArtikli()) {
			if(a.toString().contains(enteredText))
				filteredList.add(a);			
		}
		list.setItems(filteredList);
		
	});
	
	
	VBox vbox = new VBox(5);
	vbox.setAlignment(Pos.CENTER);
	vbox.setPadding(new Insets(10));
	vbox.getChildren().addAll(filterTf,list, ispisiSelektovaneB);
	
	Scene scene = new Scene(vbox, 400, 550);	
	primaryStage.setScene(scene);
	primaryStage.show();
	
	
	
}
}
