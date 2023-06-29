package co.com.ps.C4;
import java.util.Scanner;

public class NotaEstudiante {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Ingrese la nota del estudiante");
        int nota = scanner.nextInt();
        if (nota > 3) {
        System.out.println("El estudiante gano la asignatura");
        } else if (nota < 3){
        System.out.println("El estudiante gano la asignatura");
        } else{
        System.out.println("Nota invalida");}
    }
}
