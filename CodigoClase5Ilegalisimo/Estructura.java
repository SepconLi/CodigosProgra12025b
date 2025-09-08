
/**
 * Write a description of class Estructura here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Estructura
{
    private String nombre;
    private int vida;
    private double alcance;
    private double velocidadAtaque;
    private int costo;
    public Estructura(String nombre,int vida, double alcance, double velocidadAtaque, int costo){
       this.nombre = nombre; 
       this.vida = vida;
       this.alcance = alcance;
       this.velocidadAtaque = velocidadAtaque;
       this.costo = costo;
    }
    public void imprimir(){
        System.out.printf("Nombre: %s\nVida: %d\nAlcance: %.2f\nVelocidad de ataque: %.2f\nCosto: %d\n",nombre, vida, alcance, velocidadAtaque, costo);
    }
}