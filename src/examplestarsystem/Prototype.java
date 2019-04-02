/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author 8753
 */
public class Prototype extends Application {

    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ExampleStarSystem UI = new ExampleStarSystem();
        SimulationWindow SW = new SimulationWindow();
        UI.show();
        SW.show();
    }
}
