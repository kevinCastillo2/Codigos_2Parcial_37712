/**
 * Nombre: Kevin Castillo
 * Nrc: 37712
 * Un programa donde debe ingresar a y b y verificar si a es multiplo de b y dar la salida de true
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static boolean esMultiplo(int a, int b) {

         if (b != 0 && a % b == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Ingrese a: ");
        a = sc.nextInt();

        System.out.print("Ingrese b: ");
        b = sc.nextInt();

        System.out.println("Devuelve: " + esMultiplo(a, b));

    }
}