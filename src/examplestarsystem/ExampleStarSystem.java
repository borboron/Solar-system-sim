/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author 8753
 */
public class ExampleStarSystem extends Application {

    Scene scene; // Creates a global scene
    Group root = new Group(); // Creates a group container
    StackPane mainMenuStack = new StackPane(); // Creates a StackPane container for the "Main" page
    VBox mainMenuVbox = new VBox(); // Creates a vertical box for the "Main" page
    Pane simulation = new Pane(); // Creates a StackPane container for the "Selection" page
    StackPane loadmenu = new StackPane(); // Creates a StackPane container for the "Previous saves" page
    VBox save = new VBox(); // Creates a vertical box for the "Previous saves" page
    StackPane settingmenu = new StackPane(); // Creates a StackPane container for the "Settings" page
    VBox settingVbox = new VBox(); //Creates a vertical box for the "Settings" page
    GridPane selectionpane = new GridPane(); //Creates a GridPane container for the "Selection" page
    Buttons Simulation, Save, menu, menu2, menu3;
    ArrayList<Planet> Planets = new ArrayList<>();
    ArrayList<Star> Stars = new ArrayList<>();
    AnimationTimer simLoop;


    public static void main(String[] args) {
        launch(args); // runs the override method
    }

    @Override
    public void start(Stage window) throws Exception {
        Pane mainRoot = new Pane(); // Creates a container in the stage which is used to hold objects
        mainRoot.getChildren().add(root);// Places a Group within the Pane. The group is used for buttons and labels

        root.getChildren().add(mainMenuStack); // Adds the mainMenuStack to the empty Group "root"

        window.getIcons().add(new Image(getClass().getResourceAsStream("downlaod123.png"))); // Sets file "donwload123.png" as the icon of the stage window

        scene = new Scene(mainRoot, Objects.width, Objects.height); // Creates a new scene which is layed out using a Pane and has preset width and height parameters
        scene.getStylesheets().add(getClass().getResource("System.css").toExternalForm()); // Assigns the stylesheet "System.css" to the scene 

        callingsubroutines(); // Calls the subroutine "callingsubroutines" which in turn calls the rest of the subroutines
        window.setResizable(false); // Makes the window non-resizable
        window.setTitle("Solalsystem.exe"); // Sets the title of the stage as "SolarSystem.exe"
        window.setScene(scene); //Places the Scene scene within the empty stage
        window.show(); //Displays the stage with all of its contents
//        SW = new SimulationWindow(Objects.width,Objects.height); // Creates a new window that is run at the same time as the main
    }

    // A subroutine that calls all the other subroutines
    public void callingsubroutines() {
        setupMain();
        settings();
        settingButton();
        Selection();
        savepage();
    }

    private void setupMain() {
        Simulation = new Buttons("Simulation"); //Creates an instance of a button from the object class
        Simulation.setText("Create a Simulation"); // Sets button name as "Create a Simulation"
        Simulation.setTranslateY(190); // Sets Y coordinates
        Simulation.setTranslateX(575); // Sets X coordinates
        Simulation.setMaxWidth(208);  // Enlarges button
        Simulation.setOnAction((ActionEvent event) -> { // Sets action on the button when clicked
            root.getChildren().clear(); // Clears the Main page from the Group
            root.getChildren().add(simulation); // Add the Selection page to the Group
        });

        Save = new Buttons("Save");
        Save.setText("Previous Simulations");
        Save.setTranslateY(240); // Sets Y coordinates
        Save.setTranslateX(575); // Sets X coordinates
        Save.setOnAction((ActionEvent event) -> { // Sets action on the button when clicked
            root.getChildren().clear(); // Clears the Main page from the Group
            root.getChildren().add(loadmenu); // Add the Save page to the Group
        });

        Label Title = new Label(); // Creates a new label
        Title.setText("Solar System Simulator"); // Sets the title of the lable as "Solar System Simulator"
        Title.setTranslateY(10); // Sets Y coordinates
        Title.setTranslateX(460); // Sets X coordinates

        Image imgBack = new // Create a background image       
        Image(getClass().getResourceAsStream("32.png")); // References the image that is in the same package as the project
        ImageView ivBack = new ImageView(imgBack); // Displays the image on the window

        mainMenuStack.getChildren().add(ivBack); // Adds the image to the StackPane
        mainMenuStack.getChildren().add(mainMenuVbox); // Adds the VBox to the StackPane
        mainMenuVbox.getChildren().addAll(Title, Simulation, Save); // Adds the label and two buttons to the VBox

    }

