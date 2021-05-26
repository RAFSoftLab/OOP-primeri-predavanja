package textinput;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class HTMLEditorDemo extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("HTMLEditor primer");
		primaryStage.setWidth(650);
		primaryStage.setHeight(300);   
	    HTMLEditor htmlEditor = new HTMLEditor();
	    htmlEditor.setPrefHeight(245);		
	    
	    VBox vbox = new VBox();
	    vbox.setPadding(new Insets(8, 8, 8, 8));
        vbox.setSpacing(5);
        vbox.setAlignment(Pos.BOTTOM_LEFT);
        
        
	    Button ispisiB = new Button("Ispisi sadrzaj");
	    
	    TextArea htmlCode = new TextArea();
        htmlCode.setWrapText(true);
	    
        ScrollPane scrollPane = new ScrollPane();       
        scrollPane.setContent(htmlCode);
        scrollPane.setFitToWidth(true);
        scrollPane.setPrefHeight(180);
        
     
        
        
	    ispisiB.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String tekst = htmlEditor.getHtmlText();
				htmlCode.setText(tekst);
				System.out.println(tekst);
				
			}
		});
	    
	    
	    vbox.getChildren().addAll(htmlEditor,ispisiB, scrollPane);  
	    
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
