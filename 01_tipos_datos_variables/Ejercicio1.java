// Ejercicio de LÓGICA: Intercambio de Valores | JAVA: tipos de datos y variables
// Visto en: CURSO TodoCodeAcademy

package ejercicioslogicos;

public class EjerciciosLogicos {

    public static void main(String[] args) {

        int num1 = 35;
        int num2 = 20;
        int aux;

        System.out.println("------Antes------");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);

        // Intercambio de valores
        aux = num2;
        num2 = num1;
        num1 = aux;

        System.out.println("-------Después--------");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
