/** Los profesores del curso de programación de Egg necesitan llevar un registro
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad
 * de aprobados y desaprobados. Durante el período de cursado cada alumno
 * obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales.
 * Las ponderaciones de cada nota son:
 * Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15%
 * Primer Integrador 25%
 * Segundo integrador 50%
 *Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
 * Al final del programa los profesores necesitan obtener por pantalla la
 * cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban
 * los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_4 {

    public static void main(String[] args) {

        float[][] notas = cargarNotas(10, 4);
        float[] promedios = calculaPromedios(10, 4, notas);
        muestraNotas(10, 4, notas, promedios);
        listarResultados(promedios);

    }

    // Funcion que permite cargar las 4 notas de cada alumno
    // tiene la capacidad de pasar por parametro la cantidad de alumnos y la cantidad de notas
    public static float[][] cargarNotas(int alumnos, int notasxAlumno) {
        float[][] notas = new float[alumnos][notasxAlumno];
        String[] detalleNota = {"Primer Trabajo Practico", "Segundo Trabajo Practico", "Primer Integrador", "Segundo Integrador"};
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < alumnos; i++) {
//            System.out.println("Ingresar las notas del alumno " + (i + 1) + ": ");
            for (int j = 0; j < notasxAlumno; j++) {
//                System.out.print("Nota del " + detalleNota[j] + ": ");
//                notas[i][j] = leer.nextInt();
                notas[i][j]= (float) Math.round(Math.random()*9)+1;
            }
            System.out.println("------------------------------");
        }
        return notas;
    }

    // Basado en la matriz de notas calcula el promedio de notas con el porcentaje que representa cada evaluación
    public static float[] calculaPromedios(int alumnos, int notasxAlumno, float[][] notas) {
        float[] promedios = new float[alumnos];
        float[] ponderacion = {(float) 0.10, (float) 0.15, (float) 0.25, (float) 0.50};
        for (int i = 0; i < alumnos; i++) {
            promedios[i] = 0;
            for (int j = 0; j < notasxAlumno; j++) {
                promedios[i] += notas[i][j] * ponderacion[j];
            }
        }
        return promedios;
    }

    // Cuenta los alumnos aprobados y muestra cuantos aprobaron
    // Los no aprobados los calcula restando la cantidad de alumnos y aprobados
    public static void listarResultados(float[] notaFinal) {
        int aprobados = 0;
        for (int i = 0; i < notaFinal.length; i++) {
            if (notaFinal[i] >= 7) {
                aprobados++;
            }
        }
        System.out.println("Fueron " + aprobados + " los alumnos que aprobaron el curso.");
        System.out.println("Y " + (notaFinal.length - aprobados) + " no llegaron a los 7 puntos como para aprobar el curso.");
    }

    private static void muestraNotas(int Alumnos, int notasxAlumno, float[][] notas, float[] promedios) {
        for (int i = 0; i < Alumnos; i++) {
            System.out.println("Alumno N° " + (i + 1) + ":");
            for (int j = 0; j < notasxAlumno; j++) {
                System.out.print("Nota " + (j + 1) + ": " + notas[i][j]+" - ");
            }
            System.out.print("Promedio: " + promedios[i] + ".");
            System.out.println("");
        }
    }
}
