
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
        int opcion = 0;
        while(opcion != 4){
            System.out.println("1-Comprobar anio bisiesto\n2-Comprobar vuelto\n3-Comprobar numero primo\n4-Salir");
            opcion = heskaner.nextInt();
            Primo primo = new Primo();
            Vuelto vuelto = new Vuelto();
            Bisiesto bis = new Bisiesto();
            if(opcion == 1){
                System.out.println("Digite un Anio para comprobar si es bisiesto");
                int anio = heskaner.nextInt();
                bis.comprobarAnio(anio);
            } else if (opcion == 2){
                System.out.println("Digite un vuelto para ser calculado");
                int comprobar = heskaner.nextInt();
                vuelto.calcularVuelto(comprobar);
            } else if (opcion == 3){
                System.out.println("Digite un numero para ver si es primo");
                int numero = heskaner.nextInt();
                primo.calcularPrimo(numero);
            } else if (opcion == 4){
                System.out.println("Chao");
            } else {
                System.out.println("Opcion invalida");
            }
        }
        heskaner.close();
    }
}