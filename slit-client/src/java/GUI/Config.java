
package main2;

import static java.awt.SystemColor.window;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import static main2.Config.ansver;

public class Config {
    
    static boolean ansver;
    
    public static boolean display(String title, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(400);
        Label label = new Label();
        label.setText(message);
        
        // Create two buttons
        Button yesButton = new Button("Godkjent");
        Button noButton = new Button("Ikke Godkjent");
        
        yesButton.setOnAction(e -> {
            ansver = true;
            window.close();
        });
        noButton.setOnAction(e -> {
            ansver = false;
            window.close();
        });
            
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        
        return ansver;
    }
    
}