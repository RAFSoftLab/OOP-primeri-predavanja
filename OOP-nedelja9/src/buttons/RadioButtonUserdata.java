package buttons;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonUserdata extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		ToggleGroup group = new ToggleGroup();
		
		ToggleButton tb = new ToggleButton("proba");
		
		RadioButton rb1 = new RadioButton("opcija 1");
		RadioButton rb2 = new RadioButton("opcija 2");
		RadioButton rb3 = new RadioButton("opcija 3");
		
		
		rb1.setUserData("opcija 1 - objekat");
		rb2.setUserData("opcija 2 - objekat");
		rb3.setUserData("opcija 3 - objekat");
		
		
		tb.setToggleGroup(group);
		
		
		rb1.setToggleGroup(group);
		rb2.setToggleGroup(group);
		rb3.setToggleGroup(group);
		
		
		
		Label l = new Label();
		Button b = new Button("Ispisi");
	
		
		b.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {
				System.out.println(group.getSelectedToggle().getUserData().toString());
				
				//System.out.println(((RadioButton)group.getSelectedToggle()).getText());
			
			}
		});
		
		
		
		VBox layout = new VBox(5);
		layout.setAlignment(Pos.CENTER);
	
	    layout.getChildren().add(rb1);
	    layout.getChildren().add(rb2);
	    layout.getChildren().add(rb3);
	   // layout.getChildren().add(tb);
	    layout.getChildren().add(b);
	    
	    layout.getChildren().add(l);
	    
	    //String selektovanaOpcija = group.getSelectedToggle().getUserData().toString();
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();

	}


}
