// Ejercicio 5: Cálculo de masa corporal (IMC)
// Módulo: Estructuras Selectivas (Condicionales)
// Práctica personal

package condicionales;

import java.util.Scanner;

public class EjercicioCondicionales5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Pedir datos al usuario
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = sc.nextDouble();
        
        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();
        
        // Calcular IMC
        double imc = peso / (altura * altura);
        
        System.out.println("Su IMC es: " + imc);
        
        // Clasificación según IMC
        if (imc < 18.5) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc < 25) {
            System.out.println("Clasificación: Peso normal");
        } else if (imc < 30) {
            System.out.println("Clasificación: Sobrepeso");
        } else {
            System.out.println("Clasificación: Obesidad");
        }
        
        sc.close();
    }
}
