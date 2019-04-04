/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.scene.control.Slider;
import javafx.scene.layout.Priority;


/**
 *
 * @author 8753
 */
public class ExampleStarSystem extends Application {
        
    StackPane mainMenuStack = new StackPane(); //Stackpane used for the main page
    VBox mainMenuVbox = new VBox(); // VBox used for the main page
    VBox settingVbox = new VBox(); //VBox used for the setting page
     GridPane selectionpane = new GridPane();
    StackPane settingmenu = new StackPane();
    Group root = new Group();
   // GridPane hello = new GridPane();
    StackPane Selection = new StackPane();
    Screen screen = Screen.getPrimary();
    Rectangle2D bounds = screen.getVisualBounds();
    StackPane loadmenu = new StackPane();
    VBox save = new VBox();
    Sliders numberofplanets, numberofstars;
    Buttons createsimulation, loadsimulation;
    private SimulationWindow SW;
    final int width= 800;
    final int height = 800;
    
    

    
    public static void main(String[] args) {
        launch(args);
    }
        
        
    @Override
    public void start(Stage window) throws Exception {
     //window.setFullScreen(true);
        
        window.getIcons().add(new Image(getClass().getResourceAsStream("downlaod123.png")));
        callingsubroutines(); 

         StackPane mainRoot = new StackPane();
         mainRoot.getChildren().add(root);
         root.getChildren().add(mainMenuStack);
      
        Scene scene = new Scene(mainRoot, width,height);
        scene.getStylesheets().add(getClass().getResource("System.css").toExternalForm());
       window.setResizable(false);
     
        window.setTitle("Solalsystem.exe");
        window.setScene(scene);
        window.show();
         SW = new SimulationWindow(900,600);
        
    }
    
       public void callingsubroutines() {      
        setupMain();
        settings();
        settingButton();
        Selection();
        savepage();
    }
       
//       private void createSimulation() {
//       SW = new SimulationWindow(500,500);
//       }
//      
    private void setupMain() {
        Button bn1 = new Button();
        bn1.setText("Create a Simulation");
        bn1.setTranslateY(190);
        bn1.setTranslateX(320);
        bn1.setMaxWidth(220);
        bn1.setStyle("-fx-border-radius: 40px");
        bn1.setStyle("-fx-padding: 10px");
        bn1.setStyle("-fx-font-size: 20px");
                bn1.setOnAction((ActionEvent event)-> {
           root.getChildren().clear();
           root.getChildren().add(Selection);
                });
   //     mainMenuStack.getChildren().add(bn1);
      //  bn1.setOnAction(e-> SimulationWindow.display("SimulationWindow","Tosimpage");
           
        
        Button btn2 = new Button();
        btn2.setText("Previous Simulations");
        btn2.setTranslateY(240);
        btn2.setTranslateX(325);
        btn2.setStyle("-fx-padding: 5px");
        btn2.setStyle("-fx-font-weight: bold");
        btn2.setStyle("-fx-background-radius:50");
        btn2.setStyle("-fx-font-size: 20px");
        btn2.setOnAction((ActionEvent event)-> {
           root.getChildren().clear();
           root.getChildren().add(loadmenu);
        
        });
          
        Label Title = new Label();
        Title.setText("Solar System Simulator");
        Title.setStyle("-fx-font-size:30px;");
        Title.setTextFill(Color.web("#FFFFFF"));
        Title.setTranslateY(10);
        Title.setTranslateX(265);
   
        
        mainMenuStack.getChildren().add(mainMenuVbox);  
        mainMenuVbox.getChildren().addAll(Title, bn1, btn2);
         
    }
    
    
    private void savepage() {
        Button b2 = new Button();
        b2.setText("Main menu");
        b2.setOnAction((ActionEvent event)-> {
            root.getChildren().clear();
            root.getChildren().add(mainMenuStack);
        });
        
        Image imgBack = new Image(getClass().getResourceAsStream("32.png"));
        ImageView ivBack = new ImageView(imgBack);
        loadmenu.getChildren().add(ivBack);
        
                Label header = new Label();
        header.setText("Previous Saves");
        header.setStyle("-fx-font-size:30px;");
        header.setTextFill(Color.web("#FFFFFF"));
        header.setTranslateY(10);
        header.setTranslateX(310);
        
        loadmenu.getChildren().add(save);  
        save.getChildren().addAll(header);
          
    }
    
 
private void settings() {
      
Button b1 = new Button();
b1.setText("Main menu");

b1.setOnAction((ActionEvent event) -> {
           root.getChildren().clear();
           root.getChildren().add(mainMenuStack);
        });

        Label Title = new Label();
        Title.setText("Settings");
        Title.setStyle("-fx-font-size:30px;");
        Title.setTextFill(Color.web("#FFFFFF"));
        Title.setTranslateY(10);
        Title.setTranslateX(350);

        Image imgBack = new Image(getClass().getResourceAsStream("32.png"));
        ImageView ivBack = new ImageView(imgBack);
        
        
        settingmenu.getChildren().add(ivBack);
        
        settingmenu.getChildren().add(settingVbox);  
        settingVbox.getChildren().addAll(Title, b1);
    }
    
    
            public void settingButton() {
        // Createing an image    
        Image image = new Image(getClass().getResourceAsStream("settingicon.png"));
        //Setting the isetting
        ImageView isetting = new ImageView(image);
        //Setting the position of the image
        isetting.setTranslateY(-260);
        isetting.setTranslateX(320);
        
        isetting.setFitHeight(50);
        isetting.setFitWidth(50);
        //Creating an event, activated by clicking the image
        isetting.setOnMouseClicked((MouseEvent e)->{
        System.out.println("Works");
        root.getChildren().clear(); //Clears out the stage
        root.getChildren().add(settingmenu); // Loads the settig StackPane in the stage   
        });
        mainMenuStack.getChildren().add(isetting);
 
    }
        private void Selection() {
           
            selectionpane.setVgap(6);
            selectionpane.setHgap(5);
            
            
            Label title = new Label();
            title.setText("Select Objects");
            title.setTranslateY(10);
            title.setTranslateX(310);
            title.getStyleClass().add("label");
            
        
            numberofplanets = new Sliders(0,2);
            numberofstars = new Sliders(0,1);
           
           Selection.getChildren().add(selectionpane);
           selectionpane.getChildren().addAll(title,numberofplanets,numberofstars);
           
            
        }    

    

    
}
