
/**
 * Write a description of class Sandwich here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sandwich
{
    private String nombre;
    private int precio;
    public void Sandwich(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPrecio(){
        return precio;
    }
}