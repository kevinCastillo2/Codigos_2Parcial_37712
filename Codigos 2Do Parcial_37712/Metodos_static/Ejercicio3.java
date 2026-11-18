/*
Nombre: Kevin Castillo
Nrc: 37712
Un programa que de el promedio de tres notas.
*/


import java.util.Scanner;
import java.util.Locale;

public class Ejercicio3 {

    public static double promedio3(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Ingrese nota a: ");
        a = sc.nextDouble();

        while (a < 0 || a > 20) {
            System.out.println("Nota incorrecta. Ingrese una nota de 0 a 20:");
            a = sc.nextDouble();
        }

        System.out.print("Ingrese nota b: ");
        b = sc.nextDouble();

        while (b < 0 || b > 20) {
            System.out.println("Nota incorrecta. Ingrese una nota de 0 a 20:");
            b = sc.nextDouble();
        }

        System.out.print("Ingrese nota c: ");
        c = sc.nextDouble();

        while (c < 0 || c > 20) {
            System.out.println("Nota incorrecta. Ingrese una nota de 0 a 20:");
            c = sc.nextDouble();
        }

        System.out.printf("Promedio es: %.2f%n ", promedio3(a, b, c));

    }
}


