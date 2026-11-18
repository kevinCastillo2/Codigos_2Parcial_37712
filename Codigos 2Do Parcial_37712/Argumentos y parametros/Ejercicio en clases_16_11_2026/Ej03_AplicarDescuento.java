import java.util.Arrays; 
public class Ejercicio3 {

    static void aplicarDescuento(double[] precios, double pct){
        for (int i = 0; i < precios.length; i++){
            precios[i] = precios[i] - (precios[i] * pct)/100;
        }
    }

    public static void main(String[] args) {
        double[] precios = {120.0, 180.0, 50.0};

        aplicarDescuento(precios, 10);

        for (int i = 0; i < precios.length; i++){
            System.out.println("Descuento aplicado: " + precios[i]);
        }

    }
    
}
