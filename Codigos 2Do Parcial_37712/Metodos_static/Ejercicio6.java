/*
Nombre: Kevin Castillo
Nrc: 37712
Un programa que este incluido todos los main de los anteriores ejercicios 
*/

import java.util.Scanner;
import java.util.Locale;
public class Ejercicio6 {

    public static boolean esMultiplo(int a, int b) {
        if (b != 0 && a % b == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void imprimirTabla(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static double promedio3(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static double ivaIncluido(double precio) {
        return precio * 1.15;
    }

    public static boolean esBisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, n, anio;
        double nota1, nota2, nota3, precio;

        System.out.println("EJERCICIO 1");

        System.out.print("Ingrese a: ");
        a = sc.nextInt();

        System.out.print("Ingrese b: ");
        b = sc.nextInt();

        System.out.println("Es multiplo: " + esMultiplo(a, b));

        System.out.println("\nEJERCICIO 2");

        System.out.print("Ingrese un numero: ");
        n = sc.nextInt();

        imprimirTabla(n);

        System.out.println("\nEJERCICIO 3");

        System.out.print("Ingrese tres numeros: ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();

        System.out.printf("Promedio es: %.2f%n", promedio3(nota1, nota2, nota3));

        System.out.println("\nEJERCICIO 4");

        System.out.print("Ingrese el precio: ");
        precio = sc.nextDouble();

        System.out.printf("Precio con IVA: %.2f%n", ivaIncluido(precio));

        System.out.println("\nEJERCICIO 5");

        System.out.print("Ingrese el anio: ");
        anio = sc.nextInt();

        System.out.println("Es bisiesto: " + esBisiesto(anio));

    }
}

