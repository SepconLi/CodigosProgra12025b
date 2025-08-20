public class hola{
    public int numero; // Declaracion
    public static void main (String args[]){
        
    }
    public void imprimirPares(int inicio, int fin){
        if (inicio % 2 != 0) {
            inicio += 1;
        }
        for(int i = inicio; i<=fin; i+=2){
           System.out.println(i);
        }
    }
    public void quePokemonGana(int vida1, int ataque1, int vida2, int ataque2){
        while(vida1 > 0 && vida2 > 0){
            vida1 -= ataque2;
            if (vida1 <= 0) {
                break;
            }
            vida2 -= ataque1;
        }
        if (vida1 > vida2){
            System.out.println("Gano el pokemon1");
        } else {
            System.out.println("Gano el pokemon2");
        }
    }
    public void quePokemonGanaVelocidad(int vida1, int ataque1, int velocidad1, int vida2, int ataque2, int velocidad2){
        while(vida1 > 0 && vida2 > 0){
            if (velocidad1 >= velocidad2) {
                vida2 -= ataque1;
                if (vida2 <= 0) {
                    break;
                }
                vida1 -= ataque2;
            } else {
                vida1 -= ataque2;
                if (vida1 <= 0) {
                    break;
                }
                vida2 -= ataque1;
            }
        }
        if (vida1 > vida2){
            System.out.println("Gano el pokemon1");
        } else {
            System.out.println("Gano el pokemon2");
        }
    }
    public void aplicar3x2Subway(){
        Sandwich bmt = new Sandwich();
        bmt.setNombre("BMT");
        bmt.setPrecio(4800);
        Sandwich atun = new Sandwich();
        atun.setNombre("atun");
        atun.setPrecio(4900);
        Sandwich jamon = new Sandwich();
        jamon.setNombre("jamon");
        jamon.setPrecio(4900);
        int total = bmt.getPrecio() + atun.getPrecio() + jamon.getPrecio();
        int masBajo = 1000000;
        if (bmt.getPrecio() < masBajo){
            masBajo = bmt.getPrecio();
        }
        if (atun.getPrecio() < masBajo) {
            masBajo = atun.getPrecio();
        }
        if (jamon.getPrecio() < masBajo){
            masBajo = jamon.getPrecio();
        }
        System.out.printf("El precio total es %d\n",total-=masBajo);
    }
}