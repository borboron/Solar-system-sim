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
    Button button;
    String label;
    
    Buttons(String Label) {
        this.button = new Button();
        this.setText(Label);
        this.getStyleClass().add("System.css");
        this.setVisible(true);
        this.setMinWidth(150);
        this.setMinHeight(80);
        this.label = Label;
    }
    
    public String getLabel() {
        return label;
    }
    
    public void setLabel(String Label) {
        this.label = Label;
        this.setText(Label);
    
}
}