package Madera.Enumerado;

enum tipoMadera {ROBLE, CAOBA, NOGAL, CEREZO, PINO };

public class Main {
    public static void main(String[] args) {
        tipoMadera madera = tipoMadera.ROBLE;
        boolean resultado;
        System.out.println( "la madera elegida por el usuario es "+ madera.toString()) ;
         resultado=(madera==tipoMadera.CAOBA);
        System.out.println( "¿es la madera elegida por el usuario caoba? "+ (madera==tipoMadera.CAOBA)) ;
        System.out.println( "¿es la madera elegida por el usuario roble? "+ (madera==tipoMadera.ROBLE)) ;
    }
}
