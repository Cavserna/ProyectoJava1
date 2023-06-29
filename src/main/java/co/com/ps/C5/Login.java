package co.com.ps.C5;
import java.util.Scanner;
public class Login {
    private static final String USERNAME = "Camilo";
    private static final String PASSWORD = "224455";

    public static void main (String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println(" Bienvenido");
        System.out.println("Ingrese nombre de usuario");
        String userName = scanner.nextLine();
        System.out.println("ingrese contrasena");
        String password = scanner.nextLine();
        if (userName.equals(USERNAME) && password.equals(PASSWORD)){
            System.out.println("Usuario y contrasena correctas");
            System.out.print(" Bienvenido: " + USERNAME) ;
        } else {
            int contador= 0;
            while (userName.equals(USERNAME)== false && password.equals(PASSWORD)== false){
                System.out.println("Datos incorrectos");
                System.out.println("Ingrese nuevamente el nombre de usuario");
                userName = scanner.nextLine();
                System.out.println("Ingrese nuevamente la contrasena");
                password = scanner.nextLine();
                contador++;
            }
            System.out.print(" Bienvenido: " + USERNAME) ;
        }
    }
}

