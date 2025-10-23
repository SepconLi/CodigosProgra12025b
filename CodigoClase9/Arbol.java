import java.util.Scanner;
public class Arbol{

    private class Nodo{
        public String nombre;
        public int listeners;
        public Nodo izquierda;
        public Nodo derecha;
        public Nodo(String nombre, int listeners){
            this.nombre = nombre;
            this.listeners = listeners;
            izquierda = null;
            derecha = null;
        }
    }
    private Nodo raiz;
    public Arbol(){
        Scanner sc = new Scanner(System.in);
        raiz = null;
        for(int i = 0; i < 4; i++){
            String nombre = sc.nextLine();
            int listeners = sc.nextInt();
            sc.nextLine();
            agregar(raiz, nombre, listeners);
        }
        imprimirInOrden(raiz);
        sc.close();
    }
    public void agregar(Nodo nodo,String nombre, int listeners){
        Nodo nuevo = new Nodo(nombre, listeners);
        if(raiz == null){
            raiz = nuevo;
        } else{
            if(listeners > nodo.listeners){
                if(nodo.derecha != null){
                    agregar(nodo.derecha,nombre,listeners);
                } else{
                    nodo.derecha = nuevo;
                    System.out.println("DERECHA");
                }
            } else{
                if(nodo.izquierda != null){
                    agregar(nodo.izquierda,nombre,listeners);
                } else{
                    nodo.izquierda = nuevo;
                    System.out.println("IZQUIERDA");

                }
            }
        }
    }
    public void imprimirInOrden(Nodo nodo){
        if(nodo == null) {
            return;
        }
        imprimirInOrden(nodo.izquierda);
        System.out.println(nodo.nombre + " " + nodo.listeners);
        imprimirInOrden(nodo.derecha);
    }
}