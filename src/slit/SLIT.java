package slit;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.text.DecimalFormat;

public class SLIT extends Application {

    Stage window;
    Scene scene1, scene2;
    String user1 = "1";
    String pw1 = "1";
    String user2 = "2";
    String pw2 = "2";
    String user3 = "3";
    String pw3 = "3";
    String checkUser, checkPw;


    public static void main(String[] args) {
        launch(args);
    }

    
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        //UI Controls 1
        Label label1 = new Label("Welcome!");
        label1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 30));
        Button button1 = new Button("Login");
        TextField userTextField = new TextField();
        userTextField.setPromptText("Enter Username");
        PasswordField pwBox = new PasswordField();
        pwBox.setPromptText("Enter Password");
        final Text actiontarget = new Text();
        
        

        //Layout 1 
        GridPane layout1 = new GridPane();
        layout1.setAlignment(Pos.CENTER);
        layout1.setHgap(10);
        layout1.setVgap(10);
        layout1.setPadding(new Insets(25, 25, 25, 25));
        GridPane.setConstraints(label1, 1, 2);
        GridPane.setConstraints(userTextField, 1, 10);
        GridPane.setConstraints(button1, 1, 12);
        GridPane.setConstraints(pwBox, 1, 11);
        GridPane.setConstraints(actiontarget, 1, 13);
        layout1.setGridLinesVisible(false);
        layout1.getChildren().addAll(label1, button1, userTextField, pwBox, actiontarget);
        scene1 = new Scene(layout1, 300, 400);
        
        
        button1.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent event) {
                        checkUser = userTextField.getText().toString();
                        checkPw = pwBox.getText().toString();
                        if(checkUser.equals(user1) && checkPw.equals(pw1)){
                                MainTeacher mt = new MainTeacher();
                                mt.start(window);
                        }
                        if(checkUser.equals(user2) && checkPw.equals(pw2)){
                                MainTA mta = new MainTA();
                                mta.start(window);
                        }
                        if(checkUser.equals(user3) && checkPw.equals(pw3)){
                                StatusStudent ss = new StatusStudent();
                                ss.start(window);
                        }
                        else{
                                
                                actiontarget.setText("Feil brukernavn/passord");
                        }
                        userTextField.setText("");
                        pwBox.setText("");
                    }
                });
        
             
        

        //Display scene 1 at first
        window.setScene(scene1);
        window.setTitle("Welcome");
        window.show();
    }

}
