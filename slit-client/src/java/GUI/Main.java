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

import Framework.BrukerManager;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;


/**
 *
 * @author Adam
 */
public class Main extends Application{
    
    BrukerManager bm = new BrukerManager();
    
    private Stage stage;
    //FXMLLoader loader = new FXMLLoader();
    
    @Override
    public void start(Stage stage) throws Exception {
        
        SceneSelecter ss = new SceneSelecter();
        ss.start(stage);
        
        /*try {
        
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
