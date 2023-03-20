/** Crear una función rellene un vector con números aleatorios, pasándole un
 * arreglo por parámetro. Después haremos otra función o procedimiento que
 * imprima el vector.
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        int[] arreglo = new int[pregInt("Ingresar la cantidad de elementos del vector: ")];
        arreglo = rellenaVector(arreglo,500);
        mostrarVector(arreglo, true);
    }

    public static int[] rellenaVector(int[] vector,int maxAleatorio) {
        int[] v = new int[vector.length];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * maxAleatorio);
        }
        return v;
    }

    public static void mostrarVector(int[] vector, boolean cortar) {
        System.out.print(" ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[%4d]".formatted(vector[i]));
            if (cortar && ((i+1) % 20 == 0) && i!=vector.length-1 ) {
                System.out.println("->");
                System.out.print(">");
            }
        }
        System.out.println("");
    }

    // de Uso general
    private static void msgSS(String mensaje) {
        System.out.print(mensaje);
    }

    private static int pregInt(String mensaje) {
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        msgSS(mensaje);
        return leer.nextInt();
    }
}
