/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

/**
 *
 * @author DELL ONE
 */
public class telefono {

    public telefono(int id, String marca, String modelo, double precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
 public int id;
 public String marca;
 public String modelo;
 public double precio;
 public telefono (){
     id=1;
             marca=" motorola";
       modelo= "moto x";
       precio=3500;
 }
 public void mostrarDatos(){
     System.out.println("id"+id);
     System.out.println("marca"+marca);
     System.out.println("precio:"+precio);
 }
}
