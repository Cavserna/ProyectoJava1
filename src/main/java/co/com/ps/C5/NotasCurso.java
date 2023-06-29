package co.com.ps.C5;
import java.util.Scanner;
public class NotasCurso {
    public static void main(String[] args) {
        Scanner escanner=new Scanner (System.in);
        System.out.print(" Escriba las notas de los 5 estudiantes");
        int [] notas = new int [5];
        notas [0]= escanner.nextInt();
        notas [1]= escanner.nextInt();
        notas [2]= escanner.nextInt();
        notas [3]= escanner.nextInt();
        notas [4]= escanner.nextInt();
        double suma =0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        suma = suma / 5;
        System.out.print("El promedio del curso es: "+ suma);

    }
}

