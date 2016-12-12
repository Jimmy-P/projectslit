
package main2;

import static java.awt.SystemColor.window;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Anne
 * 
 * Returnerer true/ false ( Godkjent/ ikke godkjent )
 */
public class Main2 extends Application {
    
    Stage window;
    Button button;
    
    public static void main2(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Lærer Status");
        
        button = new Button("Se modul");
        
        button.setOnAction(e -> {
                boolean result = Config.display("Godkjenne modul", "Godkjenne modul?");
                System.out.println(result);
                
    });
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 500, 300);
        window.setScene(scene);
        window.show();
    }
    
    public static void main(String[] args) {
        
        launch(args);
        
    }
    
}
