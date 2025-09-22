
/**
 * Write a description of class Pantalon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pantalon
{
    private String nombre;
    private int talla;
    private int bolsillos;
    private int cooldown;
    public Pantalon(String nombre, int talla, int bolsillos){
        this.nombre = nombre;
        this.talla = talla;
        this.bolsillos = bolsillos;
        cooldown = 0;
    }
    public void imprimirDatos(){
        System.out.printf("Pantalon %s\n Talla %d\n%d Bolsillos\nCooldown: %d",nombre,talla,bolsillos,cooldown);
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
}