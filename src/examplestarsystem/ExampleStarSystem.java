/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.scene.control.Slider;
import javafx.scene.layout.Priority;


/**
 *
 * @author 8753
 */
public class ExampleStarSystem extends Application{
        
    StackPane mainMenuStack = new StackPane();
    VBox mainMenuVbox = new VBox();
    VBox settingVbox = new VBox();
    GridPane selectionpane = new GridPane();
    StackPane settingmenu = new StackPane();
    Group root = new Group();
   // GridPane hello = new GridPane();
    StackPane Selection = new StackPane();
    Screen screen = Screen.getPrimary();
    Rectangle2D bounds = screen.getVisualBounds();
    StackPane loadmenu = new StackPane();
    VBox save = new VBox();
    
    
     public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        // primaryStage.setFullScreen(true);
        Stage window = primaryStage;
        callingsubroutines(); 
//        window.setX(bounds.getMinX());
//        window.setY(bounds.getMinY());
//        window.setWidth(bounds.getWidth());
//        window.setHeight(bounds.getHeight());
        
        root.getChildren().add(mainMenuStack);
      
        Scene scene = new Scene(root, 800,580);
        scene.getStylesheets().add("System.css");
        primaryStage.setResizable(false);
     
        window.setTitle("Solalsystem.exe");
        window.setScene(scene);
        window.show();
    }
    
       public void callingsubroutines() {      
        setupMain();
        settings();
        settingButton();
        Selection();
        savepage();
    }
      
    private void setupMain() {
        Button btn = new Button();
        btn.setText("Create a Simulation");
        btn.setTranslateY(190);
        btn.setTranslateX(320);
        btn.setMaxWidth(220);
    //    btn.setStyle("-fx-font-weight: bold");
        btn.setStyle("-fx-border-radius: 40px");
        btn.setStyle("-fx-padding: 10px");
        btn.setStyle("-fx-font-size: 20px");
       
       
        btn.setOnAction((ActionEvent event)-> {
            root.getChildren().clear();
            root.getChildren().add(Selection);
        });
        
//        Button btn1 = new Button();
//        btn1.setText("Settings");
//        btn1.setTranslateY(-70);
//        btn1.setTranslateX(730);
//        btn1.setStyle("-fx-padding: 5px");
//        btn1.setOnAction((ActionEvent event) -> {
//           root.getChildren().clear();
//           root.getChildren().add(settingmenu);
//        });
        
        Button btn2 = new Button();
        btn2.setText("Previous Simulations");
        btn2.setTranslateY(240);
        btn2.setTranslateX(325);
        btn2.setStyle("-fx-padding: 5px");
        btn2.setStyle("-fx-font-weight: bold");
        btn2.setStyle("-fx-background-radius:50");
        btn2.setStyle("-fx-font-size: 20px");
        btn2.setOnAction((ActionEvent event)-> {
           root.getChildren().clear();
           root.getChildren().add(loadmenu);
        
        });
          
        Label Title = new Label();
        Title.setText("Solar System Simulator");
        Title.setStyle("-fx-font-size:30px;");
        Title.setTextFill(Color.web("#FFFFFF"));
        Title.setTranslateY(10);
        Title.setTranslateX(265);
       
               
        
        
       //create a background image
        Image imgBack = new       
        Image(getClass().getResourceAsStream("32.png"));
         
        ImageView ivBack = new ImageView(imgBack);
        //ivBack.setFitWidth(1300);
//        ivBack.setFitHeight(1000);
        ivBack.setPreserveRatio(true);
        
        mainMenuStack.getChildren().add(ivBack);
        
        mainMenuStack.getChildren().add(mainMenuVbox);  
        mainMenuVbox.getChildren().addAll(Title, btn, btn2);
        
//        //add celestial objects               
//         Planet p = new Planet(500, 40, 9.8, "Earth2", Color.BLUE, 300, 300);
//         Planet s = new Planet(500, 40, 9.8, "Earth3", Color.ORANGE, 90, 50);
//          Planet r = new Planet(500, 40, 9.8, "Earth4", Color.PURPLE   , 400, 200);
//           Planet n = new Planet(500, 40, 9.8, "Earth5", Color.RED, 50, 50);
//            Planet i = new Planet(500, 40, 9.8, "Earth6", Color.GOLD, 500, 150);
//        Star q = new Star(1000, 100, 9.8, "Sun" , Color.YELLOW, 400,300);
//        
//        
//       
//       mainMenuStack.getChildren().add(p.getCircle());
//       mainMenuStack.getChildren().add(q.getCircle());
//       mainMenuStack.getChildren().add(s.getCircle());
//       mainMenuStack.getChildren().add(r.getCircle());
//       mainMenuStack.getChildren().add(i.getCircle());
//       mainMenuStack.getChildren().add(n.getCircle());
        
        
       
    }
    
    
    private void savepage() {
        Button b2 = new Button();
        b2.setText("Main menu");
        b2.setOnAction((ActionEvent event)-> {
            root.getChildren().clear();
            root.getChildren().add(mainMenuStack);
        });
        
        Image imgBack = new Image(getClass().getResourceAsStream("32.png"));
        ImageView ivBack = new ImageView(imgBack);
        loadmenu.getChildren().add(ivBack);
        
                Label header = new Label();
        header.setText("Previous Saves");
        header.setStyle("-fx-font-size:30px;");
        header.setTextFill(Color.web("#FFFFFF"));
        header.setTranslateY(10);
        header.setTranslateX(310);
        
        loadmenu.getChildren().add(save);  
        save.getChildren().addAll(header);
        
        
        
    }
    
    private void settings() {
Button b1 = new Button();
b1.setText("Main menu");

b1.setOnAction((ActionEvent event) -> {
           root.getChildren().clear();
           root.getChildren().add(mainMenuStack);
        });

        Label Title = new Label();
        Title.setText("Settings");
        Title.setStyle("-fx-font-size:30px;");
        Title.setTextFill(Color.web("#FFFFFF"));
        Title.setTranslateY(10);
        Title.setTranslateX(350);

        Image imgBack = new Image(getClass().getResourceAsStream("32.png"));
        ImageView ivBack = new ImageView(imgBack);
        
        
        settingmenu.getChildren().add(ivBack);
        
        settingmenu.getChildren().add(settingVbox);  
        settingVbox.getChildren().addAll(Title, b1);
    }
    
    
            public void settingButton() {
        // Createing an image    
        Image image = new Image(getClass().getResourceAsStream("settingicon.png"));
        //Setting the isetting
        ImageView isetting = new ImageView(image);
        //Setting the position of the image
        isetting.setTranslateY(-260);
        isetting.setTranslateX(320);
        
        isetting.setFitHeight(50);
        isetting.setFitWidth(50);
        //Creating an event, activated by clicking the image
        isetting.setOnMouseClicked((MouseEvent e)->{
        System.out.println("Works");
        root.getChildren().clear();
        root.getChildren().add(settingmenu);   
        });
        mainMenuStack.getChildren().add(isetting);
 
    }
        private void Selection() {
            Label title = new Label();
            title.setText("Select Objects");
            title.setStyle("-fx-font-size:30px;");
            title.setTextFill(Color.web("#FFFFFF"));
            title.setTranslateY(10);
            title.setTranslateX(310);
            
            Image imgBack = new Image(getClass().getResourceAsStream("32.png"));
            ImageView ivBack = new ImageView(imgBack);
        
           Label nstars = new Label("Number of Stars");
           Slider star = new Slider(0,2,1);
           star.setShowTickLabels(true);
           star.setShowTickMarks(true);
           star.setMajorTickUnit(2);
           star.setMinorTickCount(5);
           star.setBlockIncrement(10);
           star.setTranslateX(50);
           star.setTranslateY(100);
           star.setMaxWidth(1000);
           GridPane.setHgrow(star, Priority.NEVER);
           Slider planet = new Slider(0,10,1);
           
        
           Selection.getChildren().add(ivBack);
           Selection.getChildren().add(selectionpane);
           selectionpane.getChildren().addAll(title, star, nstars, planet);
            
        }    
    

    
}
