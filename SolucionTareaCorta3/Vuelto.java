
/**
 * Write a description of class Vuelto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vuelto
{
    public Vuelto(){
        
    }
    public void calcularVuelto(int vuelto){
        int[] billetes = {0, 0, 0, 0, 0, 0, 0};
        int[] valores = {2000,1000,500,100,50,25,5};
        int contador = 0;
        while(vuelto > 0){
            for(int valor : valores){
                while(vuelto >= valor){
                    billetes[contador]++;
                    vuelto -= valor;
                }
                contador++;
            }
        }
        contador = 0;
        for(int billete : billetes){
            System.out.printf("Billete(s) de %d = %d\n",valores[contador],billete);
            contador++;
        }
    }
}