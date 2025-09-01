
/**
 * Write a description of class Bisiesto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bisiesto
{
    public Bisiesto(){
    
    }
    public void comprobarAnio(int anio){
        if(anio % 400 == 0 || (anio % 100 != 0 && anio % 4 == 0)){
            System.out.printf("%d es un anio bisiesto",anio);
        } else {
            System.out.printf("%d No es un anio bisiesto",anio);
        }
    }
}