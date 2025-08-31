
/**
 * Write a description of class Liga here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Liga
{
    private Equipo[] equipos;
    private String nombre;
    public Liga(){
        equipos = new Equipo[3];
        nombre = "";
    }
    public Equipo[] getEquipos(){
        return equipos;
    }
    public void crearEquipo(String nombreEquipo){ // METODO TEMPORAL
        equipos[0] = new Equipo();
        equipos[0].setNombre(nombreEquipo);
    }
    public void setJugador(String nombre, int edad, int goles){
        equipos[0].setJugador(nombre,edad,goles);
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}