/** Realizar un algoritmo que calcule la suma de todos los elementos de un vector
 * de tamaño N, con los valores ingresados por el usuario.
 */
package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        int n = pregInt("Ingrese la cantidad de números a ingresar: ");
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = pregInt("Ingrese el número %d de %d: ".formatted(i+1, n));
        }
        msgCS("La suma de los %d elementos del vertor es: %d".formatted(n, sumaVector(vector)));
    }

    public static int sumaVector(int[] vector) {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return suma;
    }

    // de Uso general
    private static void msgSS(String mensaje) {
        System.out.print(mensaje);
    }

    private static void msgCS(String mensaje) {
        System.out.println(mensaje);
    }

    private static int pregInt(String mensaje) {
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        msgSS(mensaje);
        return leer.nextInt();
    }
}
