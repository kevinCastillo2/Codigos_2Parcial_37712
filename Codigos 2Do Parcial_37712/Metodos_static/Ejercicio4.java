/*
Nombre: Kevn Castillo
Nrc: 37712
Un programa que devuelva el precio con IVA del 15%.
*/


import java.util.Scanner;
import java.util.Locale;

public class Ejercicio4 {

    public static double ivaIncluido(double precio) {

        return precio * 1.15;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precio;

        System.out.print("Ingrese el precio: ");
        precio = sc.nextDouble();

        System.out.printf("Precio con IVA: %.2f%n ", ivaIncluido(precio));

    }
}

