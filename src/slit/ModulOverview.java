/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Kjetil
 */
public class ModulOverview extends Application {
    
    Scene scene1, scene2, scene3, scene4, scene5, scene6, scene7, scene8, scene9, scene10, scene11, scene12, scene13, scene14, scene15;
    

    
    @Override
    public void start(Stage primaryStage) {
        Button btnMod1 = new Button("1");
        btnMod1.setOnAction(e -> {
                //primaryStage.setScene(scene1);
                ModulViewTeacher mvt1 = new ModulViewTeacher(1);
                mvt1.start(primaryStage);
        });
        Button btnMod2 = new Button("2");
        btnMod2.setOnAction(e -> {
                ModulViewTeacher mvt2 = new ModulViewTeacher(2);
                mvt2.start(primaryStage);
        });
        Button btnMod3 = new Button("3");
        btnMod3.setOnAction(e -> {
                ModulViewTeacher mvt3 = new ModulViewTeacher(3);
                mvt3.start(primaryStage);
        });
        Button btnMod4 = new Button("4");
        btnMod4.setOnAction(e -> {
               ModulViewTeacher mvt4 = new ModulViewTeacher(4);
                mvt4.start(primaryStage);
        });
        Button btnMod5 = new Button("5");
        btnMod5.setOnAction(e -> {
                ModulViewTeacher mvt5 = new ModulViewTeacher(5);
                mvt5.start(primaryStage);
        });
        Button btnMod6 = new Button("6");
        btnMod6.setOnAction(e -> {
                ModulViewTeacher mvt6 = new ModulViewTeacher(6);
                mvt6.start(primaryStage);
        });
        Button btnMod7 = new Button("7");
        btnMod7.setOnAction(e -> {
                ModulViewTeacher mvt7 = new ModulViewTeacher(7);
                mvt7.start(primaryStage);
        });
        Button btnMod8 = new Button("8");
        btnMod8.setOnAction(e -> {
                ModulViewTeacher mvt8 = new ModulViewTeacher(8);
                mvt8.start(primaryStage);
        });
        Button btnMod9 = new Button("9");
        btnMod9.setOnAction(e -> {
                ModulViewTeacher mvt9 = new ModulViewTeacher(9);
                mvt9.start(primaryStage);
        });
        Button btnMod10 = new Button("10");
        btnMod10.setOnAction(e -> {
                ModulViewTeacher mvt10 = new ModulViewTeacher(10);
                mvt10.start(primaryStage);
        });
        Button btnMod11 = new Button("11");
        btnMod11.setOnAction(e -> {
                ModulViewTeacher mvt11 = new ModulViewTeacher(11);
                mvt11.start(primaryStage);
        });
        Button btnMod12 = new Button("12");
        btnMod12.setOnAction(e -> {
                ModulViewTeacher mvt12 = new ModulViewTeacher(12);
                mvt12.start(primaryStage);
        });
        Button btnMod13 = new Button("13");
        btnMod13.setOnAction(e -> {
                ModulViewTeacher mvt13 = new ModulViewTeacher(13);
                mvt13.start(primaryStage);
        });
        Button btnMod14 = new Button("14");
        btnMod14.setOnAction(e -> {
                ModulViewTeacher mvt14 = new ModulViewTeacher(14);
                mvt14.start(primaryStage);
        });
        Button backToMainButton = new Button("Tilbake");
        backToMainButton.setOnAction(e -> {
                primaryStage.setScene(scene15);
        });
        Button backToMainButton2 = new Button("Tilbake");
        backToMainButton2.setOnAction(e -> {
                primaryStage.setScene(scene15);
        });

        
        HBox root = new HBox(5);
        root.getChildren().addAll(btnMod1, btnMod2, btnMod3, btnMod4, btnMod5, btnMod6, btnMod7, btnMod8, btnMod9, btnMod10, btnMod11, btnMod12, btnMod13, btnMod14);
        
        StackPane sub = new StackPane();
        sub.getChildren().add(backToMainButton);
        StackPane sub2 = new StackPane();
        sub2.getChildren().add(backToMainButton2);/*
        StackPane sub3 = new StackPane();
        sub3.getChildren().add(backToMainButton);
        StackPane sub4 = new StackPane();
        sub4.getChildren().add(backToMainButton);
        StackPane sub5 = new StackPane();
        sub5.getChildren().add(backToMainButton);
        StackPane sub6 = new StackPane();
        sub6.getChildren().add(backToMainButton);
        StackPane sub7 = new StackPane();
        sub7.getChildren().add(backToMainButton);
        StackPane sub8 = new StackPane();
        sub8.getChildren().add(backToMainButton);
        StackPane sub9 = new StackPane();
        sub9.getChildren().add(backToMainButton);
        StackPane sub10 = new StackPane();
        sub10.getChildren().add(backToMainButton);
        StackPane sub11 = new StackPane();
        sub11.getChildren().add(backToMainButton);
        StackPane sub12 = new StackPane();
        sub12.getChildren().add(backToMainButton);
        StackPane sub13 = new StackPane();
        sub13.getChildren().add(backToMainButton);
        StackPane sub14 = new StackPane();
        sub14.getChildren().add(backToMainButton);*/
        

        scene1 = new Scene(sub, 300, 250);
        scene2 = new Scene(sub2, 300, 250);/*
        scene3 = new Scene(sub3, 300, 250);
        scene4 = new Scene(sub4, 300, 250);
        scene5 = new Scene(sub5, 300, 250);
        scene6 = new Scene(sub6, 300, 250);
        scene7 = new Scene(sub7, 300, 250);
        scene8 = new Scene(sub8, 300, 250);
        scene9 = new Scene(sub9, 300, 250);
        scene10 = new Scene(sub10, 300, 250);
        scene11 = new Scene(sub11, 300, 250);
        scene12 = new Scene(sub12, 300, 250);
        scene13 = new Scene(sub13, 300, 250);
        scene14 = new Scene(sub14, 300, 250);*/
        scene15 = new Scene(root, 800, 250);
        
        
        primaryStage.setTitle("Redigering av moduler");
        primaryStage.setScene(scene15);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
