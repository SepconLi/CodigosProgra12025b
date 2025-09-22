
/**
 * Write a description of class Camisa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Camisa
{
    private String color;
    private String tipo;
    private String nombre;
    private char talla;
    private int cooldown;
    public Camisa(String nombre, String color, String tipo, char talla){
        this.nombre = nombre;
        this.color = color;
        this.tipo = tipo;
        this.talla = talla;
        cooldown = 0;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCooldown(int cooldown){
        this.cooldown = cooldown;
    }
    public int getCooldown(){
        return cooldown;
    }
    public void imprimirDatos(){
        System.out.printf("Camisa %s\n Talla %s \n Color%s\n Cooldown: %d\n",nombre,talla,color,cooldown);
    }
}