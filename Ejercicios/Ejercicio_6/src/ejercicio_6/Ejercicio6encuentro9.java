/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6encuentro9;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio6encuentro9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int colum[] = new int[matriz.length];
        int fila[] = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("ingrese los numeros para la matriz" + (i + 1));
                matriz[i][j] = leer.nextInt();
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                fila[i] += matriz[i][j];
                colum[i] += matriz[j][i];
                System.out.println("la suma de filas es: :" + fila[i]);
                System.out.println("la suma de columnas es :" + colum[i]);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
                System.out.println(Arrays.toString(colum));
            }
            System.out.println("");
            if (colum[i] == fila[i]) {
                System.out.println("la matriz es magica: ");
            } else {
                System.out.println("la matriz no es magica: ");
            }
        }

    }
}
