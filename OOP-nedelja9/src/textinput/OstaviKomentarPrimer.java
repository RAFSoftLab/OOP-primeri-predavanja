package textinput;




import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class OstaviKomentarPrimer extends Application {
	
	private static KorisnikKomentar korisnikKomentar;
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// layout
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(5);
		grid.setHgap(5);
		
		Label imeL = new Label("Ime:");
		TextField imeTf = new TextField();		
		grid.add(imeL, 0, 0);
		grid.add(imeTf, 1, 0);
		
		Label emailL = new Label("Email:");
		TextField emailTf = new TextField();
		grid.add(emailL, 0, 1);
		grid.add(emailTf, 1, 1);
		
		Label komentarL = new Label("Komentar:");
		TextArea komentarTa = new TextArea();
		komentarTa.setWrapText(true);
		komentarTa.setPrefColumnCount(15);
		komentarTa.setPrefRowCount(5);
		grid.add(komentarL, 0, 2);
		grid.add(komentarTa, 1, 2);
		
		Button ponisitiButton = new Button("Ponisti");
		Button snimiButton = new Button("Snimi");
		
		
		HBox buttonsHB = new HBox();
		buttonsHB.setAlignment(Pos.BOTTOM_RIGHT);		
		buttonsHB.getChildren().addAll(ponisitiButton, snimiButton);
		grid.add(buttonsHB, 1, 3);
		
		
		
		
		Label porukaL = new Label();		
		grid.add(porukaL, 1, 4);
		
		
		
		ponisitiButton.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {
				imeTf.clear();
				emailTf.clear();
				komentarTa.clear();
				porukaL.setText("");
				
			}
		});		
		
		snimiButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(komentarTa.getText().equals("")){
					porukaL.setText("Niste ostavili komentar");
				}else{
					korisnikKomentar = new KorisnikKomentar(imeTf.getText());
					korisnikKomentar.setEmail(emailTf.getText());
					korisnikKomentar.setKomentar(komentarTa.getText());
					porukaL.setText("Hvala "+korisnikKomentar.getIme()+"!");
					System.out.println(korisnikKomentar);
				}				
			}
		});
		
		
		
		
		EventHandler<KeyEvent> snimiEventHandler = new  EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {				
				if(event.isControlDown() && event.getCode() == KeyCode.S)
					snimiButton.fire();				
			}
		};		
		
		
	//	komentarTa.setOnKeyPressed(snimiEventHandler);
		
		
		
		
	//	scene.setOnKeyPressed(snimiEventHandler);
		
		
		
		
		Scene scene = new Scene(grid, 300, 250);		
		
		
		snimiButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Dugme akcija");
			}
		});		
	    
	    
	    scene.setOnKeyPressed(e -> { if(e.isAltDown() && e.getCode() == KeyCode.S) 
              							snimiButton.fire();});
	   
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}		
	
	
	

}
