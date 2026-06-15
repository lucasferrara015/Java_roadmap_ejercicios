// Ejercicio 2: Año bisiesto
// Módulo: Estructuras Selectivas (Condicionales)
// Visto en: Curso TodoCodeAcademy + práctica personal

package condicionales;

import java.util.Scanner;

public class EjercicioCondicionales2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();
        
        // Condiciones para determinar si es bisiesto
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        
        sc.close();
    }
}
