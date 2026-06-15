// Ejercicio de Condicionales: Cálculo de sueldos en una despensa
// Módulo: Estructuras Selectivas (Condicionales)
// Visto en: Curso TodoCodeAcademy + práctica personal

package condicionales;

import java.util.Scanner;

public class EjercicioCondicionales {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la categoría del empleado:");
        System.out.println("1 - Repositor");
        System.out.println("2 - Cajero");
        System.out.println("3 - Supervisor");
        
        int categoria = sc.nextInt();
        double sueldo = 0;
        
        if (categoria == 1) {
            // Repositor: $15.890 + 10% bono
            sueldo = 15890 + (15890 * 0.10);
            System.out.println("El sueldo del repositor es: $" + sueldo);
            
        } else if (categoria == 2) {
            // Cajero: $25.630,89 fijo
            sueldo = 25630.89;
            System.out.println("El sueldo del cajero es: $" + sueldo);
            
        } else if (categoria == 3) {
            // Supervisor: $35.560,20 - 11% jubilación
            sueldo = 35560.20 - (35560.20 * 0.11);
            System.out.println("El sueldo del supervisor es: $" + sueldo);
            
        } else {
            System.out.println("Categoría inválida. Debe ser 1, 2 o 3.");
        }
        
        sc.close();
    }
}
