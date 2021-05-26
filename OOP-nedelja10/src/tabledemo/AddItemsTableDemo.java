package tabledemo;



import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AddItemsTableDemo extends Application {
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {	 
	     stage.setTitle("Adresar");
	     stage.setWidth(650);
	     stage.setHeight(300);
	     
	     
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
	     
	     
	     
	     Label imel = new Label("Ime");
	     TextField imeTf = new TextField();
	     Label prezimel = new Label("Prezime");
	     TextField prezimeTf = new TextField();	     
	     Label emaill = new Label("Email");
	     TextField emailTf = new TextField();	    
	     Button button = new Button("Dodaj");
	     HBox hbox = new HBox(5);
	     hbox.getChildren().addAll(imel, imeTf, prezimel, prezimeTf, emaill, emailTf, button);
	     
	     button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Kontakt k = new Kontakt(imeTf.getText(), prezimeTf.getText(), emailTf.getText());
				table.getItems().add(k);
				
				
			}
		});
	     
	     
	     table.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if (event.getClickCount()==2){
					Kontakt selectedKontakt = table.getSelectionModel().getSelectedItem();
					imeTf.setText(selectedKontakt.getIme());
					prezimeTf.setText(selectedKontakt.getPrezime());
					emailTf.setText(selectedKontakt.getEmail());
				}
				
			}
		
	     
	     });
	     
	     
	     VBox vbox = new VBox(5);
	     vbox.getChildren().addAll(table, hbox);
	     
	     
	     Scene scene = new Scene(vbox);
	     
	     
	     stage.setScene(scene);
	     stage.show();		
	}
}
