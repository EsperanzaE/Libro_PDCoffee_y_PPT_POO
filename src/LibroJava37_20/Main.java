package LibroJava37_20;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int numero=0;
       Scanner consola = new Scanner(System.in);
       String respuesta="";
       char caracter='s';

        while (caracter !='n' && caracter!='N'){
        numero = pideNumero();
        compruebaSiPrimo(numero);

        System.out.print("quieres introducir otro número, si no quieres pulsa N ");

        respuesta=consola.next();
        caracter= respuesta.charAt(0);

           }
        System.out.println("Programa terminado");

}

    private static void compruebaSiPrimo(int numero) {
        int cociente=numero;
        int numeroDelReves=0;
        while (cociente>0) {
            numeroDelReves=(numeroDelReves*10)+ (cociente%10);
            cociente=cociente/10;
        }
        System.out.println("numero "+ numero);
        System.out.println("numero del reves "+ numeroDelReves);

        if (numero==numeroDelReves)
            System.out.println("el numero "+ numero + " es capicúa.");
        else
            System.out.println("el numero "+ numero + " no es capicúa.");
    }

    private static int pideNumero() {
        System.out.print("Introduce un número entero de 5 cifras o menos ");
        Scanner consola= new Scanner(System.in);

        int numero=consola.nextInt();
        return numero;

    }
    }
