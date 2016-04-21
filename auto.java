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
public class auto {
       
    public String marca;
    public String modelo;
    public double precio;
    public String color;
    
    
   public auto(String marca,String modelo,double precio,String color){
       this.marca = marca;
       this.modelo = modelo;
       this.precio = precio;
       this.color = color;
       
   }
   public auto(){
       this.marca = "nissan";
       this.modelo = "tsuru";
       this.precio = 120000;
       this.color = "blue"; 
       
   }
   public void mostrarDatos(){
       System.out.println("marca:"+marca+"//"
               + "modelo:"  +modelo+"//"
               + "precio:"  +precio+"//"
               + "color:"   +color+"//");
       
    
}
 }
