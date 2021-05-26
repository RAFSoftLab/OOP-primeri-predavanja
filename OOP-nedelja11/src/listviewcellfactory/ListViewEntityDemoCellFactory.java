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

public class ListViewEntityDemoCellFactory extends Application {
	
	public static void main(String[] args) {	
		launch(args);

	}

@Override
public void start(Stage primaryStage) throws Exception {
	
	Prodavnica p = new Prodavnica("Knez");
	
	ListView<Artikal> listView = new ListView<Artikal>();	
	ObservableList<Artikal> items =FXCollections.observableList(Podaci.getInstance().getArtikli());
	
		  
	listView.setItems(items);
	
	// kastomizovani prikaz artikla u celiji listview komponente
	
	listView.setCellFactory(new Callback<ListView<Artikal>, ListCell<Artikal>>() {

        @Override
        public ListCell<Artikal> call(ListView<Artikal> p) {

            ListCell<Artikal> cell = new ListCell<Artikal>() {

                @Override
                protected void updateItem(Artikal a, boolean empty) {
                    super.updateItem(a, empty);
                    if (empty || a == null) {
                        setText(null);
                    }else {
                        setText(a.vratiPrikazZaListView());
                    }
                }
            };

            return cell;
        }
    });

	
	
	// preuzimanje selekcije	
	Button ispisiSelektovaneB = new Button("Ispisi selekciju");
	
	ispisiSelektovaneB.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {			
			System.out.println("Selektovani element: "+listView.getSelectionModel().getSelectedItem());
			
		}
	});
	
	GridPane gPane = new GridPane();
	gPane.setVgap(5);
	gPane.setHgap(5);
	gPane.setAlignment(Pos.CENTER);
	gPane.setPadding(new Insets(10));
	
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
	
	btnDodaj.setOnAction(e->{items.add(new Artikal(p, tfNaziv.getText(), 
			tfSifra.getText(),tfVelicina.getText(),Integer.parseInt(tfKolicina.getText())));});
	
	btnSacuvajSve.setOnAction( e -> Podaci.getInstance().snimiArtikle());
	
	gPane.add(hb,1,4);
	
	// filtriranje ListView komponente 
	
	TextField filterTf = new TextField();
	filterTf.setOnKeyTyped(ke -> {
		String text = filterTf.getText();
		ObservableList<Artikal> artikli = FXCollections.observableArrayList();
		for(Artikal a:items) {
			if(a.vratiPrikazZaListView().contains(text))
				artikli.add(a);
		}
		listView.setItems(artikli);	
		listView.refresh();
		
		
	});
	

	
	VBox vbox = new VBox(5);
	vbox.setAlignment(Pos.CENTER);
	vbox.setPadding(new Insets(10));
	vbox.getChildren().addAll(filterTf,listView, ispisiSelektovaneB, gPane);
	
	
	Scene scene = new Scene(vbox, 400, 350);	
	primaryStage.setScene(scene);
	primaryStage.show();
	
	
	
}

}
