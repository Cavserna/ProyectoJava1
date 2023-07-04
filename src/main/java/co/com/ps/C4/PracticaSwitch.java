package co.com.ps.C4;

import java.util.Scanner;

public class PracticaSwitch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int op;
        Double a;
        Double b;
        Double c;
        do {
            System.out.println("       ** Bienvenido **");
            System.out.println( " Ingrese la opción que desea ");
            System.out.println( "1. Triángulo ");
            System.out.println( "2. Rectángulo ");
            System.out.println( "3. Cuadrado");
            System.out.println( "4. Circulo ");
            System.out.println( "0. Salir");
            op= scanner.nextInt();
            switch (op) {
                case 1 :
                    System.out.println( " * Calcular perimetro de Triángulo escaleno");
                    System.out.println( " Ingrese lado A ");
                    a=scanner.nextDouble();
                    System.out.println( " Ingrese lado B ");
                    b=scanner.nextDouble();
                    System.out.println( " Ingrese lado C ");
                    c=scanner.nextDouble();
                    double perimetro = (a + b + c);
                    System.out.println(" * El perimetro de la figura es: "+ perimetro);
                    break;
                case 2 :
                    System.out.println( " * Calcular perimetro de rectángulo");
                    System.out.println( " Ingrese la base");
                    b=scanner.nextDouble();
                    System.out.println( " Ingrese la altura");
                    a=scanner.nextDouble();
                    perimetro= (2 * (a+b));
                    System.out.println(" El perimetro de la figura es: "+ perimetro);
                    break;
                case 3 :
                    System.out.println( " * Calcular el area del cuadrado");
                    System.out.println( " Ingrese el valor de uno de los lados");
                    a=scanner.nextDouble();
                    perimetro= Math.pow(a,2);
                    System.out.println(" El area de la figura es: "+ perimetro);
                    break;
                case 4 :
                    System.out.println( " * Calcular el area del circulo");
                    System.out.println( " Ingrese el valor del radio");
                    c=scanner.nextDouble();
                    perimetro=(Math.PI* c);
                    System.out.println(" El area de la figura es: "+ perimetro);
                    break;
            }
        } while (op != 0);
        System.out.println("** Hasta luego **");
    }
}
