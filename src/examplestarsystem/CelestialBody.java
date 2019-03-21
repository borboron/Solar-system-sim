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
public abstract class CelestialBody {

    private double mass;
    private double radius;
    private double gForce;
    private String name;
    private Circle circle;
    private double x;
    private double y;

    CelestialBody(double mass, double radius, double gForce, String name, Color color, double x, double y) {
        this.mass = mass;
        this.radius = radius;
        this.gForce = gForce;
        this.name = name;
        circle = new Circle(x, y, radius, color);
        this.x = x;
        this.y = y;
    }

    /**
     * @return the mass
     */
    public double getMass() {
        return mass;
    }

    /**
     * @param mass the mass to set
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return the gForce
     */
    public double getgForce() {
        return gForce;
    }

    /**
     * @param gForce the gForce to set
     */
    public void setgForce(double gForce) {
        this.gForce = gForce;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the circle
     */
    public Circle getCircle() {
        return circle;
    }

    /**
     * @param circle the circle to set
     */
    public void setCircle(Circle circle) {
        this.circle = circle;
    }

}