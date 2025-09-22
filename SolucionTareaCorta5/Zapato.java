
/**
 * Write a description of class Zapato here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zapato
{
    private String nombre;
    private String tipo;
    private int talla;
    private int estado;
    private int cooldown;
    public Zapato(String nombre, String tipo, int talla, int estado){
        this.nombre = nombre;
        this.tipo = tipo;
        this.talla = talla;
        this.estado = estado;
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
        System.out.printf("Zapato %s\n Talla %d\nTipo %s\n%d Estado\nCooldown: %d",nombre,talla,tipo,estado,cooldown);
    }
}