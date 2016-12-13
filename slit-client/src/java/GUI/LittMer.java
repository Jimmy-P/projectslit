/*
 * Viser at jeg har jobbet med JavaFX, at jeg 
kan bytte mellom scener, og koble flere sammen.
Jeg kan bruke forskjellige plasseringer på 
knapper og lables, bruk av panes og boxes.
Jeg kan bruke CSS.
 */
package litt.mer;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.css.Styleable;
import javafx.scene.control.TextField;

/**
 *
 * @author Lani.
 */
public class LittMer extends Application {
    
    Stage window;
    Scene scene1, scene2, scene3, scene4, scene5;
   
    
    /**
     * @param args the command line arguments
     */
    public static void littMer(String[] args) {
        launch(args);
    }
    
    //Setter det første vinduet, hovedmenyen.
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        
        //Scene 1. Hvikle knapper og ting som skal være der
        Label label1 = new Label("Velkommen kjære student!");
        //Setter overskrift skrift og størrelse på teksten.
        label1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        //Setter farge på skriften
        label1.setStyle("-fx-text-fill: darkblue;");
        Button button1 = new Button("Kontakt lærere");
        //Setter farger på bakgrunn og skriften
        button1.setStyle("-fx-background-color: slateblue; -fx-text-fill: white;");
        //Denne metoden gjør at du kommer til en ny scene når du trykker på knappen
        button1.setOnAction(e -> window.setScene(scene2));
        Button button2 = new Button("Bloggen");
        button2.setStyle("-fx-background-color: lightgreen; -fx-text-fill: darkblue;");
        button2.setOnAction(e -> window.setScene(scene3));
        Button button3 = new Button("Send noen i klassen en mail");
        button3.setStyle("-fx-background-color: lightpink; -fx-text-fill: darkblue;");
        button3.setOnAction(e -> window.setScene(scene4));
        Button button4 = new Button("Faglig informasjon");
        button4.setStyle("-fx-background-color: yellow; -fx-text-fill: darkblue;");
        button4.setOnAction(e -> window.setScene(scene5));
        Button button10 = new Button("Neste side");
        button10.setStyle("-fx-background-color: darkgrey; -fx-text-fill: white;");
        button10.setOnAction(e -> window.setScene(scene2));
        
        //Layout 1, utseende, plassering av ting.

        GridPane layout1 = new GridPane();
        //Hvilken del av Gridpanen
        layout1.setAlignment(Pos.CENTER);
        layout1.setHgap(10);
        layout1.setVgap(10);
        layout1.setPadding(new Insets(25, 25, 25, 25));
        //Setter bakgrunnsfarge
        layout1.setStyle("-fx-background-color: lightblue;");
        //Plassering i Gridpanen
        GridPane.setConstraints(label1, 1, 2);
        GridPane.setConstraints(button1, 1, 10); 
        GridPane.setConstraints(button2, 1, 12); 
        GridPane.setConstraints(button3, 1, 14);
        GridPane.setConstraints(button4, 1, 16);
        GridPane.setConstraints(button10, 1, 18);
        layout1.setGridLinesVisible(false);
        layout1.getChildren().addAll(label1, button1, button2, button3, button4, button10);
        scene1 = new Scene(layout1, 500, 500);
        scene1.getStylesheets().add("littMer/styling.css");
        
        //Scene 2
        //lager en ny knapp
        Button button16 = new Button("Bloggen");
        button16.setStyle("-fx-background-color: lightpink; -fx-text-fill: darkblue;");
        button16.setOnAction(e -> window.setScene(scene3));
        Button button6 = new Button("Hjelp");
        button6.setStyle("-fx-background-color: lightgreen; -fx-text-fill: darkblue;");
        button6.setOnAction(e -> window.setScene(scene1));
        Button button8 = new Button("Tilbake");
        button8.setStyle("-fx-background-color: yellow; -fx-text-fill: darkblue;");
        button8.setOnAction(e -> window.setScene(scene1));
        //Lager en ny label
        Label label2 = new Label("Ta kontakt med en lærer her:"); 
        label2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        label2.setStyle("-fx-text-fill: turkoise;");
        Label label6 = new Label ("even@uia.no \n"
                + "hallgeir@uia.no \n"
                + "hjelpelærer@uia.no \n"
                + "ithjelp@uia.no \n"
                + "Trenger du mer info, trykk på hjelp.");
        
