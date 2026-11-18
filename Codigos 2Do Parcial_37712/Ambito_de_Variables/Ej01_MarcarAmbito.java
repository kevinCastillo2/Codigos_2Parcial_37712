/*
Nombre: Kevin Castillo
Nrc: 37712
Programa de 25 lineas y con comentario marcar si es local, del bloque o static.
 */

public class Ej01_MarcarAmbito {
    static int contador = 0;                 // static 
    static final double IVA = 0.15;          // static

    static int sumar(int a, int b) {         // a, b: local 
        int resultado = a + b;               // local 
        return resultado;
    }

    public static void main(String[] args) { // args: local
        int total = 0;                       // local 
        for (int i = 0; i < 3; i++) {        // i: de bloque (solo dentro del for)
            int doble = i * 2;               // de bloque (solo dentro del for)
            total = sumar(total, doble);
            contador++;
        }
        if (total > 2) {
            String mensaje = "Total mayor a 2"; // de bloque (solo dentro del if)
            System.out.println(mensaje);
        }
        double precio = 100;                 // local
        double conIva = precio * (1 + IVA);  // local
        System.out.println(conIva);
        System.out.println(contador);
    }
}