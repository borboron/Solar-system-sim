/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author 8753
 */
public class SimulationWindow {
    Mover m ;
    Attractor a;
    

  
    Stage stage = new Stage();
    
    public SimulationWindow(double width, double height) {
        
        Group SolarSystem = new Group();
        
        Scene scene = new Scene(SolarSystem, width,height);
        Image imgBack = new Image(getClass().getResourceAsStream("32.png"));
        ImageView ivBack = new ImageView(imgBack);
        
        
        SolarSystem.getChildren().add(ivBack);
        stage.setTitle("Simulation Window");
        stage.show();
        stage.setScene(scene);
                
        //add celestial objects               
//         Planet p = new Planet(500, 25, 9.8, "Earth2", Color.BLUE, 300, 300);
//          Planet s = new Planet(500, 30, 9.8, "Earth3", Color.ORANGE, 90, 50);
//           Planet r = new Planet(500, 20, 9.8, "Earth4", Color.PURPLE, 400, 200);
//            Planet n = new Planet(500, 40, 9.8, "Earth5", Color.RED, 50, 50);
//             Planet i = new Planet(500, 28, 9.8, "Earth6", Color.PINK, 500, 150);
//              Star q = new Star(1000, 100, 9.8, "Sun" , Color.YELLOW, 400,300);
          
//       SolarSystem.getChildren().add(p.getCircle());
//       SolarSystem.getChildren().add(q.getCircle());
//       SolarSystem.getChildren().add(s.getCircle());
//       SolarSystem.getChildren().add(r.getCircle());
//       SolarSystem.getChildren().add(i.getCircle());
//       SolarSystem.getChildren().add(n.getCircle());

Mover p = new Mover(300,300,500,40,"Earth", Color.AQUA);
SolarSystem.getChildren().add(p.getCircle());
Mover q = new Mover(500,500,600,60,"Pluto", Color.CORAL);
SolarSystem.getChildren().add(q.getCircle());
Attractor m = new Attractor(450,300,600,70,"Sun", Color.BLUEVIOLET);
SolarSystem.getChildren().add(m.getCircle());

//PVector attract(Mover p) {
//        
//        
//    }

       PVector force = a.attract(m);
       m.applyForce(force);
       m.update();
       
       
        
       
       
    }
//    
//    void draw() {
//        a.display();




    
    
      

}