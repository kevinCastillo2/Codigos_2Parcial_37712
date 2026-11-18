/*
Nombre: Kevin Castillo 
Nrc: 37712
Un programa con un contador static que se llame desde el for.
*/

public class Ej03_TrazaContadorStatic {
    
    static int contador = 0;

    static void incrementar() {
        contador++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            incrementar();
        }
        System.out.println(contador);
    }
}
/*
TRAZA DEL CONTADOR STATIC 

linea | variables vivas                | valor
------|--------------------------------|---------------------------
  8   | contador (static)              | contador = 0
  15  | args, i (bloque)               | i = 0, contador = 0
 16  | args, i                        | llama a incrementar() con i = 0
  11   | contador                       | contador = 0 -> 1
  15   | args, i                        | i = 1 (i++), contador = 1
 16   | args, i                        | llama a incrementar() con i = 1
  11   | contador                       | contador = 1 -> 2
  15   | args, i                        | i = 2 (i++), contador = 2
 16   | args, i                        | llama a incrementar() con i = 2
  11   | contador                       | contador = 2 -> 3
  15   | args, i                        | i = 3 (i++), 3 < 3 es falso: sale del for; i muere
 18   | args, contador                 | imprime 3

Salida en pantalla: 3
El static conserva su valor entre llamadas, por eso llega a 3.
*/