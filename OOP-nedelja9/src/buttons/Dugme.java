package buttons;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Dugme extends Application {
	

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//dugme bez teksta
		Button button1 = new Button();
		// postavljanje teksta
		button1.setText("Dugme1");	
		
		
		//dugme sa prosledjenim tekstom u konstruktoru
		Button button2 = new Button("Dugme2");
		
		//dugme sa tekstom i ikonicom.
		Image imageOk = new Image(getClass().getResourceAsStream("/img/ok.jpg"));
		Button button3 = new Button("OK", new ImageView(imageOk));
		
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button1);
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
