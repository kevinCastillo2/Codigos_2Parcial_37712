import java.util.Locale;
public class Ejercicio4 {
    static double perimetro (double lado){
        return 4 * lado; 

    }

    static double perimetro (double a, double b){
        return 2 * (a + b); 
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("El perimetro del cuadrado: " + perimetro(8));
        System.out.println("El perimetro del rectangulo: " + perimetro(6, 2));
    }

    
}
