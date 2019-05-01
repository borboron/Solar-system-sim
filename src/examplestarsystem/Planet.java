/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;


import java.util.Random;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;


import javafx.scene.shape.Circle;

/**
 *
 * @author 8753
 */
public class Planet extends Circle {
    Point2D location;
    Point2D velocity;
    Point2D acceleration;
    double mass;


    
    
   public Planet(Point2D location, Point2D velocity, Point2D acceleration, double mass) {   
        this.location = location;
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.mass = mass;
        setRadius(Objects.planetRadius);
        
        Random q = new Random();
        int red = q.nextInt(255);
        int green = q.nextInt(255);
        int blue = q.nextInt(255);
        setStroke(Color.rgb(red, green, blue, .99));
        setFill(Color.rgb(red, green, blue, .99));       
    }


    
    public void applyForce(Point2D force) {
        
        Point2D a = new Point2D(force.getX(),force.getY());
        a = a.multiply(1/Objects.planetMass);
        acceleration = acceleration.add(a);
    }
    
    public void update() {
       velocity =  velocity.add(acceleration);
       location = location.add(velocity);
       acceleration = new Point2D(0,0);   
    }
    
    public void display() {
     setCenterX(location.getX());
     setCenterY(location.getY());
     
    }

}  