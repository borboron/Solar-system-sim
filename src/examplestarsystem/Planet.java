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

    public Planet(Point2D location, Point2D velocity, Point2D acceleration, double mass) { // Creates constructor with parameters to pass on
        this.location = location;
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.mass = mass;
        setRadius(Objects.planetRadius); // The radius of the planets is the value retrieved from the slider

        //Generates a random colour 
        Random q = new Random();
        int red = q.nextInt(255);
        int green = q.nextInt(255);
        int blue = q.nextInt(255);
        //Generates a random stroke colour for every plane
        setStroke(Color.rgb(red, green, blue, .99));
        //Generates a radnom fill colour for every planet
        setFill(Color.rgb(red, green, blue, .99));
    }

    public void applyForce(Point2D force) { // Function to work out the force applied on the planet by the star
        Point2D a = new Point2D(force.getX(), force.getY());
        a = a.multiply(1 / Objects.planetMass); // Works out acceleration
        acceleration = acceleration.add(a); // Updates new acceleration
    }

    public void update() {
        velocity = velocity.add(acceleration); // Updates the velocity
        location = location.add(velocity); // Updates the location
        acceleration = new Point2D(0, 0); // Sets the acceleration to 0
    }

    public void display() {
        setCenterX(location.getX()); // Finds out X-axis location
        setCenterY(location.getY()); // Finds out Y-axis location

    }

}
