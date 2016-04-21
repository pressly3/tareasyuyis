
/**
 * Write a description of class jugadorr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jugadorr
{  public String nombre;
  public int numeroDjugador;
  public String posicion;
  
  

public  jugadorr (String nombre, int numeroDjugador, String posicion){
    this.nombre=nombre;
    this.numeroDjugador=numeroDjugador;
    this.posicion=posicion;

}
public void correr(){
    System.out.println("los jugadores corren en el campo");
}
public void patear (){
    System.out.println("los jugadores patean la pelota");
}
public void jugar(){
    System.out.println("los jugadores juegan con el balon");
}
public String toString(){
    StringBuilder cad=new StringBuilder();
    cad.append("\n nombre del jugador "+nombre+ "posicion"+posicion);
    cad.append(cad+"\n"+ nombre+"es");
   
    return cad.toString();
}
}




