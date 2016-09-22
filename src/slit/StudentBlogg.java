/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.*;



/**
 *
 * @author Maria
 */
public class StudentBlogg extends Application{

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("studentblogg");
        
        BorderPane bpBlog = new BorderPane();
        HBox studentmeny = new HBox();
        //studentmeny.getStyleClass().add("studentmeny");
        
        Button sButton = new Button("status");
        studentmeny.getChildren().add(sButton);
        Button loButton = new Button("log out");
        studentmeny.getChildren().add(loButton);
        Button seButton = new Button("do something else");
        studentmeny.getChildren().add(seButton);
        
        bpBlog.setTop(studentmeny);
        
        VBox archive = new VBox();
        //archive.getStyleClass().add("archive");
        bpBlog.setRight(archive);
        Text p01 = new Text("Post 1");
        archive.getChildren().add(p01);
        Text p02 = new Text("Post 2");
        archive.getChildren().add(p02);
        Text p03 = new Text("Post 3");
        archive.getChildren().add(p03);
        Text p04 = new Text("Post 4");
        archive.getChildren().add(p04);
        Text p05 = new Text("Post 5");
        archive.getChildren().add(p05);
        
        VBox blogView = new VBox();
        //blogView.getStyleClass().add("blogView");
        bpBlog.setCenter(blogView);
        
        VBox blogpost = new VBox();
        Text title = new Text("Post 1");
        blogpost.getChildren().add(title);
        Text date = new Text("18.09.2016");
        blogpost.getChildren().add(date);
        Text postText = new Text("This is a blog post. There should be a lot of"
                + " text about how much I've learned in this subject, but I "
                + "haven't got time to add too much at the moment as I'm trying"
                + " to code something that works well enough to be presented "
                + "as a prototype sometime in the future. It will be interesting"
                + " to see what I come up with.");
        TextFlow post = new TextFlow(postText);
        blogpost.getChildren().add(post);
        
        VBox blogpost2 = new VBox();
        Text title2 = new Text("Post 2");
        blogpost.getChildren().add(title2);
        Text date2 = new Text("19.09.2016");
        blogpost.getChildren().add(date2);
        Text postText2 = new Text("This is a different blog post. It's exactly"
                + "the same. There should be a lot of"
                + " text about how much I've learned in this subject, but I "
                + "haven't got time to add too much at the moment as I'm trying"
                + " to code something that works well enough to be presented "
                + "as a prototype sometime in the future. It will be interesting"
                + " to see what I come up with.");
        TextFlow post2 = new TextFlow(postText2);
        blogpost2.getChildren().add(post2);
        
        blogView.getChildren().add(blogpost);
        blogView.getChildren().add(blogpost2);
        
        Scene blog = new Scene(bpBlog, 500, 400);
        //blog.getStylesheets().add("styling.css");
        primaryStage.setScene(blog);
        primaryStage.show();
    }
    
}
