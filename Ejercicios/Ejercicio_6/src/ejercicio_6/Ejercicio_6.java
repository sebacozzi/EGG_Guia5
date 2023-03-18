/**Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package ejercicio_6;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz=new int[3][3];
        boolean esOnoEs;
        int cont=0;
        do {
            matriz=vaciarMatriz();
        matriz=llenacubo();
        
        esOnoEs=esMagico(matriz);
        if (esOnoEs){
            System.out.println("La matiz es magica");
            mostrarMatriz(matriz);
            System.out.println("Repeticiones: "+cont);
        }
        cont++;
        } while (!esOnoEs);
        System.out.println(cont);
       /*matriz=escribeMatriz("276951438");
       mostrarMatriz(matriz);
       esOnoEs=esMagico(matriz);
        if (esOnoEs) System.out.println("La matiz es magica");
        else
            System.out.println("La matiz no es magica");
*/
    }
    private static int[][] vaciarMatriz(){
        int[][] temp= new int[3][3];
        return temp;
    }
    private static int[][] llenacubo(){
        var matriz=new int[3][3];
        int valor;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    do {
                    valor = (int) (Math.random()*9+1); 
                    } while ( enMatriz(matriz,valor));
                    matriz[i][j]=valor;                    
            }
        }
        return matriz;
    }
    private static int[][] escribeMatriz(String datos){
        int[][] matriz= new int[3][3];
        int ind;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ind=i*3+j;
                matriz[i][j]= Integer.parseInt(datos.substring(ind, ind+1));                
            }
        }
        return matriz;
    }
    private static boolean enMatriz(int[][] matriz, int valor){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j]==valor) return true;                
            }
        }
        return false;
    }
     private static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[%d] ".formatted(matriz[i][j]));
            }
            System.out.println("");
        }
    }
     private static boolean esMagico(int[][] matriz){
         int suma=0;
         int temp;
         for (int i = 0; i < 3; i++) {
             suma += matriz[i][0];
         }
         for (int i = 0; i < 3; i++) {
             temp=0;
             for (int j = 0; j < 3; j++) {
                 temp +=matriz[i][j];
             }
             if (suma!=temp) return false;
         }
         for (int i = 0; i < 3; i++) {
             temp=0;
             for (int j = 0; j < 3; j++) {
                 temp +=matriz[j][i];
             }
             if (suma!=temp) return false;
         }
         temp=0;
         for (int i = 0; i < 3; i++) {
             temp+=matriz[i][i];
             
         }
         if (suma!=temp) return false;
         temp=matriz[0][2]+matriz[1][1]+matriz[2][0];
         if (suma!=temp) return false;
         return true;
     }
}
