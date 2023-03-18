/** Realizar un algoritmo que llene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.
 */
package ejercicio_1;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        byte[] vector= new byte[100];
        System.out.println("Generando Vector ....");
        vector = llenaVector(100);
        System.out.println("Mostrando Vector ....");
        mostrarVector(vector,100);
        System.out.println("Fin Vector ....");
    }

    private static byte[] llenaVector(int dimension ){
        byte[] vector=new byte[dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i]= (byte) (i+1);
        }
        return vector;
    }
    private static void mostrarVector (byte[] vector ,int dimension){
            for (int i = 0; i < dimension; i++) {
                System.out.print("[%03d] ".formatted(vector[i]));
                if ((((i+1) %10) ==0)&& (i!=99)) System.out.println("->");
            }
    }
}
