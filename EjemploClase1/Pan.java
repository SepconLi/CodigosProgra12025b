public class Pan
{
    private int precio;
    private String nombre;
    public void Pan(){ // Esto es una funcion constructora
        System.out.println("Nuevo pan creado");
        precio = 0;
        nombre = "";
    }
    // Setter del precio del objeto Pan
    public void setPrecio(int nuevoPrecio){
        precio = nuevoPrecio;
    }
    // Getter del precio del objeto Pan
    public int getPrecio(){
        return precio;
    }
    // Setter del nombre del objeto Pan
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    // Getter del nombre del objeto Pan
    public String getNombre(){
        return nombre;
    }
}