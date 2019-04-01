/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import static javafx.scene.paint.Color.BLACK;
import javafx.stage.Stage;
/**
 *
 * @author Jose
 */
public class Memory extends Application {
    @Override
    public void start(Stage primaryStage) {
        
        StackPane root = new StackPane();
        Scene scene = new Scene(root,800,800, BLACK);
        primaryStage.setTitle("Memory");
        primaryStage.setScene(scene);
        primaryStage.show(); 

        TableroView casilla = new TableroView();
        root.getChildren().add(casilla.getGridTablero());
        casilla.mostrarTablero();
        System.out.println("");        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}