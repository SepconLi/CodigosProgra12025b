public class Main{
    public static void main(String[] args){
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregarDato(5);
        lista.agregarDato(3);
        lista.agregarDato(2);
        lista.agregarDato(1);
        lista.eliminar(5);
        lista.imprimir();
    }
}