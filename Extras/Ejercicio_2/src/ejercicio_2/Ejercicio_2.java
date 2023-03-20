/**Escriba un programa que averigüe si dos vectores de N enteros son iguales 
 * (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre
 * los elementos).
 */
package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
       int[] vector1= llenaVectorAlea(pregInt("ingrese la longitud del vector 1:"));
       int[] vector2= llenaVectorAlea(pregInt("ingrese la longitud del vector 2:"));
        if (comparaVector(vector1,vector2)) {
            msgCS("Los vectores comparados son iguales.");
        } else {
            msgCS("Los vectores comparados son distintos.");
        }
       
    }
    
    public static boolean comparaVector(int[] vector1, int[] vector2){
        /// verifica que los 2 vector tengan la misma cantidad de items
        if (vector1.length != vector2.length) return false;
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                return false;                
            }
        }
        return true;
    }
    
    public static int[] llenaVectorAlea(int dimension){
        int[] vector = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i]= (int) Math.round(Math.random()*100);
        }
        return vector;
    }
    
    //////////////////////////////////////////////
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
