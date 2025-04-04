package Leer_Escribir_Array;

import java.util.Scanner;

public class LlenoLeo {

    //se leen por teclado los datos del array y se muestran solo los números introducidos que sean pares
    public static void main(String[] args) {
        final int MAXIMO=10;
        int[] lista= new int[MAXIMO];
        Scanner sc=new Scanner(System.in);
        boolean error;
        System.out.println("introduzca 10 números sin decimales");
        for (int i=0;i< lista.length;i++){
            error=true;
            while (error) {
                try {
                    System.out.println("introduzca el valor " + (i+1) + " ");
                    lista[i] = sc.nextInt();
                    error = false;
                } catch (Exception e) {
                    System.out.println("ha de introducir números enteros");
                    sc.nextLine();
                }
            }
        }
        System.out.println("Se muestran a continuación solo los números que sean pares");
        for (int i=0; i< lista.length;i++){
            if ((lista[i]%2)==0){
                System.out.println( lista[i]);

            }
        }
    }
}
