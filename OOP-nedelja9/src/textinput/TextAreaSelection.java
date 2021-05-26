package textinput;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TextAreaSelection extends Application {
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane bp = new BorderPane();
		
		TextArea komentarTa = new TextArea();
		komentarTa.setWrapText(true);
		komentarTa.setPrefColumnCount(15);
		komentarTa.setPrefRowCount(5);
		bp.setTop(komentarTa);
		
		Button ponisitiButton = new Button("Preuzmi selekciju");
		bp.setCenter(ponisitiButton);
		
		Label selLabel = new Label();
		bp.setBottom(selLabel);
		BorderPane.setAlignment(selLabel, Pos.CENTER);
	    
	
		ponisitiButton.setOnAction((e)->{selLabel.setText(komentarTa.getSelectedText());});
		Scene scene = new Scene(bp, 300, 250);	
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
