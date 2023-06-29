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
        String opcion;
        int op = 0;

        do {
            System.out.println("           ** Bienvenido **");
            System.out.println("             ------------");
            System.out.println("   ** Escriba la opción que desea **");
            System.out.println();
            System.out.println(" * Termica (Celcius a Fahrenheit) ");
            System.out.println(" * Distancia (Metros a Pies) ");
            opcion = scanner.nextLine();
            switch (opcion) {
                case "Termica":
                    System.out.println(" ** Celcius a Fahrenheit **");
                    System.out.println();
                    System.out.println(" * Ingrese los grados Celcius ");
                    int gradosC = scanner.nextInt();
                    convertirCaF(gradosC);
                    System.out.println("");
                    System.out.println("   ** Desea volver al inicio **");
                    System.out.println("   ** Si n(No) **");
                    op=scanner.nextInt();
                    break;
                case "Distancia":
                    System.out.println(" ** Metros a Pies **");
                    System.out.println();
                    System.out.println(" * Ingrese los metros");
                    int metro=scanner.nextInt();
                    convertirMaP(metro);
                    System.out.println("");
                    System.out.println("   ** Desea volver al inicio? **");
                    System.out.println("        * 1(Si) 2(no) *");
                    op=scanner.nextInt();
                    break;
            }
        } while (op != 1);
    }
}

