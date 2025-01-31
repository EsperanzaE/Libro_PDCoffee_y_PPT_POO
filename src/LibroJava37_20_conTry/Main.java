package LibroJava37_20_conTry;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = 0;
        Scanner consola = new Scanner(System.in);
        String respuesta = "";
        char caracter = 's';

        while (caracter != 'n' && caracter != 'N') {
            numero = pideNumero();
            compruebaSiPrimo(numero);

            System.out.print("quieres introducir otro número, si no quieres pulsa N ");
            respuesta = consola.next();
            caracter = respuesta.charAt(0);
        }
        System.out.println("Programa terminado");

    }

    private static void compruebaSiPrimo(int numero) {
        int cociente = numero;
        int numeroDelReves = 0;
        while (cociente > 0) {
            numeroDelReves = ( numeroDelReves * 10 ) + ( cociente % 10 );
            cociente = cociente / 10;

        }
        System.out.println("numero " + numero);
        System.out.println("numero del reves " + numeroDelReves);

        if (numero == numeroDelReves)
            System.out.println("el numero " + numero + " es capicúa.");
        else
            System.out.println("el numero " + numero + " no es capicúa.");
    }

    private static int pideNumero() {
        int numero = 0;
        boolean valido = false;
        Scanner consola = new Scanner(System.in);

        while (!valido) {
            try {
                valido = true;
                System.out.print("Introduce un número entero de 5 cifras o menos: ");
                numero = consola.nextInt();
            }
            catch (InputMismatchException error) { // Excepción específica primero
                valido = false;
                System.out.println("Entrada inválida. Por favor, introduce un número entero.");
                consola.nextLine(); // Limpia el buffer de entrada
            }
            catch (Exception exception) { // Excepción genérica al final
                valido = false;
                System.out.println("Ha ocurrido un error inesperado.");
                consola.nextLine(); // Limpia el buffer de entrada
            }
        }
        return numero;
    }

}