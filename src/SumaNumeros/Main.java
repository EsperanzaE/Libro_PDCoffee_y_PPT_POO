package SumaNumeros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1=0, num2=0;

        String mensaje1="Dame el primer número pero que no sea mayor de 1000";
        String mensaje2="Dame el segundo número pero que no sea mayor de 1000";
        num1=pideNumero(mensaje1);
        num2=pideNumero(mensaje2);
        System.out.println("La suma de "+ num1 + " y "+ num2+ " es : "+ (num1+num2));



    }

    private static int pideNumero(String mensaje) {
        boolean valido=false;
        int numero=0;
        Scanner consola= new Scanner(System.in);
        while (!valido){
            try{

                System.out.println(mensaje);
                numero=consola.nextInt();

                if (numero<=1000) {
                    valido = true;
                }else {
                    System.out.println("el número tiene que ser menor o igual que 1000, intenta otra vez" );
                }
            } catch (InputMismatchException errorInput) {
                System.out.println("número no válido, inténtelo de nuevo");
                consola.nextLine();
            }
            catch (Exception e) {
                System.out.println("número no válido, inténtelo de nuevo");
                consola.nextLine();
            }
            finally {
                System.out.println("seguimos para bingo");
            }
        }
        return numero;
    }
}
