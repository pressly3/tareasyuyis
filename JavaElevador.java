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
public class JavaElevador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        elevador elevadorChico = new elevador();
        elevador elevadorGrande = new elevador();
        
        
        
         
     System.out.println("peso maximo "+elevadorChico.pesoMaximo+
      "capacidad:"+elevadorChico.cargaMaximaPersonas);
     System.out.println("peso maximo"+elevadorGrande.pesoMaximo+
      "capacidad:"+elevadorGrande.cargaMaximaPersonas);       
    }
    
    
}
