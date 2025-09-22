import java.util.Scanner;
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu
{
    public Menu(){
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        ControladorPrendas prendas = new ControladorPrendas();
        while(opcion != 3){
            System.out.println("1-) Armar outfit del dia\n2-) Consultar prendas\n3-)Salir");
            opcion = scan.nextInt();
            if(opcion == 1){
                prendas.armarOutfit();
            } else if (opcion == 2) {
                prendas.consultarPrenda();
            } else if (opcion == 3) {
                System.out.println("Chao!");
            } else{
                System.out.println("Opcion invalida");
            }
        }
        
        scan.close();
    }
}