// Ejercicio 1: Vector de nombres de usuarios
// Módulo: Arrays, Vectores y Matrices
// Contexto: Banco - lista de clientes
// Práctica personal

package arrays_vectores_matrices;

import java.util.Scanner;

public class EjercicioVectores1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos clientes desea ingresar? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar salto de línea
        
        // Declarar vector de Strings
        String[] clientes = new String[cantidad];
        
        // Cargar nombres en el vector
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del cliente N° " + (i+1) + ": ");
            clientes[i] = sc.nextLine();
        }
        
        // Mostrar nombres uno por uno
        System.out.println("\nLista de clientes ingresados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Cliente N° " + (i+1) + ": " + clientes[i]);
        }
        
        sc.close();
    }
}
