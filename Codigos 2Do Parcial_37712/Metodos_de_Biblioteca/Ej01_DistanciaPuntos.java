/*
Nombre: Kevin Castillo
Nrc: 37712
Programa distancia entre dos puntos con Math.sqrt y Math.pow
*/
import java.util.Scanner;
import java.util.Locale;;

public class Ej01_DistanciaPuntos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        // distancia = raiz((x2-x1)^2 + (y2-y1)^2)
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("Distancia entre los puntos: %.2f%n", distancia);
    }
}