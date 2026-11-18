/*
Nombre: Kevin Castillo
Nrc: 37712
Un programa que usa 3 atributos static para que use parámetros y return.
*/

/*
VERSION ORIGINAL 

public class Ej04 {
    static int a;
    static int b;
    static int resultado;

    static void sumar() {
        resultado = a + b;
    }

    public static void main(String[] args) {
        a = 3;
        b = 4;
        sumar();
        System.out.println(resultado);
    }
}
*/

// VERSION NUEVA (que esta sin static: usa parametros y return)
public class Ej04_ReescribirSinStatic {

    static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int resultado = sumar(a, b);
        System.out.println(resultado);
    }
}