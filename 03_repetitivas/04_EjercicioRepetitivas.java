// Ejercicio 4: Determinar si un número es primo
// Módulo: Estructuras Repetitivas (for con break)
// Práctica personal

package repetitivas;

import java.util.Scanner;

public class EjercicioRepetitivas4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        
        boolean esPrimo = true; // asumimos que es primo
        
        if (numero <= 1) {
            esPrimo = false; // 0 y 1 no son primos
        } else {
            // buscamos divisores desde 2 hasta la raíz cuadrada del número
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break; // optimización: cortamos el bucle al encontrar divisor
                }
            }
        }
        
        // Resultado
        if (esPrimo) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
        
        sc.close();
    }
}
