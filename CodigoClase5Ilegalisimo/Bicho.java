
/**
 * Write a description of class Bicho here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bicho
{
    private String nombre;
    private int vida;
    private int costo;
    private double velocidadAtaque;
    private int velocidad;
    private String rareza;
    public Bicho(String nombre, int vida, int costo, double velocidadAtaque, int velocidad, String rareza){
        this.nombre = nombre;
        this.vida = vida;
        this.costo = costo;
        this.velocidadAtaque = velocidadAtaque;
        this.velocidad = velocidad;
        this.rareza = rareza;
    }
    public void imprimir(){
        System.out.printf("Nombre: %s\nVida: %d\nCosto: %d\nVelocidad de ataque: %.2f\nVelocidad: %d\nRareza: %s\n",nombre, vida, costo, velocidadAtaque, velocidad, rareza);    
    }
}