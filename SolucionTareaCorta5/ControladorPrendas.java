
/**
 * Write a description of class ControladorPrendas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ControladorPrendas
{
    private Camisa[] camisas;
    private Pantalon[] pantalones;
    private Zapato[] zapatos;
    public ControladorPrendas(){
        camisas = new Camisa[3];
        camisas[0] = new Camisa("Chemon", "Negro", "Polo", 'M');
        camisas[1] = new Camisa("Camisa", "Roja", "Cuello V", 'L');
        camisas[2] = new Camisa("Camiseton", "Azul", "Oversized", 'L');
        pantalones = new Pantalon[3];
        pantalones[0] = new Pantalon("Jogger", 32, 4);
        pantalones[1] = new Pantalon("Jeans", 32, 6);
        pantalones[2] = new Pantalon("Pantaloneta", 30, 2);
        zapatos = new Zapato[3];
        zapatos[0] = new Zapato("Descalzo", "Natural", 48, 85);
        zapatos[1] = new Zapato("New balance", "Tenis", 48, 90);
        zapatos[2] = new Zapato("Nike Blazer", "Tenis", 48, 45);
    }
    public void armarOutfit(){
        Camisa[] camisasTemp = new Camisa[3];
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < camisas.length; i++){
            if(camisas[i].getCooldown() == 0){
                camisasTemp[contador] = camisas[i];
                contador++;
            }
        }
        Pantalon[] pantalonTemp = new Pantalon[3];
        contador = 0;
        for(int i = 0; i < pantalones.length; i++){
            if(pantalones[i].getCooldown() == 0){
                pantalonTemp[contador] = pantalones[i];
                contador++;
            }
        }
        Zapato[] zapatoTemp = new Zapato[3];
        contador = 0;
        for(int i = 0; i < zapatos.length; i++){
            if(zapatos[i].getCooldown() == 0){
                zapatoTemp[contador] = zapatos[i];
                contador++;
            }
        }
        System.out.println("Elija una de las siguientes camisas");
        for(int i = 0; i < camisasTemp.length; i++){
            if(camisasTemp[i] == null){
                break;
            } else{
                System.out.printf("%d-) %s\n",i, camisasTemp[i].getNombre());
            }
        }
        Camisa camisaElegida = camisasTemp[scanner.nextInt()];
        System.out.println("Elija uno de los siguientes pantalones");
        for(int i = 0; i < pantalonTemp.length; i++){
            if(pantalonTemp[i] == null){
                break;
            } else{
                System.out.printf("%d-) %s\n",i, pantalonTemp[i].getNombre());
            }
        }
        Pantalon pantalonElegido = pantalonTemp[scanner.nextInt()];
        System.out.println("Elija uno de los siguientes zapatos");
        for(int i = 0; i < zapatoTemp.length; i++){
            if(zapatoTemp[i] == null){
                break;
            } else{
                System.out.printf("%d-) %s\n",i, zapatoTemp[i].getNombre());
            }
        }
        Zapato zapatoElegido = zapatoTemp[scanner.nextInt()];
        
        camisaElegida.setCooldown(camisas.length/2 + 1);
        pantalonElegido.setCooldown(pantalones.length/2 +1);
        zapatoElegido.setCooldown(zapatos.length/2 +1);
        
        for(int i = 0; i < camisas.length; i++){
            // Guionazo del profe, todas las listas tienen el mismo tamano
            if(camisas[i].getCooldown() > 0){
                camisas[i].setCooldown(camisas[i].getCooldown() - 1);
            }
            if(pantalones[i].getCooldown() > 0){
                pantalones[i].setCooldown(pantalones[i].getCooldown() - 1);
            }
            if(zapatos[i].getCooldown() > 0){
                zapatos[i].setCooldown(zapatos[i].getCooldown() - 1);
            }
        }
        
        System.out.printf("Outfit Elegido\n%s\n%s\n%s\n",camisaElegida.getNombre(),pantalonElegido.getNombre(),zapatoElegido.getNombre());
    }
    public void consultarPrenda(){
        int option = 0;
        Scanner sc = new Scanner(System.in);
        while(option != 4){
            System.out.println("1-Camisas");
            System.out.println("2-Pantalones");
            System.out.println("3-Zapatos");
            System.out.println("4-Salir");
            option = sc.nextInt(); 
            if(option == 1){
                System.out.println("Elija la camisa");
                for(int i = 0; i < camisas.length; i++){
                    System.out.printf("%d-)%s",i,camisas[i].getNombre());
                }
                int camisa = sc.nextInt();
                camisas[camisa].imprimirDatos();
            } else if (option == 2) {
                System.out.println("Elija el pantalon");
                for(int i = 0; i < pantalones.length; i++){
                    System.out.printf("%d-)%s",i,pantalones[i].getNombre());
                }
                int pantalon = sc.nextInt();
                pantalones[pantalon].imprimirDatos();
            } else if (option == 3) {
                System.out.println("Elija el Zapato");
                for(int i = 0; i < zapatos.length; i++){
                    System.out.printf("%d-)%s",i,zapatos[i].getNombre());
                }
                int zapato = sc.nextInt();
                zapatos[zapato].imprimirDatos();
            } else {
                System.out.println("Opcion invalida");
            }
        }        
    }
}