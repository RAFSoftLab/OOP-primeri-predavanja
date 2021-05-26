package tabledemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/*
 * ucitavanje kontakata iz izabranog fajla
 */

public class FileChooserTableDemo extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {	 
	     stage.setTitle("Adresar");
	     stage.setWidth(250);
	     stage.setHeight(200);	     
	     
	     TableView<Kontakt> table = new TableView<Kontakt>();	     
	     TableColumn<Kontakt, String> imeCol = new TableColumn<Kontakt, String>("Ime");
	     TableColumn<Kontakt, String> prezimeCol = new TableColumn<Kontakt, String>("Prezime");
	     TableColumn<Kontakt, String> emailCol = new TableColumn<Kontakt, String>("Email");
	     table.getColumns().addAll(imeCol, prezimeCol, emailCol);
	     
	     imeCol.setCellValueFactory(new PropertyValueFactory<Kontakt, String>("ime"));
	     prezimeCol.setCellValueFactory(new PropertyValueFactory<Kontakt, String>("prezime"));
	     emailCol.setCellValueFactory(new PropertyValueFactory<Kontakt, String>("email"));
	     
	     FileChooser fileChooser = new FileChooser();
	     fileChooser.setTitle("Fajl sa kontaktima");
	     
	    
	     
	     Button openFileChooser = new Button("Pronadji fajl");
	     
	     openFileChooser.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				 File f =  fileChooser.showOpenDialog(stage);
				 List<Kontakt> kontakti = parseFileToKontakts(f);
				 table.setItems(FXCollections.observableArrayList(kontakti));
				 
				
			}
		});
	     
	     HBox hbox = new HBox(5); 
	     hbox.getChildren().add(openFileChooser);
	     
	     
	     VBox vbox = new VBox(5);
	     vbox.getChildren().addAll(table, hbox);	     
	     Scene scene = new Scene(vbox);
	     stage.setScene(scene);
	     stage.show();		
	}
	
	private static List<Kontakt> parseFileToKontakts(File f){
		List<Kontakt> retVal = new ArrayList<Kontakt>();
		try {
			Scanner fileScanner = new Scanner(f);
			while(fileScanner.hasNextLine()){
				String line = fileScanner.nextLine();
				String[] properties = line.split(",");
				Kontakt k = new Kontakt(properties[0], properties[1], properties[2]);
				retVal.add(k);
			}
			fileScanner.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return retVal;
	}


}
