/** Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido
 */
package ejercicio_2;

import java.util.Scanner;

/**
 * @author Sebastián Cozzi
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        int dim = pregInt("Ingresar el tamaño del vector: ");
        int[] vector = new int[dim];
        System.out.println("Llenando vector");
        int val;
        vector = llenarVector(dim);
        int help = 0;
        do {
            if (help == 3) {
                System.out.println("Ayuda: ");
                mostrar(vector);
            }
            val = pregInt("Ingresar el valor a buscar: ");
            help++;
        } while (!buscaValor(vector, val));
    }

    private static void mensSS(String mensaje) {
        System.out.print(mensaje);
    }

    private static int pregInt(String mensaje) {
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        mensSS(mensaje);
        return leer.nextInt();
    }

    private static int[] llenarVector(int dimension) {
        int[] vector = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i] = (int) Math.round(Math.random() * 100);
        }
        return vector;
    }

    private static boolean buscaValor(int[] vector, int valorBuscado) {
        boolean enco = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == valorBuscado) {
                if (enco) {
                    System.out.println("El valor %d se encuentra repetido en la posición %d del vector".formatted(valorBuscado, i));
                } else {
                    System.out.println("El valor %d se encuentra en la posición %d del vector".formatted(valorBuscado, i));
                    enco = true;
                }
            }
        }
        return enco;
    }

    private static void mostrar(int[] vector) {
        int dim = vector.length;
        for (int i = 0; i < dim; i++) {
            System.out.print("[%3d]".formatted(vector[i]));
            if ((((i + 1) % Math.sqrt(dim)) == 0)) {
                System.out.println("");
            }
        }
    }
}
