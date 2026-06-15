// Ejercicio 4: Menú de Homebanking
// Módulo: Estructuras Selectivas (Condicionales)
// Práctica personal

package condicionales;

import java.util.Scanner;

public class EjercicioCondicionales4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------ Menú Homebanking ------");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Depositar dinero");
        System.out.println("3 - Retirar dinero");
        System.out.println("4 - Salir");
        System.out.print("Seleccione una opción: ");
        
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Has elegido: Consultar saldo.");
                break;
            case 2:
                System.out.println("Has elegido: Depositar dinero.");
                break;
            case 3:
                System.out.println("Has elegido: Retirar dinero.");
                break;
            case 4:
                System.out.println("Has elegido: Salir. ¡Gracias por usar Homebanking!");
                break;
            default:
                System.out.println("Opción inválida. Debe ser entre 1 y 4.");
        }
        
        sc.close();
    }
}
