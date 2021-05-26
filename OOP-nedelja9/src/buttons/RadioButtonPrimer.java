package buttons;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonPrimer extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		ToggleGroup group = new ToggleGroup();
		
		RadioButton rb1 = new RadioButton("opcija 1");
		RadioButton rb2 = new RadioButton("opcija 2");
		RadioButton rb3 = new RadioButton("opcija 3");
		
		
		rb1.setToggleGroup(group);
		rb2.setToggleGroup(group);
		rb3.setToggleGroup(group);
		
		
		
		VBox layout = new VBox(5);
		layout.setAlignment(Pos.CENTER);
	    layout.getChildren().add(rb1);
	    layout.getChildren().add(rb2);
	    layout.getChildren().add(rb3);
	    
	    
	   
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
