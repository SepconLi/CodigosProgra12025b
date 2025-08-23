import java.util.Scanner;
public class Menu
{
    public Menu(){
        Scanner scanner = new Scanner(System.in);
        PiedraPapelTijera juego = new PiedraPapelTijera();
        vendePan panaderia = new vendePan();
        int opcion = 0;
        while (opcion != 3){
            System.out.println("1-Jugar piedra papel o tijera\n2-Comprar pan\n3-Salir");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                // Jugar piedra papel o tijera
                juego.empezar();
            } else if (opcion == 2) {
                // Comprar pan
                panaderia.vender();
            } else if (opcion == 3) {
                break;
            } else {
                System.out.println("Opcion invalida");
            }
        }
    }
}