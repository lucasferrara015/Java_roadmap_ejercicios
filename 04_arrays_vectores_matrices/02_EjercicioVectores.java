// Ejercicio 2: Vector de saldos asociado a clientes
// Módulo: Arrays, Vectores y Matrices
// Contexto: Banco - lista de clientes y sus saldos
// Práctica personal

package arrays_vectores_matrices;

import java.util.Scanner;

public class EjercicioVectores2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos clientes desea ingresar? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar salto de línea
        
        // Declarar vectores paralelos
        String[] clientes = new String[cantidad];
        double[] saldos = new double[cantidad];
        
        // Cargar datos en los vectores
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del cliente N° " + (i+1) + ": ");
            clientes[i] = sc.nextLine();
            
            System.out.print("Ingrese el saldo de " + clientes[i] + ": ");
            saldos[i] = sc.nextDouble();
            sc.nextLine(); // limpiar salto de línea
        }
        
        // Mostrar nombres y saldos
        System.out.println("\nLista de clientes y sus saldos:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Cliente: " + clientes[i] + " | Saldo: $" + saldos[i]);
        }
        
        sc.close();
    }
}
