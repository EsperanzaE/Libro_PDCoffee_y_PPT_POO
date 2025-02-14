package Triangulo_Mario;


import java.lang.StringBuilder;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args){
            int altura=pediraltura();
            reproduceTriangulo(altura);
        }
        private static void reproduceTriangulo(int altura) {
            int caracter=altura;
            StringBuilder asteriscos = new StringBuilder();
            for (int i = 0; i < (altura); i++) {
                for (int j = 1; j<(altura-i); j++) {
                    asteriscos.append(" ");
                }
                for (int j = 0; j <=i; j++) {
                    asteriscos.append("*");
                }
                asteriscos.append("\n");


            }
            System.out.println(asteriscos);
        }
        private static int pediraltura(){
            int altura=0;
            Scanner consola= new Scanner(System.in);
            boolean valido=false;
            while(!valido){
                try{
                    System.out.println("Introduzca la altura del triángulo mayor que 0");
                    altura =consola.nextInt();
                    if(altura>0){
                        valido=true;
                    }
                    else{
                        System.out.println("El lado del triangulo debe de ser mayor que 0");
                        consola.nextLine();
                    }
                } catch (Exception e) {
                    System.out.println("Valor erroneo");
                    consola.nextLine();
                }
            }
            return altura;
        }
    }


