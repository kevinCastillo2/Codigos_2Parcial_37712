/*
Nombre: Kevin Castillo 
Nrc: 37712
Un programa que imprima la tabla de multiplicar n numero pedido por el usuario.
*/

import java.util.Scanner;

public class Ejercicio2 {

    public static void imprimirTabla(int n) {

        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Ingrese un numero: ");
        n = sc.nextInt();

        imprimirTabla(n);

    }
}

