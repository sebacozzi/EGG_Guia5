/**Recorrer un vector de N enteros contabilizando cuántos números son de 1 
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
       int dim=leer.nextInt();
       int[] vector = llenaVector(dim);
       int[] digitos=contarDigitos(vector);
        for (int i = 1; i < 6; i++) {
            System.out.println("Hay %d números de %d digitos.".formatted(digitos[i],i));
            
        }
       
    }
    private static int[] contarDigitos(int[] vector){
        int[] digitos={0,0,0,0,0,0};
        for (int i = 0; i < vector.length; i++) {
            digitos[digito(vector[i])]++;
        }
        return digitos;
    }
    private static int digito(int valor){
        if (valor == 0) return 0;
         else return digito(Math.round(valor/10))+1;
    }
    private static int[] llenaVector(int dimension){
        int[] vector=new int[dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i]=(int) Math.round(Math.random()*99999);
        }
        return vector;
    }
}
