package CopiarArrays;

import java.util.Arrays;

public class ArraysCopy {
    static int array1[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90,100};
    static int array2[] = { 1,2,3,4,5};
    static int array3[];
    static int array4[];

    /**
     * uso de System. arraycopy
     * copio del array 1 tantas casillas como indico en el último argumento, empezando por el valor de la casilla
     * del segundo argumento y lo coloco a partir de la casilla indicada en el cuarto argumento
     */

    public static void main(String[] args) {
        System.arraycopy(array1,3,array2,1,1);
        System.out.println("ejemplo de uso System.arraycopy");
        for (int elemento:array2) {
            System.out.println(elemento);
        }
        /**
         * uso del método copyOf. array3 tiene que estar creado si no da error
         * el array destino solo debe estar declarado, no necesita ni dimensiones ni valores
         * si nos "pasamos" de casillas del array origen, no pasa nada, crea las casillas en el
         * array destino con valores nulos
         */
        array3= Arrays.copyOf(array1,10);
        System.out.println("ejemplo de uso Arrays.copyOf");
        for (int elemento:array3) {
            System.out.println(elemento);
        }
        /**
         * uso del método copyOfRange. es una variación del anterior, como indica copy un rango indicado entre
         * el segundo y el tercer parámetro en el array destino
         */
        array4= Arrays.copyOfRange(array1,2,15);
        System.out.println("ejemplo de uso Arrays.copyOfRange");
        for (int elemento:array4) {
            System.out.println(elemento);
        }
    }


}