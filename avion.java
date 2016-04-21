
/**
 * Write a description of class avion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class avion
{  private String modeloDavion;
    private String color;
    private int capacidad;
    
    public avion(String modeloDavion,String color,int capacidad){
    this.modeloDavion=modeloDavion;
    this.color=color;
    this.capacidad=capacidad;

}

public void despegar(){
    System.out.println("las tortugas comen lechuga y peces pequeños");
}
public void tasportar(){
    System.out.println("las tortugas duermen en pecera");
}
public void aterrizar(){
    System.out.println("las tortugas no juegan con sus dueños");
}

public String toStrings(){
    StringBuilder cad=new StringBuilder();
    cad.append("\n modelo de avion"+ modeloDavion +" color " + color);
    cad.append("\n capacidad de carga del avion" +capacidad);
    return cad.toString();
}

}
