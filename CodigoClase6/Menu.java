import java.util.Scanner;
public class Menu{
    public Menu()}{
        Scanner sc = new Scanner(System.in);
        int option = 0;
        Lista lista = new Lista();
        while(option != 2){
            System.out.println("1-Agregar a lista\n2-Salir\n");
            option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Digite un numero para agregar");
                    int numero = sc.nextInt();
                    lista.agregar(numero);
                    break;
                case 2:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;

            }
        }
    }
}