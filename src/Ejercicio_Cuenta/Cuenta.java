package Ejercicio_Cuenta;

public class Cuenta {
    String numero="";

    double saldo=1000.5;

    public Cuenta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double obtenerSaldo(){
        return getSaldo();
    }
    public void mostrarSaldo(){
        System.out.println(getSaldo());
    }

    public void depositar (double cantidad){
        setSaldo(getSaldo()+cantidad);
    }
    public void retirar (double cantidad){
        setSaldo(getSaldo()-cantidad);
    }




}
