public class Lista{
    int[] lista;
    public Lista(){
        lista = new int[1];
    }
    public void agregar(int numero){
        int[] nuevaLista = new int[lista.length + 1];
        for(int i = 0; i < lista.length;i++){
            nuevaLista = lista[i];
        }
        nuevaLista[nuevaLista.length - 1] = numero;
        lista = null;
        lista = nuevaLista;
    }


}