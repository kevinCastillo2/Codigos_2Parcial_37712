import java.util.Arrays; 
public class Ejercicio1 {

    static void intercambiar(int a, int b){
        int cambio = a; 
        a = b;
        b = cambio; 

        System.out.println("a=" + a +"\nb=" + b);
    }

    public static void main(String[] args) {
        int a = 2; 
        int b = 5;  

       intercambiar(a, b);
      

    }

}