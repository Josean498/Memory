/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author Jose
 */
public class Memory extends Application {
    @Override
    public void start(Stage primaryStage) {

        TableroView tableroView = new TableroView();
        
        // Contenedor para alinear el tablero en centro horizontalmente
        HBox hBox = new HBox(tableroView.getGridTablero());
        hBox.setAlignment(Pos.CENTER);
        
        // Contenedor secundario para alinear los botones en centro horizontalmente
        HBox hBoxBotones = new HBox(); 
        hBoxBotones.setPadding(new Insets(15, 12, 15, 12));
        hBoxBotones.setSpacing(10);
        hBoxBotones.setAlignment(Pos.CENTER);
        
        Button buttonJugar = new Button("Jugar");
        buttonJugar.setPrefSize(100, 20);

        Button buttonSalir = new Button("Salir");
        buttonSalir.setPrefSize(100, 20);
        hBoxBotones.getChildren().addAll(buttonJugar, buttonSalir);
        
        // Contenedor principal será de tipo VBox para centrar tablero verticalmente
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(root, 700, 700);
        primaryStage.setTitle("Memory");
        primaryStage.setScene(scene);
        primaryStage.show();

        tableroView.mostrarTablero();
        System.out.println("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}