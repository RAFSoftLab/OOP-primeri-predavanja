package datepicker;

import java.util.Locale;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DatePickerDemo extends Application{
	
	
	 
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label l = new Label("Izaberi datum:");
		DatePicker datePicker = new DatePicker();

		Button ispisiDatum = new Button("Ispisi datum");		
		ispisiDatum.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {			
				System.out.println("Datum: "+datePicker.getValue());
				
			}
		});
		
		
		
		
		VBox vbox = new VBox(5);
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(l, datePicker, ispisiDatum);
		
		Scene scene = new Scene(vbox, 300, 250);	
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	

}
