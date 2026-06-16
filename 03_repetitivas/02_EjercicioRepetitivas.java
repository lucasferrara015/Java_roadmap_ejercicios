// Ejercicio 2: Contar de 2 en 2 hasta un límite
// Módulo: Estructuras Repetitivas (for, while, do-while)
// Visto en: Curso TodoCodeAcademy + práctica personal

package repetitivas;

import java.util.Scanner;

public class EjercicioRepetitivas2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número límite: ");
        int limite = sc.nextInt();
        
        System.out.println("---- Usando FOR ----");
        for (int i = 0; i <= limite; i += 2) {
            System.out.println(i);
        }
        
        System.out.println("---- Usando WHILE ----");
        int j = 0;
        while (j <= limite) {
            System.out.println(j);
            j += 2;
        }
        
        System.out.println("---- Usando DO-WHILE ----");
        int k = 0;
        do {
            System.out.println(k);
            k += 2;
        } while (k <= limite);
        
        sc.close();
    }
}
