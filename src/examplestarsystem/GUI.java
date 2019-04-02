/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author 8753
 */
public class GUI {
    protected Stage primaryStage ;
    protected StackPane spane;
    
    GUI(int width , int height) {
        primaryStage = new Stage();
        
        spane = new StackPane();
        
        Scene scene = new Scene(spane, width, height);
        
        scene.getStylesheets().add(getClass().getResource("System.css").toExternalForm());
        
        this.primaryStage.setResizable(false);
        
        this.primaryStage.setScene(scene);
        
    }
    
    public void AddTitle(String title) {
        this.primaryStage.setTitle(title);
    }
    
    public void show() {
        primaryStage.show();
    }
            
    
}
