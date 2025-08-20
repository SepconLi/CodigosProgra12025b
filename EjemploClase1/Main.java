public class Main
{
    public static void main(String args[]){
        System.out.println("Hola"); // Imprimo un hola pa saludar
        // Hago 2 instancias del objeto pan, uno blanco y otro integral
        Pan panBlanco = new Pan();
        Pan panIntegral = new Pan();
        
        // Podemos utilizar un setter de esta forma con una variable
        int precioPan = 1000;
        panBlanco.setPrecio(precioPan);
        
        // O podemos hacerlo asi de esta manera directa
        panIntegral.setPrecio(1200);
        
        // Igual con el nombre
        String nombrePan = "Pan blanco recien hecho";
        panBlanco.setNombre(nombrePan);
        
        // Ojo que panBlanco y panIntegral son 2 instancias distintas
        panIntegral.setNombre("Pan Integral nutritivo");
        
        // Procedo a hacer los prints utilizando los getters
        // Se puede hilar un string sumando variables para que queden dependiendo de como este una variable
        System.out.println("Precio del " + panBlanco.getNombre() + " es " + panBlanco.getPrecio());
        
        // Ojo como pongo los espacios antes de sumar las variables, esto por motivos aesthethic
        System.out.println("Precio del " + panIntegral.getNombre() + " es " + panIntegral.getPrecio());
        
    }
}