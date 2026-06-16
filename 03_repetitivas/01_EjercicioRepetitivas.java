// Ejercicio 1: Mostrar números hasta un límite
// Módulo: Estructuras Repetitivas (for, while, do-while)
// Visto en: Curso TodoCodeAcademy + práctica personal

package repetitivas;

import java.util.Scanner;

public class EjercicioRepetitivas1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número límite: ");
        int limite = sc.nextInt();
        
        System.out.println("---- Usando FOR ----");
        for (int i = 1; i <= limite; i++) {
            System.out.println(i);
        }
        
        System.out.println("---- Usando WHILE ----");
        int j = 1;
        while (j <= limite) {
            System.out.println(j);
            j++;
        }
        
        System.out.println("---- Usando DO-WHILE ----");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= limite);
        
        sc.close();
    }
}
