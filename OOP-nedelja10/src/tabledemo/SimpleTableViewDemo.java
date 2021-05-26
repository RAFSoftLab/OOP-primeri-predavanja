package tabledemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class SimpleTableViewDemo extends Application{
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {	 
	     stage.setTitle("Adresar");
	     stage.setWidth(250);
	     stage.setHeight(200);
	     TableView table = new TableView();
	     TableColumn imeCol = new TableColumn("Ime");
	     TableColumn prezimeCol = new TableColumn("Prezime");
	     TableColumn emailCol = new TableColumn("Email");
	     table.getColumns().addAll(imeCol, prezimeCol, emailCol);
	     Scene scene = new Scene(table);
	     stage.setScene(scene);
	     stage.show();		
	}

}
