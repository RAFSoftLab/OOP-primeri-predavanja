package buttons;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MouseEventsDemo extends Application {


	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Button button1 = new Button("Osetljivo dugme");			
		Label l1 = new Label();		
		
			 
		button1.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				l1.setText("Klik!");				
			}			
		});
		
		
		 
		button1.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {					
				l1.setText("Izvan dugmeta!");				
			}			
		});
		
		button1.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {	
				
				if(event.getClickCount()==1)
					l1.setText("Jedan klik!");
				else if(event.getClickCount() == 2)
					l1.setText("Dupli klik!");
			}
		});
		
		
		
		VBox layout = new VBox(10);		
		layout.setAlignment(Pos.CENTER);
		layout.getChildren().add(button1);
		layout.getChildren().add(l1);		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
