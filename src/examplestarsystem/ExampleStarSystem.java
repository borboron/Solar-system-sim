/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    
    private void setupMain() {
        Button btn = new Button();
        btn.setText("Create a Simulation");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Choose as star");
            }
        });
        
        Button btn1 = new Button();
        btn1.setText("Settings");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("1 Star or 2 Stars");
            }
        });
                
        Label b1Text = new Label();
        b1Text.setText("1 Star");
        
        mainMenuVbox.getChildren().addAll(b1Text, btn, btn1);
        
        
                //add celestial objects
        Planet p = new Planet(500, 40, 9.8, "Earth2", Color.BLUE, 300, 300);
         Planet s = new Planet(500, 40, 9.8, "Earth2", Color.ORANGE, 90, 50);
          Planet r = new Planet(500, 40, 9.8, "Earth2", Color.PURPLE, 400, 200);
           Planet n = new Planet(500, 40, 9.8, "Earth2", Color.RED, 50, 50);
            Planet i = new Planet(500, 40, 9.8, "Earth2", Color.GOLD, 150, 150);
        Star q = new Star(1000, 100, 9.8, "Sun" , Color.YELLOW, 400,300);
        
       
        
        
        
        
       
        mainMenuStack.getChildren().add(p.getCircle());
        mainMenuStack.getChildren().add(q.getCircle());
        mainMenuStack.getChildren().add(s.getCircle());
        mainMenuStack.getChildren().add(r.getCircle());
        mainMenuStack.getChildren().add(i.getCircle());
        mainMenuStack.getChildren().add(n.getCircle());
        
         Image imgBack = new
            Image(getClass().getResourceAsStream("32.png"));
        ImageView ivBack = new ImageView(imgBack);
        mainMenuStack.getChildren().add(ivBack);
        mainMenuStack.getChildren().add(mainMenuVbox);  
    }
    
    
    private void setupFirstchoice() {
        
        
        
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        
        
        setupMain();

        
        
        Group root = new Group();
        Scene scene = new Scene(root, 800,600);
        
        
        root.getChildren().add(mainMenuStack);
        
        
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
