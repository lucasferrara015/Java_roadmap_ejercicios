// Ejercicio 3: Matriz de movimientos
// Módulo: Arrays, Vectores y Matrices
// Contexto: Banco - movimientos de clientes
// Práctica personal

package arrays_vectores_matrices;

import java.util.Scanner;

public class EjercicioMatrices3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos clientes desea registrar? ");
        int clientes = sc.nextInt();
        
        System.out.print("¿Cuántas operaciones por cliente desea registrar? ");
        int operaciones = sc.nextInt();
        
        // Declarar matriz de movimientos
        double[][] movimientos = new double[clientes][operaciones];
        
        // Cargar datos en la matriz
        for (int i = 0; i < clientes; i++) {
            System.out.println("\nCliente N° " + (i+1));
            for (int j = 0; j < operaciones; j++) {
                System.out.print("Ingrese el monto de la operación " + (j+1) + ": ");
                movimientos[i][j] = sc.nextDouble();
            }
        }
        
        // Mostrar matriz completa
        System.out.println("\n--- Movimientos registrados ---");
        for (int i = 0; i < clientes; i++) {
            System.out.print("Cliente N° " + (i+1) + ": ");
            for (int j = 0; j < operaciones; j++) {
                System.out.print(movimientos[i][j] + "  ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
