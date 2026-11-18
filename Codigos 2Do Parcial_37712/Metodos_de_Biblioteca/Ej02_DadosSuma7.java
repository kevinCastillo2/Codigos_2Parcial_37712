/*
Nombre: Kevin Castillo
Nrc: 37712
Programa lanzar dos dados 1000 veces y contar cuántas veces suman 7
*/
import java.util.Random;
import java.util.Locale;
public class Ej02_DadosSuma7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random rnd = new Random();
        int lanzamientos = 1000;
        int conteo = 0;

        for (int i = 0; i < lanzamientos; i++) {
            int dado1 = rnd.nextInt(6) + 1;
            int dado2 = rnd.nextInt(6) + 1;
            if (dado1 + dado2 == 7) {
                conteo++;
            }
        }

        double porcentaje = (conteo * 100.0) / lanzamientos;

        System.out.println("Lanzamientos: " + lanzamientos);
        System.out.println("Veces que sumaron 7: " + conteo);
        System.out.printf("Porcentaje: %.2f%%%n", porcentaje);
    }
}