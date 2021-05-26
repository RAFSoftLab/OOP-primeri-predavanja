package labela;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LabelaDemo extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		//Prazna labela
		Label label1 = new Label();
		// dodela teksta  
		label1.setText("Labela");
		
		// Dodela teksta u konstruktoru
		Label label2 = new Label("Nova labela");		
		
		
		//labela sa tekstom i slikom
		Image image = new Image("./img/play-icon.png");
		Label label3 = new Label("Play", new ImageView(image));
		
		
		
		StackPane layout = new StackPane();
		layout.getChildren().add(label2);
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		// specificiranje fonta, koristi se staticki metod klase Font
				label2.setFont(Font.font("Cambria", 32));
				
				
				label2.setRotate(270);
				label2.setTranslateY(10);
				


	}

}
