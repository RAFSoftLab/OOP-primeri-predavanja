package textinput;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class InputFieldDemo extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label label1 = new Label("Ime:");
		TextField textField = new TextField();
		HBox hb = new HBox();
		hb.getChildren().addAll(label1, textField);
		hb.setSpacing(10);
		hb.setAlignment(Pos.CENTER);

	
		
		Scene scene = new Scene(hb, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
