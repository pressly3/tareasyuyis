/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehiculo;

/**
 *
 * @author alina
 */
public class Vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        auto auto1 = new auto();
         auto1.mostrarDatos();
        
        auto auto2 = new auto("ford","fiesta",100000,"red");
         auto2.mostrarDatos();
        // TODO code application logic here
    }
    
}
