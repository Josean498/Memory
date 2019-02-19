/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Jose
 */
public class Memory extends Application {
    @Override
    public void start(Stage primaryStage) {
     StackPane root = new StackPane();
     Scene scene = new Scene(root,500,500);
     
     primaryStage.setTitle("Memory");
     primaryStage.setScene(scene);
     primaryStage.show();
    
    Tablero tablero = new Tablero(); 
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
