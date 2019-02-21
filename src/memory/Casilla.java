/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory;

/**
 *
 * @author Tomas
 */
public class Casilla {
    public char[][] matrizTablero = new char [4][4];
    
    public void mostrarTablero() {
        for(int y=0; y<4; y++) {
            for(int x=0; x<4; x++) {
                System.out.print(matrizTablero[x][y]);
            }
            System.out.println();
        }
    }
    
    public Casilla() {
        for(int y=0; y<4; y++) {
            for(int x=0; x<4; x++) {
                matrizTablero[x][y] = '0';
            }
        }
    }
    
    public void ponerRectangulo(int x, int y, char rectangulo) {
        matrizTablero[x][y] = rectangulo;
    }
}