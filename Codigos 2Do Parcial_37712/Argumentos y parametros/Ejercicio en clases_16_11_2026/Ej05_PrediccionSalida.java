public class Ejercicio5 {

    // Ejercicios 1 y 2: intercambiar 
    public static void intercambiar(int a, int b) {
        int cambio = a;
        a = b;
        b = cambio; 
        System.out.println("a = " + a + "\nb = " + b);
    }

    public static void intercambiar(int[] v, int i, int j) {
        int camb = v[i];
        v[i] = v[j];
        v[j] = camb;
    }

    // Ejercicio 3: aplicarDescuento
    public static void aplicarDescuento(double[] precios, double pct) {
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] - (precios[i] * pct / 100);
        }
    }

    // Ejercicio 4: perimetro (sobrecargado)
    public static double perimetro(double lado) {
        return 4 * lado;
    }

    public static double perimetro(double a, double b) {
        return 2 * (a + b);
    }

    public static void main(String[] args) {

        // LLAMADA 1: intercambiar
        int a = 5;
        int b = 10;
        intercambiar(a, b);

        int[] datos = {1, 2, 3, 4, 5};
        intercambiar(datos, 0, 4);
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i]+ " ");
        }
        System.out.println();

        // LLAMADA 2: aplicarDescuento
        double[] precios = {186.0, 90.0, 60.0};
        aplicarDescuento(precios, 10);
        for (int i = 0; i < precios.length; i++) {
            System.out.print(precios[i]+ " ");
        }
        System.out.println();

        // LLAMADA 3: perimetro
        System.out.println("Cuadrado: " + perimetro(4));
        System.out.println("Rectángulo: " + perimetro(4, 6));
    }
}