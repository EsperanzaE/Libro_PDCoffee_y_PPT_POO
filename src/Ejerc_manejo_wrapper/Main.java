package Ejerc_manejo_wrapper;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Pedir números al usuario
            System.out.print("Ingrese el primer número: ");
            Integer num1 = sc.nextInt(); // Usamos Integer (Wrapper)

            System.out.print("Ingrese el segundo número: ");
            Integer num2 = sc.nextInt();

            System.out.print("Ingrese el tercer número: ");
            Integer num3 = sc.nextInt();

            // Calcular el mayor y el menor usando Integer
            Integer mayor = Integer.max(num1, Integer.max(num2, num3));
            Integer menor = Integer.min(num1, Integer.min(num2, num3));

            // Calcular el promedio (convertimos a double para evitar división entera)
            Double promedio = (num1 + num2 + num3) / 3.0;

            // Mostrar resultados
            System.out.println("\nEl número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
            System.out.println("El promedio es: " + promedio);
            sc.close();
        }
    }

