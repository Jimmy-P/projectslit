/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author Adam
 */
public class Main extends Application{
    
    private Stage stage;
    FXMLLoader loader = new FXMLLoader();
    
    @Override
    public void start(Stage stage) throws Exception {
        
        try {
        
        Parent root = loader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
        /*try{
            this.stage = LoginStage;
            this.setScene(Login);
        }
        catch(Exception e){
            e.printStackTrace();
        }*/
    }
    
    public static void main(String[] args) {
        launch(args);
        
    }
}
