/**Ejercicio 13
* Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros 
* de equipo y define su tipo de dato de tal manera que te permita alojar sus 
* nombres más adelante.
* Ejercicio 14
* Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus 
* compañeros de equipo
*/
package ejercicio_guia;

import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_Guia {
    public static void main(String[] args) {
        // Inicia variable dim de tipo entero y le asigna la cantidad de compañeros
        int dim = pregInt("Ingresar la cantidad de participantes en el equipo: ");
        // Dimensiona el arreglo Equipo de tipo String y lo dimensiona con dim
        String[] Equipo = new String[dim];
        // Asigna los datos en el vector Equipo cargados en la función llenaVectorStr
        Equipo= llenaVectorStr(dim);  
        // Muestra el Vector Equipo
        mostrarVectorStr(Equipo, dim);
        // fin de main TODO: puede que se siga después
 
    }
    /** Muestra un mensaje por consola sin salto de linea
     * 
     */
    private static void mensajeSS(String mensaje){
        System.out.print(mensaje);
    }
    
    /** Muestra un mensaje por consola con salto de linea
     * 
     */
    private static void mensajeCS(String mensaje){
        System.out.println(mensaje);
    }
    
    /** Función que se pasa como parametro un texto para mostrar y devuelve un 
     * string ingresado por teclado
     * El cursor de ingreso se muestra en la misma linea del texto
    */
    private static String pregStr(String Texto){
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        mensajeSS(Texto);
        return leer.next();
    }
    
     /** Función que se pasa como parametro un texto para mostrar y devuelve un 
     * Int ingresado por teclado
     * El cursor de ingreso se muestra en la misma linea del texto
    */
    private static int pregInt(String Texto){
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        mensajeSS(Texto);
        return leer.nextInt();
    }
    private static String[] llenaVectorStr (int dim ){
        String[] Vector= new String[dim];
        for (int i = 0; i < dim; i++) {
            Vector[i]= pregStr("Ingrese el nombre del compañero #i: ".replace("#i",Integer.toString(i+1)));   
        }
        return Vector;
    }
    private static void mostrarVectorStr(String[] vector, int dimension){
        for (int i = 0; i < dimension; i++) {
            mensajeCS( String.format("El compañero %d se llama %s.",i+1,vector[i]));
        }
    } 
}
