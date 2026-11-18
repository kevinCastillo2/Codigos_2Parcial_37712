/*
Nombre: Kevin Castillo
Nrc: 37712
Indicar que lineas no compilan y por que
 */

public class Ej02_LineasNoCompilan {
    int edad = 20;

    static void mostrarEdad() {
        // System.out.println(edad);
        // ERROR del compilador: non-static variable edad cannot be referenced from a static context
        // LA CAUSA: mostrarEdad() es un metodo y es static y edad es un atributo (no static); cada metodo static no puede usarla sin un objeto.
    }

    public static void main(String[] args) {
        // int x = "hola";
        // ERROR del compilador: incompatible types: String cannot be converted to int
        // LA CAUSA: se asigna un texto (String) a una variable de tipo int.

        for (int i = 0; i < 3; i++) {
            System.out.println("vuelta");
        }
        // System.out.println(i);
        // ERROR del compilador: cannot find symbol (symbol: variable i, location: class Ej02)
        // LA CAUSA: i es una variable de bloque; solo existe dentro del for.

        // int y;
        // System.out.println(y);
        // ERROR del compilador: variable y might not have been initialized
        // LACAUSA: las variables locales no tienen valor por defecto; hay que darles un valor.

        int a = 1;
        // int a = 2;
        // ERROR del compilador: variable a is already defined in method main(String[])
        // LA CAUSA: no se puede declarar dos veces una variable con el mismo nombre en el mismo ambito.
        System.out.println(a);
    }
}