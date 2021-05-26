package comboboxcellfactory;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import model.Artikal;
import model.Podaci;
import model.Prodavnica;

public class ComboboxEntityDemoCellFactory extends Application {
	
	public static void main(String[] args) {
		
		launch(args);

	}

@Override
public void start(Stage primaryStage) throws Exception {
	
	ComboBox<Prodavnica> prodavniceCmb = new ComboBox<Prodavnica>();
	ObservableList<Prodavnica> prodavniceObservableList 
		= FXCollections.observableList(Podaci.getInstance().getProdavnice());
	prodavniceCmb.setItems(prodavniceObservableList); 
     
     
	
     
	prodavniceCmb.setCellFactory(p-> createProdavnicaCell());
	prodavniceCmb.setButtonCell(createProdavnicaCell());
	
	
	
	TextField novaProdavnicaTf = new TextField();
	Button btnDodajProdavnicu = new Button("Dodaj");	
	HBox hbProdavnica = new HBox(5);
	hbProdavnica.setAlignment(Pos.CENTER);
	hbProdavnica.setPadding(new Insets(10));
	hbProdavnica.getChildren().addAll(prodavniceCmb,novaProdavnicaTf,btnDodajProdavnicu);
	
	
	ListView<Artikal> artikliListView = new ListView<Artikal>();	
	ObservableList<Artikal> artikliObservableList =FXCollections.observableList(Podaci.getInstance().getArtikli());
	
		  
	artikliListView.setItems(artikliObservableList);
	
	
	artikliListView.setCellFactory(new Callback<ListView<Artikal>, ListCell<Artikal>>() {

        @Override
        public ListCell<Artikal> call(ListView<Artikal> p) {

            ListCell<Artikal> cell = new ListCell<Artikal>() {

                @Override
                protected void updateItem(Artikal a, boolean empty) {
                    super.updateItem(a, empty);
                    if(empty) 
                    	setText("");
                    else
	                    if (a != null) {
	                        setText(a.getNazivArtikla() + "-"+a.getSifra()+" velicina:"+a.getVelicina());
	                    }
                }
            };
            return cell;
        }
    });

	
	
	
	
	
	GridPane gPane = new GridPane();
	gPane.setAlignment(Pos.CENTER);
	gPane.setPadding(new Insets(10));
	gPane.setVgap(5);
	gPane.setHgap(5);
	
	TextField tfNaziv = new TextField();	
	TextField tfSifra = new TextField();
	TextField tfVelicina = new TextField();
	TextField tfKolicina = new TextField();
	
	gPane.addRow(0, new Label("Naziv:"), tfNaziv);
	gPane.addRow(1, new Label("Sifra:"), tfSifra);
	gPane.addRow(2, new Label("Velicina:"), tfVelicina);
	gPane.addRow(3, new Label("Kolicina:"), tfKolicina);
	
	Button btnDodaj = new Button("Dodaj");
	Button btnSacuvajSve = new Button("Snimi artikle");
	
	HBox hb = new HBox(3);
	hb.setAlignment(Pos.BASELINE_RIGHT);
	hb.getChildren().addAll(btnDodaj,btnSacuvajSve);
	
	btnDodaj.setOnAction((e)->{artikliListView.getItems().add(new Artikal(prodavniceCmb.getSelectionModel().getSelectedItem(), tfNaziv.getText(), 
			tfSifra.getText(),tfVelicina.getText(),Integer.parseInt(tfKolicina.getText())));
			});
	
	btnSacuvajSve.setOnAction( e -> Podaci.getInstance().snimiProdavnice());
	
	btnDodajProdavnicu.setOnAction(e->prodavniceCmb.getItems().add(new Prodavnica(novaProdavnicaTf.getText())));
	
	prodavniceCmb.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
        if (newSelection != null) 
        	artikliListView.setItems(FXCollections.observableList(newSelection.getArtikli()));
     });
     
	
	
	
	gPane.add(hb,1,4);
	
	VBox vbox = new VBox(5);
	vbox.setAlignment(Pos.CENTER);
	vbox.getChildren().addAll(hbProdavnica,artikliListView, gPane);
	
	Scene scene = new Scene(vbox, 500, 450);	
	primaryStage.setScene(scene);
	primaryStage.show();	
}

private ListCell<Prodavnica> createProdavnicaCell(){
	return new ListCell<Prodavnica>() {
        @Override
        protected void updateItem(Prodavnica a, boolean empty) {
            super.updateItem(a, empty);
            if(empty) 
            	setText("");
            else
               if (a != null) {
                   setText("Prodavnica "+a.getNaziv()+"-"+a.getArtikli().size());
               }
        }
 };
}

}
