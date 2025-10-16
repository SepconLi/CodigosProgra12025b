import java.util.Scanner;
public class Factorial{
    public Factorial(){
        System.out.println("Digite un digito para buscar su factorial");
        Scanner sc = new Scanner(System.in);
        int facto = sc.nextInt();
        System.out.println(Facto(facto));
    }
    private int Facto(int numero){
        if(numero <= 1){
            return 1;
        } else{
            return numero * Facto(numero - 1);
        }
    }

}