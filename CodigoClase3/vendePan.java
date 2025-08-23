
/**
 * Write a description of class vendePan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class vendePan
{
    private Pan croissant;
    private Pan bizcocho;
    private Pan sandwich;
    private int ganancias;
    public vendePan(){
        croissant = new Pan("Croissant",1000,5);
        bizcocho = new Pan("Bizcocho",500,10);
        sandwich = new Pan("Sandwich",1500,2);
        ganancias = 0;
    }
    public void vender(){
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double precio = 0;
        int cantidad = 0;
        double total = 0;
        Pan pan = null;
        while(opcion < 1 || opcion > 3){
            System.out.println("Productos Disponibles");
            System.out.print("1-");
            imprimirObjeto(croissant);
            System.out.print("2-");
            imprimirObjeto(sandwich);
            System.out.print("3-");
            imprimirObjeto(bizcocho);
            opcion = scanner.nextInt();
            if (opcion == 1) {
                precio = croissant.getPrecio();
                pan = croissant;
            } else if(opcion == 2){
                precio = sandwich.getPrecio();
                pan = sandwich;
            } else {
                precio = bizcocho.getPrecio();
                pan = bizcocho;
            }
            System.out.println("Y cuantos quiere");
            cantidad = scanner.nextInt();
            total = precio * (double)cantidad;
        }
        System.out.printf("El cliente ha adquirido %d %s teniendo un total de %f",cantidad, pan.getNombre(), total);
    }
    public void imprimirObjeto(Pan pan){
        System.out.printf("%s A tan solo %f colones y hay %d\n",pan.getNombre(),pan.getPrecio(),pan.getCantidad());
    }
}