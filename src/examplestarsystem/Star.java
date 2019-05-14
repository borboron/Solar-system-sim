/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author 8753
 */
public class Star extends Circle {

    Point2D location; 
    double mass;

    public Star(Point2D location, double mass) {
        this.location = location;
        this.mass = mass;
        setRadius(Objects.starRadius);
        setStroke(Color.YELLOW);
        setFill(Color.YELLOW); 
    }

    public Point2D attract(Planet b) {
        Point2D force = location.subtract(b.location); // Works out direction of the force
        double distance = force.magnitude(); // Uses the mganitude of the vector, to find the distance between planet and star
        force = force.normalize(); // Scales force to 1
        double magnitude = (Objects.G * mass * b.mass) / (distance * distance); // Works out length of vector in order to work out the attraction
        force = force.multiply(magnitude); // Mulitplies force by the magnitutde
        return force;

    }

    public void display() {
        setCenterX(location.getX());//Finds out X-axis location
        setCenterY(location.getY());// Finds out Y-axis location
    }

}
