package StringBuilder;

public class Main {
    public static void main(String[] args) {
        long inicio, fin;

        // Prueba con String
        inicio = System.currentTimeMillis();
        String texto1 = "";
        for (int i = 0; i < 100000; i++) {
            texto1 += "a"; // Crea un nuevo String cada vez
        }
        fin = System.currentTimeMillis();
        System.out.println("Tiempo con String: " + (fin - inicio) + " ms");

        // Prueba con StringBuilder
        inicio = System.currentTimeMillis();
        StringBuilder texto2 = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            texto2.append("a"); // Usa el mismo objeto
        }
        fin = System.currentTimeMillis();
        System.out.println("Tiempo con StringBuilder: " + (fin - inicio) + " ms");
    }
}

