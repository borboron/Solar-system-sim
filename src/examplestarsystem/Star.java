/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;

import javafx.scene.paint.Color;

/**
 *
 * @author 8753
 */
public class Star extends CelestialBody {
    
    public Star(double mass, double radius, double gForce, String name, Color color, double x, double y) {
        super(mass, radius, gForce, name, color, x, y);
    }
    
}
