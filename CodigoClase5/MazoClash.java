
/**
 * Write a description of class MazoClash here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MazoClash
{
    private String[][] mazo;
    public MazoClash(){
        int filas = 3;
        int columnas = 3;
        mazo = new String[filas][columnas];
        mazo[0][0] = "Hechizos";
        mazo[0][1] = "Estructuras";
        mazo[0][2] = "Bichos";
        
        // Hechizos
        mazo[1][0] = "Rayo";
        mazo[2][0] = "Bola de fuego";
        
        // Estructuras
        mazo[1][1] = "Canon";
        mazo[2][1] = "Tesla";
        
        // Bichos
        mazo[1][2] = "Arqueras";
        mazo[2][2] = "Barbaros";
        
        imprimirMatriz(mazo);
        String[][] matrizNueva = invertirMatriz(mazo,filas,columnas);
        imprimirMatriz(matrizNueva);
    }
    private void imprimirMatriz(String[][] matriz){
        for (String[] i : matriz){
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    private String[][] invertirMatriz(String[][] matriz, int filas, int columnas){
        String[][] matrizNueva = new String[filas][columnas];
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                matrizNueva[j][i] = mazo[i][j];
            }
        }
        return matrizNueva;
    }
}