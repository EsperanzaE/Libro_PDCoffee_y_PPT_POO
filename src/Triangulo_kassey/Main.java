package Triangulo_kassey;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);
            StringBuilder linea = new StringBuilder();

            // Declarar la variable para el número de filas del triángulo
            // Gestionar excepciones con try-catch
            try {
                // Solicitar al usuario el número de elementos del triángulo
                System.out.print("Introduce un número entero mayor que 0: ");
                int n = scanner.nextInt();

                // Validar que el número sea mayor que 0
                if (n <= 0) {
                    throw new IllegalArgumentException("El número debe ser mayor que 0.");
                }

                // Crear el triángulo rectángulo usando un StringBuilder
                for (int i = 1; i <= n; i++) {
                    // Espacios en blanco para alinear los asteriscos a la derecha
                    for (int j = 1; j <= n-i; j++) {
                        linea.append(" ");
                    }

                    // Agregar asteriscos con espacios entre ellos
                    for (int j = 1; j <= i; j++) {
                        linea.append("* ");
                    }
                   // Imprimir la línea del triángulo
                    linea.append("\n");
                }
                System.out.println(linea);


            } catch (Exception e) {
                // Capturar cualquier error y mostrar mensaje de error
                System.out.println("Error: " + e.getMessage());
            } finally {
                // Cerrar el scanner
                scanner.close();
            }
        } }


