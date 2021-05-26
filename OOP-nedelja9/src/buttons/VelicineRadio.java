package buttons;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VelicineRadio extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox layout = new VBox(5);
		layout.setPadding(new Insets(0, 0, 0, 30));
		
		
		layout.setAlignment(Pos.TOP_LEFT);
		Label l = new Label("Izaberite veličinu:");
		
		layout.getChildren().add(l);
		ToggleGroup group = new ToggleGroup();
		
		/*
		 * radio button-e formiramo na osnovu elemenata enum-a
		 */
		
		for(Velicina v:Velicina.values()){		
			RadioButton vButton = new RadioButton(v.name());			
			vButton.setToggleGroup(group);
			layout.getChildren().add(vButton);		
		}   
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
