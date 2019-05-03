/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;

import javafx.scene.control.Button;

/**
 *
 * @author 8753
 */
public class Buttons extends Button {

    Button button; // Creates a button
    String label; // Creates a string

    // Creates a constructor for the button
    Buttons(String Label) {
        this.button = new Button();
        this.setText(Label);
        this.getStyleClass().add("System.css"); // Links the css stylesheet
        this.setVisible(true);
        this.setMinWidth(150);
        this.setMinHeight(80);
        this.label = Label;
    }

    // Getter for the Label
    public String getLabel() {
        return label;
    }

    // Setter for the Label
    public void setLabel(String Label) {
        this.label = Label;
        this.setText(Label);

    }
}
