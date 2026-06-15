// Ejercicio 3: Días del mes con switch
// Módulo: Estructuras Selectivas (Condicionales)
// Práctica personal

package condicionales;

import java.util.Scanner;

public class EjercicioCondicionales3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el número de mes (1..12): ");
        int mes = sc.nextInt();
        
        int dias;
        
        switch (mes) {
            case 1:  // Enero
            case 3:  // Marzo
            case 5:  // Mayo
            case 7:  // Julio
            case 8:  // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                dias = 31;
                break;
            case 4:  // Abril
            case 6:  // Junio
            case 9:  // Septiembre
            case 11: // Noviembre
                dias = 30;
                break;
            case 2:  // Febrero (sin años bisiestos)
                dias = 28;
                break;
            default:
                dias = -1; // valor inválido
        }
        
        if (dias == -1) {
            System.out.println("Número de mes inválido. Debe ser entre 1 y 12.");
        } else {
            System.out.println("El mes " + mes + " tiene " + dias + " días.");
        }
        
        sc.close();
    }
}
