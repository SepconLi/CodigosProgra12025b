import java.util.Scanner;
public class PiedraPapelTijera
{
    private int opcion1;
    private int opcion2;
    private String nombre1;
    private String nombre2;
    public PiedraPapelTijera(){ // constructor
        opcion1 = 0;
        opcion2 = 0;
        nombre1 = "";
        nombre2 = "";
    }
    public void empezar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE EL NOMBRE DEL JUGADOR 1");
        nombre1 = scanner.nextLine();
        System.out.println("DIGITE EL NOMBRE DEL JUGADOR 2");
        nombre2 = scanner.nextLine();
        opcion1 = elegirOpcion(nombre1);
        opcion2 = elegirOpcion(nombre2);
        System.out.printf("El ganador es: %s\n",jugar());
    }
    private int elegirOpcion(String nombre){
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion > 3 || opcion < 1) {
            System.out.printf("%s es tu turno\n",nombre);
            System.out.println("1-Piedra\n2-Papel\n3-Tijera");
            opcion = scanner.nextInt();
        }
        return opcion;
    }
    private String jugar(){
        String ganador = "";
        if (opcion1 == opcion2) {
            ganador = "Empate";
        } else {
            if(opcion1 == 1) {
                if (opcion2 == 2) {
                    ganador = nombre2;
                } else {
                    ganador = nombre1;
                }
            } else if (opcion1 == 2) {
                if (opcion2 == 1){
                    ganador = nombre1;
                } else {
                    ganador = nombre2;
                }
            } else {
                if (opcion2 == 1) { 
                    ganador = nombre2;
                } else {
                    ganador = nombre1;
                }
            }

        }
        return ganador;
    }
}