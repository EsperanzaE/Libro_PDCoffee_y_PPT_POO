package Cuenta.Visibilidad;


public class Cuenta {
    public String nombre;
    private double saldo;
    String dni;

    /**
     * este es el constructor con todos los parámentros.
     * @param nombre: se usa para el titular de la cuenta
     * @param saldo: contendrá el saldo de la cuenta
     * @param dni: contendrá el dni del cñleinte
     */

    public Cuenta(String nombre, double saldo, String dni) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.dni = dni;
    }

    public Cuenta() {
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

