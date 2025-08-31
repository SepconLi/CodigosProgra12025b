
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Menu
{
    public Menu(){
        Scanner heskaner = new Scanner(System.in);
        Liga[] ligas = new Liga[4];
        int opcion = 0;
        ligas[0] = new Liga();
        ligas[0].setNombre("Bundesliga");
        ligas[0].crearEquipo("Bayern");
        ligas[0].setJugador("Harry kane",32,35);
        for(int i = 1;i<ligas.length;i++){
            ligas[i] = new Liga();
        }
        while(opcion != 3){
            try{
                Equipo[] equipos = ligas[0].getEquipos();
                Jugador[] jugadores = equipos[0].getJugadores();
                System.out.println("Menu Equipos\n1-Consultar Ligas\n2-Consultar goleadores\n3-Salir");
                opcion = heskaner.nextInt();
                if(opcion == 1) {
                    for(Liga i : ligas){
                        System.out.println(i.getNombre());
                        System.out.println(equipos[0].getNombre());
                        System.out.println(jugadores[0].getNombre());
                    }
                } else if(opcion == 3){
                    System.out.println("CHAO");
                }
            } catch(Exception hesepsion){
                System.err.println("Oh no, ha fallado por: " + hesepsion);
            }
        }
    }
}