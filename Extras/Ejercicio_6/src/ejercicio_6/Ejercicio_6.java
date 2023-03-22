/**Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras 
 * para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas
 * en orden horizontal en una fila que será seleccionada de manera aleatoria. 
 * Una vez concluida la ubicación de las palabras, rellene los espacios no 
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
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
        String[] palabras=new String[5];
        System.out.println("Ingrese 5 palabras...");
        for (int i = 0; i < 5; i++) {
            System.out.print("Palabra "+(i+1) + ": ");
            palabras[i]=leer.next();
        }
    }
    private static String[][] llenaSopa(String[] palabras){
        String[][] sopa=new String[20][20];
        int[] posVert=new int[5];
        int[] posHori= new int[5];
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                
            }
            
        }
    }
}
