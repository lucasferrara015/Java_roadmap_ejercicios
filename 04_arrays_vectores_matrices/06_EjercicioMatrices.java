// Ejercicio 6: Matriz de préstamos
// Módulo: Arrays, Vectores y Matrices
// Contexto: Banco - préstamos otorgados a clientes en distintos meses
// Práctica personal

package arrays_vectores_matrices;

import java.util.Scanner;

public class EjercicioMatrices6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos clientes desea registrar? ");
        int clientes = sc.nextInt();
        
        System.out.print("¿Cuántos meses desea registrar? ");
        int meses = sc.nextInt();
        
        // Declarar matriz de préstamos
        double[][] prestamos = new double[clientes][meses];
        
        // Cargar datos en la matriz
        for (int i = 0; i < clientes; i++) {
            System.out.println("\nCliente N° " + (i+1));
            for (int j = 0; j < meses; j++) {
                System.out.print("Ingrese el monto del préstamo en mes " + (j+1) + ": ");
                prestamos[i][j] = sc.nextDouble();
            }
        }
        
        // Mostrar matriz completa
        System.out.println("\n--- Préstamos registrados ---");
        for (int i = 0; i < clientes; i++) {
            System.out.print("Cliente N° " + (i+1) + ": ");
            for (int j = 0; j < meses; j++) {
                System.out.print(prestamos[i][j] + "  ");
            }
            System.out.println();
        }
        
        // Análisis: total por cliente
        System.out.println("\n--- Total de préstamos por cliente ---");
        for (int i = 0; i < clientes; i++) {
            double totalCliente = 0;
            for (int j = 0; j < meses; j++) {
                totalCliente += prestamos[i][j];
            }
            System.out.println("Cliente N° " + (i+1) + ": $" + totalCliente);
        }
        
        sc.close();
    }
}
