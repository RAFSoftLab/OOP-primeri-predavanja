package colorpicker;

import java.util.Locale;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ColorPickerDemo extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label l = new Label("Izaberi boju:");
		ColorPicker colorPicker = new ColorPicker();		
		Button ispisiDatum = new Button("Ispisi boju");		
		ispisiDatum.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {			
				System.out.println("Boja: "+colorPicker.getValue());
				
			}
		});
		
		
		
		
		VBox vbox = new VBox(5);
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(l, colorPicker, ispisiDatum);
		
		Scene scene = new Scene(vbox, 300, 250);	
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	

}
