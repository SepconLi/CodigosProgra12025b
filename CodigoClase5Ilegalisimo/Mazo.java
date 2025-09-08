
/**
 * Write a description of class MAzo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mazo
{
    private Object[][] mazo;
    public Mazo(){
        int fila = 3;
        int columna = 3;
        mazo = new Object[fila][columna];
        
        mazo[0][0] = "Hechizos";
        mazo[0][1] = "Estructuras";
        mazo[0][2] = "Bichos";
        // Hechizos
        mazo[1][0] = new Hechizo("Rayo", 5, 300, 5, 10.0);
        mazo[2][0] = new Hechizo("Bola de fuego", 1, 280, 4, 10.0);
        // Estructuras
        mazo[1][1] = new Estructura("Canon",300, 50.0, 5.0, 3);
        mazo[2][1] = new Estructura("Tesla",250, 60.0, 200.0, 3);
        // bichos
        mazo[1][2] = new Bicho("Barbaros", 100, 4, 10.0, 5, "Comun");
        mazo[2][2] = new Bicho("Arqueras", 80, 3, 20.0, 5, "Comun");
        System.out.println("==========================");
        // Hechizos (columna 0)
        for (int i = 1; i < columna; i++) {
            Object o = mazo[i][0];
            ((Hechizo) o).imprimir();
        }
        System.out.println("==========================");
        // Estructuras (columna 1)
        for (int i = 1; i < columna; i++) {
            Object o = mazo[i][1];
            ((Estructura) o).imprimir();
        }
        System.out.println("==========================");
        // Bichos (columna 2)
        for (int i = 1; i < columna; i++) {
            Object o = mazo[i][2];
            ((Bicho) o).imprimir();
        }
    }
    
}