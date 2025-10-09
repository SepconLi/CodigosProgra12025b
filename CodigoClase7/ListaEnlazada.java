public class ListaEnlazada{
    private class Nodo{
        public int dato;
        public Nodo proximo;
        public Nodo(){
            dato = 0;
            proximo = null;
        }
        public Nodo(int dato){
            this.dato = dato;
            proximo = null;
        }
    }
    private Nodo cabeza;
    public ListaEnlazada(){
        cabeza = null;
    }
    public void agregarDato(int dato){
        Nodo nuevo = new Nodo(dato);
        if(cabeza == null){
            cabeza = nuevo;
        } else{
            Nodo temp = cabeza;
            boolean encontrado = false;
            while(!encontrado){
                if(temp.proximo != null){
                    temp = temp.proximo;
                } else {
                    temp.proximo = nuevo;
                    encontrado = true;
                }
            }
        }
    }
    public void imprimir(){
        Nodo temp = cabeza;
        boolean fin = false;
        while(!fin){
            System.out.println(temp.dato);
            if(temp.proximo == null) {
                fin = true;
            }
            temp = temp.proximo;
        }
    }
    public void eliminar(int dato){
        Nodo temp = cabeza;
        if(temp == null){
            System.out.println("No hay nada en la lista");
        } else{
            boolean fin = false;
            // TODO: Borrar en caso de que sea cabeza
            while(!fin){
                if(temp.proximo != null && temp.proximo.dato == dato){
                    temp.proximo = temp.proximo.proximo;
                    fin = true;
                } else{
                    temp = temp.proximo;
                }
            }
        }
    }
}
