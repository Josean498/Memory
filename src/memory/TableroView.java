/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author José
 */
public class TableroView {

    public char[][] matrizTablero = new char [4][4];
    
    GridPane gridTablero = new GridPane();
    private final double TAM_CASILLA = 150;
    
     public GridPane getGridTablero () {
        return gridTablero;
    }
    
    public void mostrarTablero() {
        for(int y=0; y<4; y++) {
            for(int x=0; x<4; x++) {
                System.out.print(matrizTablero[x][y]);
                rellenarCasilla(x, y);
            }
            System.out.println();
        }
    }

     private void rellenarCasilla(int x, int y) {
        // Dibujar casillas como un cuadrado 
        Rectangle r = new Rectangle(TAM_CASILLA, TAM_CASILLA, Color.GREEN);
        r.setStroke(Color.BLACK);
        gridTablero.add(r, x, y);
    }
     
     
//    Image imageBurro = new Image(getClass().getResourceAsStream("/img/burro.png"));
//    Image imageCastor = new Image(getClass().getResourceAsStream("/img/castor.png"));
//    Image imageElefante = new Image(getClass().getResourceAsStream("/img/elefante.png"));
//    Image imageFoca = new Image(getClass().getResourceAsStream("/img/foca.png"));
//    Image imageGallina = new Image(getClass().getResourceAsStream("/img/gallina.png"));
//    Image imageLeon = new Image(getClass().getResourceAsStream("/img/leon.png"));
//    Image imageMono = new Image(getClass().getResourceAsStream("/img/mono.png"));
//    Image imageOso = new Image(getClass().getResourceAsStream("/img/oso.png"));
//    public void ponerFoto() {
//        
//        TableroView casilla = new TableroView();
//        Group groupTablero = new Group();
//
//        for(int y=0; y<4; y++) {
//            for(int x=0; x<4; x++) {
//                switch(casilla.matrizTablero[x][y]) {
//                    case 'B':   
//                        ImageView imageBurro1 = new ImageView(imageBurro);
//                        //gridTablero.add(rectangle, x, y);
//                        gridTablero.add(imageBurro1, x, x);
//                        groupTablero.getChildren().add(imageBurro1);
//                        break;
//                    case 'C' :
//                        ImageView imageCastor1 = new ImageView(imageCastor);                        
//                        gridTablero.add(imageCastor1, x, x);
//                        break;   
//                    case 'E' :
//                        ImageView imageElefante1 = new ImageView(imageElefante);
//                        gridTablero.add(imageElefante1, x, x);
//                        break;
//                    case 'F' :
//                        ImageView imageFoca1 = new ImageView(imageFoca);
//
//                        gridTablero.add(imageFoca1, x, x);
//                        break;
//                    case 'G' :
//                        Rectangle rectangle5 = new Rectangle(40, 60);
//                        ImageView imageGallina1 = new ImageView(imageGallina);
//                        gridTablero.add(rectangle5, x, y);
//                        gridTablero.add(imageGallina1, x, x);
//                        break;
//                    case 'L' :
//                        Rectangle rectangle6 = new Rectangle(40, 60);
//                        ImageView imageLeon1 = new ImageView(imageLeon);
//                        gridTablero.add(rectangle6, x, y);
//                        gridTablero.add(imageLeon1, x, x);
//                        break;
//                    case 'M' :
//                        Rectangle rectangle7 = new Rectangle(40, 60);
//                        ImageView imageMono1 = new ImageView(imageMono);
//                        gridTablero.add(rectangle7, x, y);
//                        gridTablero.add(imageMono1, x, x);
//                        break;
//                    case 'O' :
//                        Rectangle rectangle8 = new Rectangle(40, 60);
//                        ImageView imageOso1 = new ImageView(imageOso);
//                        gridTablero.add(rectangle8, x, y);
//                        gridTablero.add(imageOso1, x, x);
//                        break;   
//                }
//            }
//        }   
//    }
     
}
















    
    
    