/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
/**
 *
 * @author Tomas
 */
public class Tablero {
    GridPane gridTablero = new GridPane();
    
    public GridPane getGridTablero () {
        return gridTablero;
    }
    
    public void ponerRectangulos() {
        
        Casilla casilla = new Casilla();
        
        for(int y=0; y<4; y++) {
            for(int x=0; x<4; x++) {
                switch(casilla.matrizTablero[x][y]) {
                    case 'B' :
                        Rectangle rectangle = new Rectangle(20,10,400,600);
                        Image imageBurro = new Image(getClass().getResourceAsStream("img/burro.png"));
                        gridTablero.add(rectangle, x, y);
                        break;
                    case 'C' :
                        Rectangle rectangle2 = new Rectangle(40,10,400,600); 
                        Image imageCastor = new Image(getClass().getResourceAsStream("img/castor.png"));
                        gridTablero.add(rectangle2, x, y);
                        break;   
                    case 'E' :
                        Rectangle rectangle3 = new Rectangle(60,10,400,600);
                        Image imageElefante = new Image(getClass().getResourceAsStream("img/elefante.png"));
                        gridTablero.add(rectangle3, x, y);
                        break;
                    case 'F' :
                        Rectangle rectangle4 = new Rectangle(80,10,400,600);
                        Image imageFoca = new Image(getClass().getResourceAsStream("img/foca.png"));
                        gridTablero.add(rectangle4, x, y);
                        break;
                    case 'G' :
                        Rectangle rectangle5 = new Rectangle(20,30,400,600);
                        Image imageGallina = new Image(getClass().getResourceAsStream("img/gallina.png"));
                        gridTablero.add(rectangle5, x, y);
                        break;
                    case 'L' :
                        Rectangle rectangle6 = new Rectangle(40,30,400,600);
                        Image imageLeon = new Image(getClass().getResourceAsStream("img/leon.png"));
                        gridTablero.add(rectangle6, x, y);
                        break;
                    case 'M' :
                        Rectangle rectangle7 = new Rectangle(60,30,400,600);
                        Image imageMono = new Image(getClass().getResourceAsStream("img/mono.png"));
                        gridTablero.add(rectangle7, x, y);
                        break;
                    case 'O' :
                        Rectangle rectangle8 = new Rectangle(80,30,400,600);
                        Image imageOso = new Image(getClass().getResourceAsStream("img/oso.png"));
                        gridTablero.add(rectangle8, x, y);
                        break;   
                }
            }
        }           
    }
}
