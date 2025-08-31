
/**
 * Write a description of class Equipo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Equipo
{
    private Jugador[] jugadores;
    private String nombre;
    public Equipo(){
        jugadores = new Jugador[2];  
        nombre = "";
    }
    public String getNombre(){
        return nombre;    
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setJugador(String nombre, int edad, int goles){ // Metodo temporal
        jugadores[0] = new Jugador();
        jugadores[0].setNombre(nombre);
        jugadores[0].setEdad(edad);
        jugadores[0].setGoles(goles);
    }
    public Jugador[] getJugadores(){
        return jugadores;
    }
}   