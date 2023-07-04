package co.com.ps.C4;

import java.util.Arrays;
import java.util.Scanner;

public class PracticaArreglos {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int maxNum=5;
        int [] grupo1Num = new int[maxNum];
        int [] grupo2Num = new int[maxNum];
        int [] grupo3Num = new int[maxNum+maxNum];
        int i =0;
        int j =0;
        int k =0;
        int validar1 = 0;
        int validar2 = 0;
        System.out.println("   ** BIENVENIDO AL CONTADOR ASCENDENTE **");
        System.out.println("               ---------------");
        System.out.println("Ingrese el grupo 1 de números: ");
        for (i =0 ;i < maxNum; i++) {
            System.out.print("numero: ");
            grupo1Num[i] = scanner.nextInt();
            if (grupo1Num[i]<validar1){
                System.out.println("El número debe ser mayor que el anterior");
                System.out.println("escribalo nuevamente");
                grupo1Num[i]=scanner.nextInt();
            }
            validar1 = grupo1Num[i]+1;
        }
        System.out.println(" El grupo de números es: ");
        for (i=0;i< maxNum; i++ ){
            System.out.println(grupo1Num[i]);
        }

        System.out.println("Ingrese el grupo 2 de números: ");
        for (j =0 ;j < maxNum; j++) {
            System.out.print("número: ");
            grupo2Num[j] = scanner.nextInt();
            if (grupo2Num[j]<validar2){
                System.out.println("El número debe ser mayor que el anterior");
                System.out.println("escribalo nuevamente");
                grupo2Num[j]=scanner.nextInt();
            }
            validar2 = grupo2Num[j]+1;

        }
        System.out.println(" El grupo de números es: ");
        for (j=0;j< maxNum; j++ ) {
            System.out.println(grupo2Num[j]);
        }
        int lenArray1 = grupo1Num.length;
        int lenArray2 = grupo2Num.length;
        int[] concate = new int[lenArray1 + lenArray2];
        System.arraycopy(grupo1Num, 0, concate, 0, lenArray1);
        System.arraycopy(grupo2Num, 0, concate, lenArray1, lenArray2);
        Arrays.sort(concate);
        System.out.println("");
        System.out.println("Lista ordenada: " + Arrays.toString(concate));

    }
}
