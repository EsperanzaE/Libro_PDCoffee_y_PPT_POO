package Ejercicio4_2_triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int lado=pidelado();
        StringBuilder texto=new StringBuilder();
        texto=pintaTriangulo(lado);
        System.out.println(texto.toString());

    }

    private static StringBuilder pintaTriangulo(int lado) {
        String  asterisco="* ";
        String espacio = "  ";

        StringBuilder texto=new StringBuilder();
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <=lado-i; j++) {
                texto.append(espacio);
            }
            for (int j = 1; j <=i ; j++) {
                texto.append(asterisco);
            }
            texto.append("\n");

        }
        return texto;

    }

    private static int pidelado() {
        int lado=0;
        Scanner consola = new Scanner(System.in);
        boolean valido=false;
        while (!valido){
            try{
                System.out.println(" Dame el lado del triángulo. El valor ha de ser mayor que 0 y" +
                        "menor que 10");
                lado=consola.nextInt();
                if (lado>0 && lado <10)
                    valido=true;
                else {
                    System.out.println(" El lado del triángulo ha de ser mayor que 0 y" +
                            "menor que 10");
                    consola.nextLine();
                }
            } catch (Exception e) {
                System.out.println(" Valor erroneo del lado. Ha de ser un entero mayor que 0 y" +
                        "menor que 10");
                    consola.nextLine();
            }
        }
        return lado;
        }

}
