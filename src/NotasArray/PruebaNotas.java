package NotasArray;


import java.util.Scanner;

import static NotasArray.Notas.leoYLLeno;
import static NotasArray.Notas.muestroNotas;

/**
 * clase para introducir notas por teclado. Nos valdremos del índice para el orden de los alumnos
 * las obtención e impresión de las notas las haremos en funciones aparte en la clase notas
 * vamos a ver tres cosas en este ejemplo
 * 1.- usar el índice con significado, en este caso sería el número de orden de los alumnos
 * 2.- llamar a una función usando un array como argumento
 * 3.- llamar a una función que devuelve un array
 */
public class PruebaNotas {
    public static void main(String[] args) {
        final int MAXIMO = 10;
        double[] misNotas;
/**
 * Con este método lleno el array y lo devuelvo.
 * Es una función que devuelve un array
 */
        misNotas = leoYLLeno(MAXIMO);
/**
 * Con este método muestro las notas pasándole el array como argumento
 */
        muestroNotas(misNotas);

    }


}//fin main