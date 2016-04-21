
/**
 * Write a description of class guardameta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class guardameta
{
   
  public String nombre;
  public int numeroDjugador;
  public String posicion;
  
  

public guardameta (String nombre, int numeroDjugador, String posicion){
    this.nombre=nombre;
    this.numeroDjugador=numeroDjugador;
    this.posicion=posicion;

}
public void parar(){
    System.out.println("los guardametas paran el balon");
}
public void patear (){
    System.out.println("los guardametas patean la pelota");
}
public void saltar(){
    System.out.println("los se lanzan para detener   el balon");
}
public String toString(){
    StringBuilder cad=new StringBuilder();
    cad.append("\n nombre del jugador "+nombre+ "posicion"+posicion);
    cad.append(cad+"\n"+ nombre+"es");
   
    return cad.toString();
}
}
