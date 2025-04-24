package Recorrer_array;

public class Main {
    //Clase que va a crear un array, lo inicializa directamente, lo recorre y lo imprime por pantalla
    // para recorrer la lista forEach vamos a usa un "for each"
    public static void main(String[] args) {
        int[] lista;
        lista = new int[8];
        int[] otraLista = new int[8];
        int[] otraMas = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] forEach ={1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < lista.length; i++) {
            lista[i]=i;
            System.out.println(lista[i]);

        }
        for (int i = 0; i < otraLista.length; i++) {
            otraLista[i]=i;
            System.out.println(otraLista[i]);

        }
        for (int i = 0; i < otraMas.length; i++) {
            System.out.println(otraMas[i]);

        }
        System.out.println("imprimo el bucle for each");
        for (int entero:forEach) {
            System.out.println(entero);


        }
    }
}