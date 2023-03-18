/**Realice un programa que compruebe si una matriz dada es antisimétrica. Se 
 * dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
 * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
 * sus filas por columnas (o viceversa).
 */
package ejercicio_5;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        int x=3;
        int y=6;
        System.out.println("genera matriz original");
        int[][] matriz=llenarMatriz(x,y);
        mostrarMatriz(matriz,x,y);
        int[][] matrizA=generaAsimetrica(matriz,x,y);
        System.out.println("Matriz Asimetrica:");
        mostrarMatriz(matrizA,y,x);
        int[][] matrizNoA=mataAsimetrica(matrizA,y,x);
        System.out.println("Matriz Asimetrica fallada: ");
        mostrarMatriz(matrizNoA,y,x);
        
        if (esAsimetrica(matriz,matrizA,x,y))
            System.out.println("La matriz y matrizA son asimetricas");
        else
            System.out.println("La matriz y matrizA no son asimetricas");
        
        if (esAsimetrica(matriz,matrizNoA,x,y))
            System.out.println("La matriz y matrizNoA son asimetricas");
        else
            System.out.println("La matriz y matrizNoA no son asimetricas");
        
        
    }
        private static int[][] llenarMatriz(int dimX, int dimY){
        int[][] matriz = new int[dimX][dimY];
        for (int i = 0; i  < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                matriz[i][j]=(int) (Math.random() * 20-10);
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
    private static int[][] generaAsimetrica(int[][] matriz, int dimX, int dimY){
        int[][] asi=new int[dimY][dimX];
        for (int i = 0; i < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                asi[j][i]=-matriz[i][j];                
            }            
        }
        return asi;
    }
    
    private static int[][] mataAsimetrica(int[][] matriz, int dimX, int dimY){
        int[][] asi=new int[dimX][dimY];
        for (int i = 0; i < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                if ((int)(Math.random()*3)  == 1 ) {
                    asi[i][j]=-matriz[i][j];
                }else asi[i][j]=matriz[i][j];                
            }            
        }
        return asi;
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
     private static boolean esAsimetrica(int[][] matriz, int[][] matrizA, int dimX,int dimY){
        
        for (int i = 0; i < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                if (Math.abs(matrizA[j][i])!= Math.abs(matriz[i][j])) return false;
            }
        }
        return true;
    }
}
