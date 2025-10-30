import java.util.Scanner;
import java.io.*; // input output

public class Login{
    private String usuario;
    private String contra;
    private Scanner sc;
    public Login(){
        sc = new Scanner(System.in);
    }

    public void registrar(){
        try{
            System.out.println("Digite su usuario");
            usuario = sc.nextLine();
            System.out.println("Digite su contraseña");
            contra = sc.nextLine();
            System.out.printf("El usuario %s ha sido registrado",usuario);
        } catch(Exception e){
            System.err.println("Error " + e);
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt"))){
            writer.write(usuario);
            writer.newLine();
            writer.write(contra);
        } catch(Exception e){
            System.err.println("Error " + e);
        }
    }

    public void iniciarSesion(){
        int intentos = 0;
        String usuarioReal = "";
        String contraReal = "";
        while(intentos < 3){
            try(BufferedReader lector = new BufferedReader(new FileReader("datos.txt"))){
                if(intentos == 0) {
                    usuarioReal = lector.readLine();
                    contraReal = lector.readLine();
                }
                
                System.out.println("Digite su usuario" + usuarioReal);
                usuario = sc.nextLine();
                System.out.println("Digite su contraseña" + contraReal);
                contra = sc.nextLine();
                if(!usuario.equals(usuarioReal) || !contra.equals(contraReal)) {
                    System.out.println("ERROR datos invalidos, intentos restantes:" + (2 - intentos));
                    intentos++;
                } else {
                    System.out.printf("USUARIO %s iniciado correctamente",usuario);
                    break;
                }
            } catch(Exception e){
                System.err.println("Error " + e);
            }
        }
        if(intentos > 2){
            System.out.println("INTENTOS GASTADOS, CHAO");
        }
    }
}