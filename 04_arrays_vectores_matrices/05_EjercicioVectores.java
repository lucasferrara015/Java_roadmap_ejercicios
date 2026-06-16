// Ejercicio 5: Cliente con mayor y menor saldo
// Módulo: Arrays, Vectores y Matrices
// Contexto: Banco - búsqueda de máximos y mínimos
// Práctica personal

package arrays_vectores_matrices;

import java.util.Scanner;

public class EjercicioVectores5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos clientes desea ingresar? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar salto de línea
        
        // Declarar vectores paralelos
        String[] clientes = new String[cantidad];
        double[] saldos = new double[cantidad];
        
        // Cargar datos
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del cliente N° " + (i+1) + ": ");
            clientes[i] = sc.nextLine();
            
            System.out.print("Ingrese el saldo de " + clientes[i] + ": ");
            saldos[i] = sc.nextDouble();
            sc.nextLine(); // limpiar salto de línea
        }
        
        // Inicializar variables para mayor y menor
        double mayorSaldo = saldos[0];
        double menorSaldo = saldos[0];
        String clienteMayor = clientes[0];
        String clienteMenor = clientes[0];
        
        // Recorrer vector para comparar
        for (int i = 1; i < cantidad; i++) {
            if (saldos[i] > mayorSaldo) {
                mayorSaldo = saldos[i];
                clienteMayor = clientes[i];
            }
            if (saldos[i] < menorSaldo) {
                menorSaldo = saldos[i];
                clienteMenor = clientes[i];
            }
        }
        
        // Mostrar resultados
        System.out.println("\nCliente con mayor saldo: " + clienteMayor + " | $" + mayorSaldo);
        System.out.println("Cliente con menor saldo: " + clienteMenor + " | $" + menorSaldo);
        
        sc.close();
    }
}
