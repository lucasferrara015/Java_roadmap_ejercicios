// Ejercicio 3: Operadores aritméticos con entrada de usuario
// Módulo: Tipos de datos y variables
// Visto en: Curso TodoCodeAcademy + práctica personal

package tipos_datos_variables;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Pedir dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = sc.nextInt();
        
        // Operaciones aritméticas
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int divisionEntera = num1 / num2;   // división entera
        int modulo = num1 % num2;           // resto de la división
        
        // Mostrar resultados
        System.out.println("------Resultados------");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División entera: " + divisionEntera);
        System.out.println("Módulo (resto): " + modulo);
        
        sc.close();
    }
}
