/*
Nombre: Kevin Castillo
Nrc: 37712
Programa que valide una contraseña minimo 8 carateres
*/
import java.util.Scanner;

public class Ej03_ValidarContrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la contrasena: ");
        String clave = sc.nextLine();

        boolean tieneMayuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
            if (Character.isDigit(c)) {
                tieneDigito = true;
            }
        }

        if (clave.length() >= 8 && tieneMayuscula && tieneDigito) {
            System.out.println("Contrasena valida");
        } else {
            System.out.println("Contrasena invalida:");
            if (clave.length() < 8) {
                System.out.println(" Debe tener minimo 8 caracteres la contraseña");
            }
            if (!tieneMayuscula) {
                System.out.println(" Debe tener al menos una mayuscula la contraseña");
            }
            if (!tieneDigito) {
                System.out.println(" Debe tener al menos un digito la contraseña");
            }
        }
  
    }
}