import java.util.Arrays; 
public class Ejericicio2 {
    static void intercambiar(int[] v, int i, int j){
        int camb = v[i];
        v[i] = v[j];
        v[j] = camb; 

    }
    
    public static void main(String[] args) {
        int[] datos = {1, 2, 3, 4};
        intercambiar(datos, 0, 3);

        for(int i = 0; i < datos.length; i++){
            System.out.println(datos[i]);
        }


    }
    
}
