/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaelevador;

/**
 *
 * @author alina
 */
public class elevador {
    public int pesoMaximo;
    public int cargaMaximaPersonas;
      
    public elevador(){
        pesoMaximo = 300;
        cargaMaximaPersonas = 5;
        
    }
    public int subirPiso(int pisoActual){
        int nuevoPiso = pisoActual+1;
        return nuevoPiso;
        
        
    }
    public int bajarPiso(int pisoActual){
        int nuevoPiso = pisoActual-1;
                return nuevoPiso;
                
    }
    
    public void abrirPuerta(){
        System.out.println("abriendo  puerta");
    }
    public void cerrarPuerta(){
        System.out.println("cerrar  puerta");
    }
   }

