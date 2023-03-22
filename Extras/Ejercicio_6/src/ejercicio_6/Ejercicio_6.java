/** Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras
 * para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas
 * en orden horizontal en una fila que será seleccionada de manera aleatoria.
 * Una vez concluida la ubicación de las palabras, rellene los espacios no
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada.
 * Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
 * siguientes funciones de Java substring(), Length() y Math.random().
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_6 {

    public static void main(String[] args) {
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        System.out.println("Ingrese 5 palabras...");
        for (int i = 0; i < 5; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = leer.next();
        }
        System.out.println("");
        String[][] sopa = llenaSopa(palabras);
        mostrarMatriz(sopa,palabras);
    }

    private static void mostrarMatriz(String[][] matriz, String[] palabras) {
        
        String[] ayuda=new String[palabras.length+1];
        ayuda[0]="          Palabras:";
        for (int i = 1; i < ayuda.length; i++) {
            ayuda[i]="          "+palabras[i-1];
        }
        int idAyuda=0;
        for (String[] matriz1 : matriz) {

            for (int i = 0; i < matriz1.length; i++) {
                System.out.print(matriz1[i] + " ");
            }
            if (idAyuda< ayuda.length){
                System.out.print(ayuda[idAyuda]);
                idAyuda++;
            }
            System.out.println("");
        }
//campo rayo cielo sol sal
    }

    private static String[][] llenaSopa(String[] palabras) {
        String[][] sopa = new String[20][20];
        int[] posFila = new int[5];
        int[] posCol = new int[5];
        int valor;
        /// elije en forma aletoria en que fila va a estar cada palabra
        for (int i = 0; i < 5; i++) {
            do {
                valor = (int) (Math.random() * 19);
            } while (enVector(valor, posFila));
            posFila[i] = valor;
        }
        /// Elije en forma aleatoria en que posición va arrancar cada palabra
        for (int i = 0; i < 5; i++) {            
                posCol[i] = (int) (Math.random() * (19 - palabras[i].length()));
        }
        
        int fila; // es utiliza para almacenar la fila de ordenamiento en posVert y posHori
        for (int i = 0; i < 20; i++) {
            fila = enVectorI(i, posFila);/// utilizo la fila porque no voy a cargar mas de 1 palabra por fila
            for (int j = 0; j < 20; j++) {

                if (fila != -1) {
                    if ((j >= posCol[fila]) && j < posCol[fila] + palabras[fila].length()) {
                        sopa[i][j] = palabras[fila].substring(j - posCol[fila], (j - posCol[fila]) + 1);
                    } else {
                        sopa[i][j] = String.valueOf((int) (Math.random() * 9));
                    }
                } else {
                    sopa[i][j] = String.valueOf((int) (Math.random() * 9));
                }
            }
        }
        return sopa;
    }

    private static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[%d]".formatted(vector[i]));
        }
        System.out.println("");
    }
    /// devuelve verdadero si el valor está en el arreglo
    private static boolean enVector(int valor, int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (valor == vector[i]) {
                return true;
            }
        }
        return false;
    }
    // devuelve la posición en que se encuentra el primer valor dentro del vector
    private static int enVectorI(int valor, int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (valor == vector[i]) {
                return i;
            }
        }
        return -1;
    }
}
