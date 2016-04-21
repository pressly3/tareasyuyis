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
public class bicii {
           //campos de la clase.
    int cadencia = 0;
    int velocidad = 0;
    int engranaje = 1;
//metodos de la clase.
    //metodo que permita cambiar la caencia de la bicicleta.
    void cambiarCadencia(int nuevoValor){
        cadencia = nuevoValor;
        
    }
    //metodo que permita cambiar la velocidad de la bicicleta.
    void cambiarVelocidad(int nuevoValor){
        velocidad = nuevoValor;
        
    }
    //metodo que permita acelerar la bicicleta.
    void acelerar(int incremento){
        velocidad = velocidad + incremento;
        
    }
     //metodo para disminuir la velocidad de la bicicleta.
    void aplicarFrenos(int decremento){
        velocidad = velocidad - decremento;
        
        
    }
    //metodo que permita imprimir el estado de la bicicleta.
    void imprimirEstado(){
        System.out.println("cadencia: "+ cadencia +"/"
                         +"velicidad: "+ velocidad +"/"
                         +"engranaje: "+ engranaje 
                );
}
}
