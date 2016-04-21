/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javabicii;

/**
 *
 * @author alina
 */
public class Javabicii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bicii bicii1 = new bicii();
        bicii bicii2 = new bicii();
        
        bicii1.cambiarCadencia(50);
        bicii1.acelerar(10);
        bicii1.aplicarFrenos(2);
        bicii1.imprimirEstado();
        
       
        
        bicii2.cambiarCadencia(90);
        bicii2.acelerar(10);
        bicii2.aplicarFrenos(3);
        bicii2.imprimirEstado();
    }
    
}
