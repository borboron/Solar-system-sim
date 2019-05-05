/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;

import javafx.scene.control.Slider;

/**
 *
 * @author 8753
 */
public class Sliders extends Slider {

    Slider slide; // Creates a slider

    // Constructor for used to create sliders
    public Sliders(int min, int max) {
        this.slide = new Slider(min, max, max / 2);
        this.getStyleClass().add("System.css"); // Links the css stylesheet
        this.setMin(min);
        this.setMax(max);
        this.setShowTickMarks(true);
        this.setShowTickLabels(true);
    }

}