        //layout 2
        //VBox, HBox, GridPane, FlowPane...er bestemte layouts.
        VBox layout2 = new VBox(30);
        layout2.setPadding(new Insets(50,30,50,30));
        layout2.getChildren().addAll(label2, label6, button6, button8, button16);
        scene2 = new Scene(layout2, 400, 500);
       
        
        //Scene 3
        Label label3 = new Label("Velkommen til bloggen.");
        label3.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        label3.setStyle("-fx-text-fill: yellow;");
        Label label5 = new Label("Hei Lærer!\n"
        + "I dag har jeg jobbet masse med JavaFX, men det er endel\n"
        + "ting jeg ikke får til. Det er så mange språk og subtile\n"
        + "forskjeller mellom dem, så jeg tror jeg blander litt.\n"
        + "Hadde misforstått litt også, så ligger bak.\n"
        + "Kjedelig å bruke så mye tid på google.\n"
        + "Gøy med CSS og farger på ting, man blir jo glad!.\n"        
        + "\n"
        + "Det er litt møysommelig, men gøy når man får til noe.");
        Button button9 = new Button("Tilbake");
        button9.setStyle("-fx-background-color: lightpink; -fx-text-fill: darkblue;");
        button9.setOnAction(e -> window.setScene(scene1));
        Button button11 = new Button("Post bloggen");
        button11.setStyle("-fx-background-color: darkblue; -fx-text-fill: white;");
        button11.setOnAction(e -> window.setScene(scene1));
       
        
        //layout 3
        GridPane layout3 = new GridPane();
        layout3.setAlignment(Pos.CENTER);
        layout3.setHgap(10);
        layout3.setVgap(10);
        layout3.setPadding(new Insets( 25, 250, 25, 5));
        layout3.setStyle("-fx-background-color: lightgreen;");
        GridPane.setConstraints(label3, 1, 2);
        GridPane.setConstraints(label5, 1, 4);
        GridPane.setConstraints(button11, 3, 4); 
        GridPane.setConstraints(button9, 3, 6);
        layout3.setGridLinesVisible(false);
        layout3.getChildren().addAll(label3, label5, button9, button11);
        scene3 = new Scene(layout3, 700, 500);
        
        //Scene 4
        Label label4 = new Label("Mailadresser til dine medstudenter\n"
                                +"-----------------------------------\n"
        + "universet@uia.no\n"
        + "vinden@uia.no\n"
        + "kjærlighet@uia.no\n"
        + "måne@uia.no\n"
        + "fred@uia.no\n"
        + "rettferdighet@uia.no\n"
        + "luft@uia.no\n"
        + "skogen@uia.no\n"
        + "fjell@uia.no\n"
        + "liv@uia.no\n");
        Button button12 = new Button("Tilbake");
        button12.setStyle("-fx-background-color: slateblue; -fx-text-fill: white;");
        button12.setOnAction(e -> window.setScene(scene1));
        
        //Layout4
        VBox layout4 = new VBox(50);
        layout4.setPadding(new Insets(50,30,50,30));
        layout4.setStyle("-fx-background-color: lightpink;");
        layout4.getChildren().addAll(label4, button12);
        scene4 = new Scene(layout4, 600, 400);
        
         //Scene 5
        Label label7 = new Label("Magisk informasjonsside!\n"
                                +"-----------------------------\n");
        label7.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        label7.setStyle("-fx-text-fill: yellow;");
        Label label8 = new Label("Her finner du lesestoff og linker\n"
        + "til alt du måtte trenge av informasjon, slik at du kan\n"
        + "klare studiet på en god måte.\n"
        + "Det er viktig at du jobber med koding regelmessig for at du\n"
        + "skal ha progressjon.\n"
        + "Spør oss gjerne hvis du lurer på noe eller det er noe du\n"
        + "synes mangler, så vil vil prøve å ta hensyn til dette.\n");
        Button button5 = new Button("Lesestoff");
        button5.setStyle("-fx-background-color: lightpink; -fx-text-fill: darkblue;");
        button5.setOnAction(e -> window.setScene(scene1));
        Button button13 = new Button("Videoleksjoner");
        button13.setStyle("-fx-background-color: lightgreen; -fx-text-fill: darkblue;");
        button13.setOnAction(e -> window.setScene(scene1));
        Button button14 = new Button("Tilbake");
        button14.setStyle("-fx-background-color: slateblue; -fx-text-fill: yellow;");
        button14.setOnAction(e -> window.setScene(scene1));
        
        //Layout5
        VBox layout5 = new VBox(50);
        layout5.setPadding(new Insets(50,30,50,30));
        layout5.setStyle("-fx-background-color: lightblue;");
        layout5.getChildren().addAll(label7, label8, button5, button13, button14);
        scene5 = new Scene(layout5, 600, 700);
        
        window.setScene(scene1);
        window.setTitle("Studentinformasjon");
        window.show();
    }}

