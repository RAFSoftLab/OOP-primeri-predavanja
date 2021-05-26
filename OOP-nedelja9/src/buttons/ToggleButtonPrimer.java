package buttons;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ToggleButtonPrimer extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		ToggleButton tb1 = new ToggleButton("opcija 1");
		ToggleButton tb2 = new ToggleButton("opcija 2");
		ToggleButton tb3 = new ToggleButton("opcija 3");
		
		
		ToggleGroup group = new ToggleGroup();
		tb1.setToggleGroup(group);
		tb2.setToggleGroup(group);
		tb3.setToggleGroup(group);			
		
		HBox layout = new HBox();
		layout.setAlignment(Pos.CENTER);
		layout.getChildren().add(tb1);
		layout.getChildren().add(tb2);
		layout.getChildren().add(tb3);
		
		
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
