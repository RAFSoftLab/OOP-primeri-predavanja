package buttons;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxDemo extends Application {


	public static void main(String[] args) {
		launch(args);

	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox layout = new VBox(5);
		layout.setPadding(new Insets(20, 0, 0, 30));		
		layout.setAlignment(Pos.TOP_LEFT);
				
		CheckBox cb1 = new CheckBox();
		cb1.setText("Prvi");
		
		CheckBox cb2 = new CheckBox("Drugi");
		cb1.setSelected(true);
		
		layout.getChildren().add(cb1);
		layout.getChildren().add(cb2);
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}

}
