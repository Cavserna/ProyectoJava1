package co.com.ps.C6;
import java.util.Scanner;
public class ConversorUnidades {
    public static void convertirCaF (int gradosC){
        int fharenheit = ((gradosC * 9) / 5 + (32)) ;
        System.out.println("Los grados Fahrenheit son : " + fharenheit);
    }
    public  static void convertirMaP (int metro){
        Double pies = metro/0.3048;
        System.out.println("La medida en pies es: " + pies);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            System.out.println("");
            System.out.println("           ** Bienvenido **");
            System.out.println("             ------------");
            System.out.println("   ** Escriba la opción que desea **");
            System.out.println();
            System.out.println(" 1. * Termica (Celcius a Fahrenheit) ");
            System.out.println(" 2. * Distancia (Metros a Pies) ");
            System.out.println(" 0. * Salir ");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println(" ** Celcius a Fahrenheit **");
                    System.out.println();
                    System.out.println(" * Ingrese los grados Celcius ");
                    int gradosC = scanner.nextInt();
                    convertirCaF(gradosC);
                    break;
                case 2:
                    System.out.println(" ** Metros a Pies **");
                    System.out.println();
                    System.out.println(" * Ingrese los metros");
                    int metro=scanner.nextInt();
                    convertirMaP(metro);
                    break;
            }
        } while (op != 0);
    }
}

