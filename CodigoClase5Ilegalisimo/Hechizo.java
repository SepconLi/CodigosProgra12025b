
/**
 * Write a description of class Hechizo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hechizo
{
    private String nombre;
    private int duracion;
    private int dano;
    private int costo;
    private double radio;
    public Hechizo(String nombre, int duracion, int dano, int costo, double radio){
        this.nombre = nombre;
        this.duracion = duracion;
        this.dano = dano;
        this.costo = costo;
        this.radio = radio;
    }
    public void imprimir(){
        System.out.printf("Nombre: %s\nDuracion: %d\nDano: %d\nCosto: %d\nCosto: %f\n",nombre, duracion, dano, costo, radio);
    }
}