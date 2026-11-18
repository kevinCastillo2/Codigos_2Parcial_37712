/*
Nombre: Kevin Castillo
Nrc:37712
Programa poder contar vocales de una frase
*/
import java.util.Scanner;

public class Ej04_ContarVocales {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase que sea favorita: ");
        String frase = sc.nextLine();

        int mayusculas = 0;
        int minusculas = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                char letra = Character.toLowerCase(c);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    if (Character.isUpperCase(c)) {
                        mayusculas++;
                    } else {
                        minusculas++;
                    }
                }
            }
        }

        System.out.println("Vocales mayusculas: " + mayusculas);
        System.out.println("Vocales minusculas: " + minusculas);
        System.out.println("Total de vocales: " + (mayusculas + minusculas));
    }
}