    // Subroutine for creating the Save page
    private void savepage() {
        menu = new Buttons("menu"); // Creates a button
        menu.setTranslateX(1);
        menu.setTranslateY(-55);
        menu.setText("Main menu");
        menu.setOnAction((ActionEvent event) -> {
            root.getChildren().clear();
            root.getChildren().add(mainMenuStack);
        });

        Label header = new Label();
        header.setText("Previous Saves");
        header.setTranslateY(10);
        header.setTranslateX(310);

        Image imgBack = new Image(getClass().getResourceAsStream("32.png"));
        ImageView ivBack = new ImageView(imgBack);
        loadmenu.getChildren().add(ivBack);

        loadmenu.getChildren().add(save);
        save.getChildren().addAll(header, menu);
    }

    // Subroutine for creating the Settings page
    private void settings() {
        menu2 = new Buttons("menu2");// Creates a new button
        menu2.setTranslateX(1);
        menu2.setTranslateY(-55);
        menu2.setText("Main menu");
        menu2.setOnAction((ActionEvent event) -> {
            root.getChildren().clear();
            root.getChildren().add(mainMenuStack);
        });

        Label Title = new Label();
        Title.setText("Settings");
        Title.setTranslateY(10);
        Title.setTranslateX(350);

        Image imgBack = new Image(getClass().getResourceAsStream("32.png"));
        ImageView ivBack = new ImageView(imgBack);

        settingmenu.getChildren().add(ivBack);

        settingmenu.getChildren().add(settingVbox);
        settingVbox.getChildren().addAll(Title, menu2);
    }

    // Subroutine for creating the Selection page
    private void Selection() {
        menu3 = new Buttons("menu3"); // Creates a new button
        menu3.setTranslateX(1);
        menu3.setTranslateY(10);
        menu3.setText("Main menu");
        menu3.setOnAction((ActionEvent event) -> {
            root.getChildren().clear();
            root.getChildren().add(mainMenuStack);
        });

        Label title = new Label();
        title.setText("Select Objects");
        title.setTranslateY(10);
        title.setTranslateX(310);

        Image imgBack = new Image(getClass().getResourceAsStream("32.png"));
        ImageView ivBack = new ImageView(imgBack);

        simulation.getChildren().add(ivBack);
        simulation.getChildren().add(selectionpane);
        selectionpane.getChildren().addAll(title, menu3);
        CreateSimulation();
    }

    private void CreateSimulation() {
        Star a = new Star(new Point2D(Objects.width / 2, Objects.height / 2), Objects.starMass);
        Planet b = new Planet(
                new Point2D(400, 400),
                new Point2D(-2, 2),
                new Point2D(2, 4),
                Objects.planetMass);

        simulation.getChildren().add(a);
        simulation.getChildren().add(b);
        Planets.add(b);

        simLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                a.display();
                Planets.forEach(b -> {
                    Point2D force = a.attract(b);
                    b.applyForce(force);
                    b.update();
                    b.display();
                });

                EventHandler<MouseEvent> planetAdd = new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        double r = (Math.random() * (-4)) - 2 ;
                        double s  =(Math.random() * (1)) + 2;
                        Planet b = new Planet(
                                new Point2D(event.getX(), event.getY()),
                                new Point2D(-8,-2),
                                new Point2D(2,2),
                                Objects.planetMass);

                        Planets.add(b);
                        simulation.getChildren().add(b);
                    }

                };
                scene.setOnMouseClicked(planetAdd);

            }

        };
        simLoop.start();

    }

    public void settingButton() {
        // Creates a new image    
        Image image = new Image(getClass().getResourceAsStream("settingicon.png"));
        //Displays the image
        ImageView isetting = new ImageView(image);
        //Setting the position of the image
        isetting.setTranslateY(-380);
        isetting.setTranslateX(600);
        //Alters the size of the image
        isetting.setFitHeight(75);
        isetting.setFitWidth(75);
        //Creating an event, activated by clicking the image
        isetting.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Works");
            root.getChildren().clear();
            root.getChildren().add(settingmenu);
        });
        mainMenuStack.getChildren().add(isetting);

    }

}
