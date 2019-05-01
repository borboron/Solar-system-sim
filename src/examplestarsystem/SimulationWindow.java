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
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author 8753
 */
public class SimulationWindow {

    Stage stage = new Stage();
    Group SolarSystem = new Group();

    public SimulationWindow(double width, double height) {
        Scene scene = new Scene(SolarSystem, width, height);
        Image imgBack = new Image(getClass().getResourceAsStream("32.png"));
        ImageView ivBack = new ImageView(imgBack);

        SolarSystem.getChildren().add(ivBack);
        stage.setTitle("Simulation Window");
        stage.setScene(scene);
        stage.show();

//        Planet p = new Planet(500, 25, 9.8, "Earth2", Color.BLUE, 300, 300); // Adds a planet object
//        Planet s = new Planet(500, 30, 9.8, "Earth3", Color.ORANGE, 90, 50); // Adds a planet object
//        Planet r = new Planet(500, 20, 9.8, "Earth4", Color.PURPLE, 400, 200); // Adds a planet object
//        Planet n = new Planet(500, 40, 9.8, "Earth5", Color.RED, 50, 50); // Adds a planet object
//        Planet i = new Planet(500, 28, 9.8, "Earth6", Color.PINK, 500, 150); // Adds a planet object
//        Star q = new Star(1000, 100, 9.8, "Sun", Color.YELLOW, 400, 300); // Adds a star object
//
//        // Displays the objects on the screen
//        SolarSystem.getChildren().add(p.getCircle());
//        SolarSystem.getChildren().add(q.getCircle());
//        SolarSystem.getChildren().add(s.getCircle());
//        SolarSystem.getChildren().add(r.getCircle());
//        SolarSystem.getChildren().add(i.getCircle());
//        SolarSystem.getChildren().add(n.getCircle());

    }

//    private void StartSimulation() {
//  Attractor a =  new Attractor(new Point2D(width/2,height/2),200,50,"SUN",6.358);
//  Mover m = new Mover(new Point2D(400,400),
//                      new Point2D(-3,0),
//                      new Point2D(0,0),
//                      100, 20, "EARTH");
//        SolarSystem.getChildren().add(a);
//        SolarSystem.getChildren().add(m);
//        Movers.add(m);
//        
//        gameLoop = new AnimationTimer() {
//      @Override
//      public void handle(long now) {
//          
//          a.display();
//          Movers.forEach(m -> {
//              Point2D force =  a.attract(m);
//              m.applyForce(force);
//              m.move();
//              m.display();
//              });
//          
//      }
//  }; {
//        
//        
//    }
//
//  
//    }
}
