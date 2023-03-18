/**Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
 * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
 * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicio_4;

/**
 * @author Sebastián Cozzi
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        System.out.println("Generando Matriz........");
        int[][] matrizO=new int[4][4];
        matrizO=llenarMatriz(4,4);
        System.out.println("");
        System.out.println("Matriz Original:");
        mostrarMatriz(matrizO,4,4);
        System.out.println("");
        System.out.println("Matriz Transpuesta: ");
        mostrarMatriz(transpuesta(matrizO,4,4),4,4);
        System.out.println("Fin.-");
    }
    
    
    private static int[][] llenarMatriz(int dimX, int dimY){
        int[][] matriz = new int[dimX][dimY];
        for (int i = 0; i  < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                matriz[i][j]=(int) (Math.random() * 100);
            }
        }
        return matriz;
    }
    
    private static void mostrarMatriz(int[][] matriz, int dimX, int dimY){
        for (int i = 0; i < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                System.out.print("[%3d] ".formatted(matriz[i][j]));
            }
            System.out.println("");
        }
    }
    
    private static int[][] transpuesta(int[][] matriz, int dimX,int dimY){
        int[][] temp= new int[dimY][dimX];
        for (int i = 0; i < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                temp[j][i]= matriz[i][j];
            }
        }
        return temp;
    }
}
