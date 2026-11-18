/*
Nombre: Kevin Castillo
Nrc: 37712
Programa que permita generar un codigo de 6 caracteres: 3 letras aleatorios y 3 digitos
*/
import java.util.Random;

public class Ej05_GenerarCodigo {

    public static void main(String[] args) {
        Random rnd = new Random();
        String codigo = "";

        // Son 3 letras aleatorias (A-Z)
        for (int i = 0; i < 3; i++) {
            char letra = (char) ('A' + rnd.nextInt(26));
            codigo += letra;
        }

        // Son 3 digitos aleatorios (0-9)
        for (int i = 0; i < 3; i++) {
            codigo += rnd.nextInt(10);
        }

        System.out.println("Codigo generado: " + codigo);
    }
}