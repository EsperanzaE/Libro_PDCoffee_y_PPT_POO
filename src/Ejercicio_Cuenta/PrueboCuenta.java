package Ejercicio_Cuenta;

import java.util.concurrent.Callable;

public class PrueboCuenta {
    public static void main(String[] args) {

        Cuenta miCuenta = new Cuenta("12345678", 1000.0);
        miCuenta.mostrarSaldo();
        miCuenta.depositar(1000.52);
        miCuenta.mostrarSaldo();

            }
        }


