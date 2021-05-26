package treedemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;
import tabledemo.Kontakt;


public class TreeDemoApp extends Application {
	
	public static void main(String[] args){
		launch(args);
	}
	
	
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
		 stage.setTitle("Adresar");
	     stage.setWidth(250);
	     stage.setHeight(200);
	     
	     
	     TreeView<String> stablo = new TreeView<String>(); 
	     TreeItem<String> koren =  new TreeItem<String>("Kontakti");
	     stablo.setRoot(koren);
	     TreeItem<String> privatni = new TreeItem<String>("Privatni");
	     koren.getChildren().add(privatni);
	     TreeItem<String> poslovni = new TreeItem<String>("Poslovni");
	     koren.getChildren().add(poslovni);
	     List<Kontakt> kontakti = Arrays.asList(new Kontakt("Milica", "Markovic", "mm@edu.rs"),
	    		 new Kontakt("Dejan", "Markovic", "dm@edu.rs"),
	    		 new Kontakt("Katarina", "Popovic", "kp@edu.rs"),
	    		 new Kontakt("Milos", "Jankovic", "mj@edu.rs"));	    		
	     for(Kontakt kb:kontakti){
	    	 TreeItem<String> kbItem = new TreeItem<String>(kb.getIme()+" "+kb.getPrezime());
	    	 privatni.getChildren().add(kbItem);
	    	 
	     }
	     
	     
	     
	     Scene scene = new Scene(stablo);
	     
	     
	     stage.setScene(scene);
	     stage.show();		
	     
		
	}

}
