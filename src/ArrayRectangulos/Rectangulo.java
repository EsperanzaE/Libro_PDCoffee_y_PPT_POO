package ArrayRectangulos;

public class Rectangulo {

    private int lado1,lado2;

    public Rectangulo(int base, int altura) {
        this.lado1 = base;
        this.lado2 = altura;
    }

    public int calcularArea() {
        return this.lado2*this.lado1;
    }

    public String toString(){
        return ("el área del rectángulo de lado1 = "+ this.lado1 +
                " y lado2 = "+ this.lado2 + " es: ");
    }
}