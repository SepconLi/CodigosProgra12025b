
/**
 * Write a description of class Primo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Primo
{
    public Primo(){
        
    }
    public void calcularPrimo(int numero){
        boolean esPrimo = true;
        if(numero % 2 == 0) {
            esPrimo = false;
        }
        for(int i = 3; i<=Math.sqrt(numero) && esPrimo; i+=2){
            if (numero % i == 0) {
                esPrimo = false;
            }
        }
        if(esPrimo){
            System.out.printf("%d es Primo\n",numero); 
        } else {
            System.out.printf("%d NO es Primo\n",numero); 
        }
    }
}