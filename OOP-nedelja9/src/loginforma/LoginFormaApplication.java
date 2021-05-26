package loginforma;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginFormaApplication extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Login");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));		
		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
		
		Label userName = new Label("Korisnicko ime:");
		grid.add(userName, 0, 0);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 0);

		Label pw = new Label("Lozinka:");
		grid.add(pw, 0, 1);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 1);
		
		Button btn = new Button("Prijavi se");
		HBox hbBtn = new HBox();
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		grid.add(hbBtn, 1, 2);		
		Text actiontarget = new Text();
        grid.add(actiontarget, 1, 4);
		
       
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Pokrenuta akcija za prijavu");
            }
        });
        
        EventHandler<ActionEvent>  eh = new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Pokrenuta akcija za prijavu");
            }
        };
        
        btn.setOnAction(eh);
        
        
        
        
        
        
        
        btn.setOnAction(new DugmeAkcija());
        
        
        btn.setOnAction((e) -> {
        	actiontarget.setFill(Color.FIREBRICK);        
            actiontarget.setText("Pokrenuta akcija za prijavu");            
        });
			 
        
       
		 
		primaryStage.show();
		

		

		
		
	}

}
