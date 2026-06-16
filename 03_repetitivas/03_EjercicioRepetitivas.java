// Ejercicio 3: Ingreso de palabras controlado por centinela
// Módulo: Estructuras Repetitivas (while, do-while)
// Visto en: Curso TodoCodeAcademy + práctica personal

package repetitivas;

import java.util.Scanner;

public class EjercicioRepetitivas3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String palabra;
        
        System.out.println("Ingresa palabras (escribe 'fin' para terminar):");
        
        // Primer ingreso
        palabra = sc.nextLine();
        
        // Bucle controlado por centinela
        while (!palabra.equals("fin")) {
            System.out.println("Ingresaste: " + palabra);
            palabra = sc.nextLine(); // pide otra palabra
        }
        
        System.out.println("Programa finalizado.");
        
        sc.close();
    }
}
