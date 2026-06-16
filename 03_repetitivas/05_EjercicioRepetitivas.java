// Ejercicio 5: Patrón de asteriscos
// Módulo: Estructuras Repetitivas (for anidado)
// Visto en: Curso TodoCodeAcademy + práctica personal

package repetitivas;

import java.util.Scanner;

public class EjercicioRepetitivas5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la altura del patrón: ");
        int altura = sc.nextInt();
        
        // Bucle externo → controla las filas
        for (int fila = 1; fila <= altura; fila++) {
            
            // Bucle interno → imprime los asteriscos de cada fila
            for (int col = 1; col <= fila; col++) {
                System.out.print("*");
            }
            
            // Salto de línea al terminar cada fila
            System.out.println();
        }
        
        sc.close();
    }
}
