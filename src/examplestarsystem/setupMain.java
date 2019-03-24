/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;

import javafx.event.ActionEvent;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Screen;

/**
 *
 * @author cyber
 */
public class setupMain extends ExampleStarSystem{
    StackPane mainMenuStack = new StackPane();
    VBox mainMenuVbox = new VBox();
    VBox settingVbox = new VBox();
    VBox selectionVbox = new VBox();
    StackPane settingmenu = new StackPane();
    Group root = new Group();
   // GridPane hello = new GridPane();
    GridPane Selection = new GridPane();
    Screen screen = Screen.getPrimary();
    Rectangle2D bounds = screen.getVisualBounds();
    StackPane loadmenu = new StackPane();
    Button btn = new Button();
    
    public void setupMain(){
        btn.setText("Create a Simulation");
        btn.setTranslateY(220);
        btn.setTranslateX(320);
        btn.setMaxWidth(220);
        btn.setStyle("-fx-font-weight: bold");
        btn.setStyle("-fx-background-radius: 20,-fx-padding:10px");
       
        btn.setStyle("-fx-font-size: 20px");
       
       
        btn.setOnAction((ActionEvent event)-> {
            root.getChildren().clear();
            root.getChildren().add(Selection);
        });
        
        Button btn1 = new Button();
        btn1.setText("Settings");
        btn1.setTranslateY(-70);
        btn1.setTranslateX(730);
        btn1.setStyle("-fx-padding: 5px");
        btn1.setOnAction((ActionEvent event) -> {
           root.getChildren().clear();
           root.getChildren().add(settingmenu);
        });
        
         Button btn2 = new Button();
        btn2.setText("Previous Simulations");
        btn2.setTranslateY(500);
        btn2.setTranslateX(320);
        btn2.setStyle("-fx-padding: 5px");
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
       
               
        
        
       //create a background image
        Image imgBack = new       
        Image(getClass().getResourceAsStream("32.png"));
         
        ImageView ivBack = new ImageView(imgBack);
        //ivBack.setFitWidth(1300);
//        ivBack.setFitHeight(1000);
        ivBack.setPreserveRatio(true);
        
        mainMenuStack.getChildren().add(ivBack);
        
        mainMenuStack.getChildren().add(mainMenuVbox);  
        mainMenuVbox.getChildren().addAll(Title, btn, btn1);
        
        //add celestial objects               
//         Planet p = new Planet(500, 40, 9.8, "Earth2", Color.BLUE, 300, 300);
//         Planet s = new Planet(500, 40, 9.8, "Earth3", Color.ORANGE, 90, 50);
//          Planet r = new Planet(500, 40, 9.8, "Earth4", Color.PURPLE   , 400, 200);
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
//        root.getChildren().add(mainMenuStack);
       
    }
}
