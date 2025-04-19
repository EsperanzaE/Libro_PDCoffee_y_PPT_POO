package NotasArray;

import java.util.Scanner;

public class Notas {
    public static void muestroNotas(double[] lasNotas) {
        for (int i = 0; i < lasNotas.length; i++)
            System.out.println("la nota del alumno " + ( i + 1 ) + " es: " + lasNotas[i]);
    }

    public static double[] leoYLLeno(int max) {
        Scanner scanner = new Scanner(System.in);
        boolean error;
        double[] notas = new double[max];
        System.out.println("introduzca las notas de los alumnos. Ha de ser un valor entre 0 y 10");
        for (int i = 0; i < max; i++) {
            error = true;
            while (error) {
                try {
                    System.out.println("Nota del alumno numero " + ( i + 1 ));
                    notas[i] = scanner.nextDouble();
                    if (notas[i] >= 0 && notas[i] <= 10) {
                        error = false;
                    }
                    else{
                        System.out.println("la nota ha de estar entre 0 y 10");
                    }
                } catch (Exception e) {
                    System.out.println("has de introducir una nota entre el 0 y el 10");
                    error = true;
                    scanner.nextLine();
                }
            }
        }

        return notas;
    }
}