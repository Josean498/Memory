/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
/**
 *
 * @author Tomas
 */
public class Tablero {
    GridPane gridTablero = new GridPane();
    Image imageBurro = new Image(getClass().getResourceAsStream("/img/burro.png"));
    Image imageCastor = new Image(getClass().getResourceAsStream("/img/castor.png"));
    Image imageElefante = new Image(getClass().getResourceAsStream("/img/elefante.png"));
    Image imageFoca = new Image(getClass().getResourceAsStream("/img/foca.png"));
    Image imageGallina = new Image(getClass().getResourceAsStream("/img/gallina.png"));
    Image imageLeon = new Image(getClass().getResourceAsStream("/img/leon.png"));
    Image imageMono = new Image(getClass().getResourceAsStream("/img/mono.png"));
    Image imageOso = new Image(getClass().getResourceAsStream("/img/oso.png"));
    
    public GridPane getGridTablero () {
        return gridTablero;
    }
    
    public void ponerRectangulo() {
        
        Casilla casilla = new Casilla();

        for(int y=0; y<4; y++) {
            for(int x=0; x<4; x++) {
                switch(casilla.matrizTablero[x][y]) {
                    case 'B':
                        // Hacer un grupo con el gridTablero en todos los casos!!!!
                        Rectangle rectangle = new Rectangle(40, 60);    
                        ImageView imageBurro1 = new ImageView(imageBurro);
                        gridTablero.add(rectangle, x, y);
                        gridTablero.add(imageBurro1, x, x);
                        break;
                    case 'C' :
                        Rectangle rectangle2 = new Rectangle(40, 60); 
                        ImageView imageCastor1 = new ImageView(imageCastor);                        
                        gridTablero.add(rectangle2, x, y);
                        gridTablero.add(imageCastor1, x, x);
                        break;   
                    case 'E' :
                        Rectangle rectangle3 = new Rectangle(40, 60);
                        ImageView imageElefante1 = new ImageView(imageElefante);
                        gridTablero.add(rectangle3, x, y);
                        gridTablero.add(imageElefante1, x, x);
                        break;
                    case 'F' :
                        Rectangle rectangle4 = new Rectangle(40, 60);
                        ImageView imageFoca1 = new ImageView(imageFoca);
                        gridTablero.add(rectangle4, x, y);
                        gridTablero.add(imageFoca1, x, x);
                        break;
                    case 'G' :
                        Rectangle rectangle5 = new Rectangle(40, 60);
                        ImageView imageGallina1 = new ImageView(imageGallina);
                        gridTablero.add(rectangle5, x, y);
                        gridTablero.add(imageGallina1, x, x);
                        break;
                    case 'L' :
                        Rectangle rectangle6 = new Rectangle(40, 60);
                        ImageView imageLeon1 = new ImageView(imageLeon);
                        gridTablero.add(rectangle6, x, y);
                        gridTablero.add(imageLeon1, x, x);
                        break;
                    case 'M' :
                        Rectangle rectangle7 = new Rectangle(40, 60);
                        ImageView imageMono1 = new ImageView(imageMono);
                        gridTablero.add(rectangle7, x, y);
                        gridTablero.add(imageMono1, x, x);
                        break;
                    case 'O' :
                        Rectangle rectangle8 = new Rectangle(40, 60);
                        ImageView imageOso1 = new ImageView(imageOso);
                        gridTablero.add(rectangle8, x, y);
                        gridTablero.add(imageOso1, x, x);
                        break;   
                }
            }
        }           
    }
}
