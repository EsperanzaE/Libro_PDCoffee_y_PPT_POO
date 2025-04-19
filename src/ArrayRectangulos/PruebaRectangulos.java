package ArrayRectangulos;

public class PruebaRectangulos {
    public static void main(String[] args) {
//creamos el rectángulo
        Rectangulo[] rectangulos = new Rectangulo[3];
//inicializamos los tres objetos rectángulo
// una forma es la siguiente:
        rectangulos[0] = new Rectangulo(2, 3);
        rectangulos[1] = new Rectangulo(3, 4);
        rectangulos[2] = new Rectangulo(8, 9);
// otra forma es hacerlo en una sola línea
        Rectangulo[] rectangulos2 = {new Rectangulo(10, 20),
                new Rectangulo(30, 40), new Rectangulo(50, 80)};
// Usar el array.
// Para calcular y mostrar el área de los rectángulos por ejemplo
        for (int i = 0; i < rectangulos.length; i++) {
            System.out.print(rectangulos[i].toString());
            System.out.println(rectangulos[i].calcularArea());

        }
    }
}