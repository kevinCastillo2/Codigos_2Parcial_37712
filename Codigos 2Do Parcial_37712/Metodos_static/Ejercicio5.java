/*
Nombre: Kevin Castillo
Nrc: 37712
Un programa para saber si un anio es bisiesto o no 
*/

import java.util.Scanner;

public class Ejercicio5 {

    public static boolean esBisiesto(int anio) {

        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anio;

        System.out.print("Ingrese el anio: ");
        anio = sc.nextInt();

        System.out.println(esBisiesto(anio));

    }
}

