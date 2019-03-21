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
import javafx.scene.Group;
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

/**
 *
 * @author 8753
 */
public class ExampleStarSystem extends Application {
    StackPane mainMenuStack = new StackPane();
    VBox mainMenuVbox = new VBox();
    VBox settingVbox = new VBox();
    StackPane settingmenu = new StackPane();
    Group root = new Group();
    GridPane hello = new GridPane();
    
        public void settingButton() {
        Image image = new
        Image(getClass().getResourceAsStream("set8.png"));
        ImageView isetting = new ImageView(image);
        
        isetting.setOnMouseClicked((MouseEvent e)->
        {
        System.out.println("Works");
        root.getChildren().clear();
        root.getChildren().add(settingmenu);
        
        
        isetting.setY(300);
        isetting.setX(700);
        
        isetting.setFitHeight(30);
         isetting.setFitWidth(30);
        
        
        });
        mainMenuStack.getChildren().add(isetting);
 
    }
    
    private void setupMain() {
        Button btn = new Button();
        btn.setText("Create a Simulation");
        btn.setTranslateY(300);
        btn.setTranslateX(400);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Choose as star");
            }
        });
        
        Button btn1 = new Button();
        btn1.setTranslateY(10);
        btn1.setTranslateX(700);
        btn1.setText("Go to the settings page");
       
        
       btn1.setOnAction((ActionEvent event) -> {
           root.getChildren().clear();
           root.getChildren().add(settingmenu);
        });
    
          
       
                
        Label Title = new Label();
        Title.setText("Solar System Simulator");
        Title.setStyle("-fx-font-size:20px;");
        Title.setTextFill(Color.web("#FFFFFF"));
        Title.setTranslateY(10);
        Title.setTranslateX(350);
       
               
        
        
        //create a background image
         Image imgBack = new
            Image(getClass().getResourceAsStream("32.png"));
        ImageView ivBack = new ImageView(imgBack);
        mainMenuStack.getChildren().add(ivBack);
        
        mainMenuStack.getChildren().add(mainMenuVbox);  
        mainMenuVbox.getChildren().addAll(Title, btn, btn1);
        
//        //add celestial objects               
//         Planet p = new Planet(500, 40, 9.8, "Earth2", Color.BLUE, 300, 300);
//         Planet s = new Planet(500, 40, 9.8, "Earth3", Color.ORANGE, 90, 50);
//          Planet r = new Planet(500, 40, 9.8, "Earth4", Color.PURPLE, 400, 200);
//           Planet n = new Planet(500, 40, 9.8, "Earth5", Color.RED, 50, 50);
//            Planet i = new Planet(500, 40, 9.8, "Earth6", Color.GOLD, 500, 150);
//        Star q = new Star(1000, 100, 9.8, "Sun" , Color.YELLOW, 400,300);
//        
//       
//       mainMenuStack.getChildren().add(p.getCircle());
//       mainMenuStack.getChildren().add(q.getCircle());
//       mainMenuStack.getChildren().add(s.getCircle());
//       mainMenuStack.getChildren().add(r.getCircle());
//       mainMenuStack.getChildren().add(i.getCircle());
//       mainMenuStack.getChildren().add(n.getCircle());
//        
       // root.getChildren().add(mainMenuStack);
    }
    
    private void settings() {
Button b1 = new Button();
b1.setText("Main menu");

b1.setOnAction((ActionEvent event) -> {
           root.getChildren().clear();
           root.getChildren().add(mainMenuStack);
        });





  Label Title = new Label();
        Title.setText("Setting");
        Title.setStyle("-fx-font-size:20px;");
        Title.setTextFill(Color.web("#FFFFFF"));
        Title.setTranslateY(10);
        Title.setTranslateX(350);




 Image imgBack = new
            Image(getClass().getResourceAsStream("32.png"));
        ImageView ivBack = new ImageView(imgBack);
        
        
        settingmenu.getChildren().add(ivBack);
        
        settingmenu.getChildren().add(settingVbox);  
        settingVbox.getChildren().addAll(Title, b1);
    }
    
    
    public void callingsubroutines() {
        
        setupMain();
        settings();
        settingButton();
       
        
    }
    
    @Override
    public void start(Stage primaryStage) {
        callingsubroutines(); 

        root.getChildren().add(mainMenuStack);
        Scene scene = new Scene(root, 800,600);
        //scene.getStylesheets().add("path/Style.css");
               
        primaryStage.setTitle("Solalsystem.exe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
