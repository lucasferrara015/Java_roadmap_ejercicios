// Ejercicio 4: Promedio de saldos
// Módulo: Arrays, Vectores y Matrices
// Contexto: Banco - cálculo de promedio de saldos
// Práctica personal

package arrays_vectores_matrices;

import java.util.Scanner;

public class EjercicioVectores4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos clientes desea ingresar? ");
        int cantidad = sc.nextInt();
        
        double[] saldos = new double[cantidad];
        double acumulador = 0;
        
        // Cargar saldos en el vector
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el saldo del cliente N° " + (i+1) + ": ");
            saldos[i] = sc.nextDouble();
            acumulador += saldos[i]; // acumular saldos
        }
        
        // Calcular promedio
        double promedio = acumulador / cantidad;
        
        // Mostrar resultado
        System.out.println("\nEl promedio de saldos es: $" + promedio);
        
        sc.close();
    }
}
