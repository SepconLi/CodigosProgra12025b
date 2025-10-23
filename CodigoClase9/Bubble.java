public class Bubble{
    public Bubble(){
        int[] datos = {4,3,2,1,11,0,2};
        imprimirLista(datos);
        System.out.println("ORDENANDO");
        ordenarBurbuja(datos);
        imprimirLista(datos);
    }
    public void ordenarBurbuja(int[] datos){
        for(int i = datos.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                int temp = -1;
                if(datos[j] > datos[j+1]){
                    temp = datos[j];
                    datos[j] = datos[j+1];
                    datos[j+1] = temp;
                } 
            }
        }
    }
    public void imprimirLista(int[] datos){
        for(int i = 0; i<datos.length;i++){
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }
}