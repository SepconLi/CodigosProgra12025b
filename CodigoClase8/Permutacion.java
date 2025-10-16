public class Permutacion{
    public Permutacion(){
    }
    public void permutar(String prefijo, String letrasRestantes){
        if(letrasRestantes.length() == 0){
            System.out.println(prefijo);
        } else {
            for(int i = 0; i < letrasRestantes.length(); i++) {
                String nuevoPrefijo = prefijo + letrasRestantes.charAt(i);
                String nuevoLetrasRestantes = letrasRestantes.substring(0,i) + letrasRestantes.substring(i+1);
                permutar(nuevoPrefijo, nuevoLetrasRestantes);
            }
        }
    }
}