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
                System.out.println("Ayuda: ");
                mostrar(vector);
            val = pregInt("Ingresar el valor a buscar: ");
           buscaValor(vector, val);
        
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

    //private static boolean buscaValor(int[] vector, int valorBuscado) {
    private static void buscaValor(int[] vector, int valorBuscado) {
        boolean encontro = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == valorBuscado) {
                if (encontro) {
                    System.out.println("El valor "+valorBuscado+" se encuentra repetido en la posición "+ i +" del vector");
                } else {
                    System.out.println("El valor " + valorBuscado +" se encuentra en la posición "+ i +" del vector");
                    encontro = true;
                }
            }
        }
        if (!encontro) System.out.println("El valor buscado no se encuentra en el vector.");
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
