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
 class Attractor {
  double mass;
  double radius;
  String name;
  Circle circle;
  PVector location;
  double G;  
  final int width= 900;
  final int height = 600;
  double x;  
  double y;
  
  Attractor(double x, double y , double mass , double radius, String name, Color color) {
    location = new PVector(width/2,height/2);
    this.mass = mass;
    this.radius = radius;
    this.name = name;
    this.circle = new Circle(x, y, radius, color);
}
  
  PVector attract(Mover m ) {
     PVector force =  PVector.sub(location, m.location);
     double distance = force.magnitude();
     force.normalize();
     
     double strength = (G * mass * m.mass) / (distance * distance);
     force.times(strength);
     return force;
      
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

    public double getG() {
        return G;
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

    public void setG(double G) {
        this.G = G;
    }

    public PVector getLocation() {
        return location;
    }

    public void setLocation(PVector location) {
        this.location = location;
    }
  
  
 
    
      

 }
