package co.com.ps.C5;

import java.util.Scanner;

public class Practica_If_For_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPersonas=10;
        System.out.println("  ** Bienvenido **" );
        System.out.println("      --------" );
        int [] edad = new int [numPersonas];
        int op = 0;
        int menorEdad=0;
        int mayorEdad=0;
        int adultoMayor=0;
        int i=0;
        for (i = 0; i < numPersonas; i++) {
            System.out.print("Ingrese la edad " + (i + 1) + ": ");
            edad[i] = scanner.nextInt();
            if  (edad[i] >120 || edad[i] <=0 ){
                System. out.println("Edad erronea");
                System. out.println("Ingresela nuevamente");
                edad[i] = scanner.nextInt();
            }
            if  (edad[i] >=1 && edad[i] <18 ){
                System. out.println("* Usted es menor de edad *");
            } else if (edad[i] >= 18 && edad[i] <=60) {
                System.out.println("* Usted es mayor de edad *");
            } else if (edad[i] > 60 && edad[i] <=120){
                System.out.println("* Usted es adulto mayor *");
            }
        }
        System.out.println("            ----------------");
        System.out.println(" Consultar la cantidad de personas según la edad?");
        System.out.println(" ");
        System.out.println(" 1.(SI) 2.(NO)");
        op=scanner.nextInt();
        System.out.println("");
        switch (op){
            case 1:
                for ( i=0; i< edad.length;i++){
                    if (edad[i] >=1 && edad[i] <18 ){
                        menorEdad= menorEdad+1;
                    } else if (edad[i] >= 18 && edad[i] <=60) {
                        mayorEdad=mayorEdad+1;
                    } else if (edad[i] > 60 && edad[i] <=120){
                        adultoMayor=adultoMayor+1;
                    }
                }
                System.out.println(menorEdad+ " son menores de edad");
                System.out.println(mayorEdad+ " son mayores de edad");
                System.out.println(adultoMayor+ " son adulto mayor");
            default: System.out.println("Adios");
        }
    }
}
