
/**
 * Write a description of class Jugador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jugador
{
    private String Nombre;
    private int edad;
    private int goles;
    public Jugador(){
        edad = 0;
        goles = 0;
        Nombre = "";
    }
    public String getNombre(){
        return Nombre;    
    }
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setGoles(int goles){
        this.goles = goles;
    }
}