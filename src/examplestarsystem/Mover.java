/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author 8753
 */
class Mover {
    PVector location;
    PVector velocity;
    PVector acceleration;
    double mass;
    double radius;
    String name;
    Circle circle;
    double x;
    double y;
    
    
    
    Mover(double x, double y, double mass, double radius, String name, Color color) {
        
        location = new PVector(x,y);
        velocity = new PVector(0,0);
        acceleration = new PVector(0,0);
        this.mass = mass;
        this.radius = radius;
        this. name = name;
        this.circle = new Circle(x, y, radius, color);
        
    }
    
    public void applyForce(PVector force) {
        force.div(mass);
        acceleration.add(force);
    }
    
    public void update() {
        velocity.add(acceleration);
        location.add(velocity);
        acceleration.times(0);     
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
    
    
    
    
}
