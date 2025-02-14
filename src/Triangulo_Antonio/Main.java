package Triangulo_Antonio;

    import java.util.Scanner;
    public class Main
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner(System.in);

            System.out.printf("Introduce la altura: ");
            int altura = entrada.nextInt();

            StringBuilder linea = new StringBuilder();

            for(int i = 1; i< altura; i++) {
                for (int espacios = 1; espacios <= (altura-i); espacios++) {
                    linea.append("  ");
                }
                for (int asteriscos = 1; asteriscos <=i; asteriscos++) {
                    linea.append(" *");
                }

              linea.append("\n");

            }
            System.out.println(linea);
        }
    }


