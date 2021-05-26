package tabledemo;



import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DataModelTableDemo extends Application {
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {	 
	     stage.setTitle("Adresar");
	     stage.setWidth(250);
	     stage.setHeight(200);
	     
	     
	     TableView<Kontakt> table = new TableView<Kontakt>();
	     ObservableList<Kontakt> kontakti = FXCollections.observableArrayList(
	    		 new Kontakt("Milica", "Markovic", "mm@edu.rs"),
	    		 new Kontakt("Dejan", "Markovic", "dm@edu.rs"),
	    		 new Kontakt("Katarina", "Popovic", "kp@edu.rs"),
	    		 new Kontakt("Milos", "Jankovic", "mj@edu.rs"));
	     table.setItems(kontakti);
	     
	    
	     
	     TableColumn<Kontakt, String> imeCol = new TableColumn<Kontakt, String>("Ime");
	     TableColumn<Kontakt, String> prezimeCol = new TableColumn<Kontakt, String>("Prezime");
	     TableColumn<Kontakt, String> emailCol = new TableColumn<Kontakt, String>("Email");
	     table.getColumns().add(imeCol);
	     table.getColumns().add(prezimeCol);
	     table.getColumns().add(emailCol);
	     
	     imeCol.setCellValueFactory(new PropertyValueFactory<Kontakt, String>("ime"));
	     prezimeCol.setCellValueFactory(new PropertyValueFactory<Kontakt, String>("prezime"));
	     emailCol.setCellValueFactory(new PropertyValueFactory<Kontakt, String>("email"));
	     
	    
	     
	     
	     
	     Scene scene = new Scene(table);
	     
	     
	     stage.setScene(scene);
	     stage.show();		
	}

}
