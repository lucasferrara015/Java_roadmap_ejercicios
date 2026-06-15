// Ejercicio 5: Área de figuras
// Módulo: Tipos de datos y variables
// Práctica personal

package tipos_datos_variables;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        // Constantes
        final double PI = 3.1416;
        
        // Variables
        double radio = 5.0;
        double lado = 4.0;
        
        // Cálculos
        double areaCirculo = PI * radio * radio;
        double areaCuadrado = lado * lado;
        
        // Resultados
        System.out.println("------Áreas------");
        System.out.println("Radio del círculo: " + radio);
        System.out.println("Área del círculo: " + areaCirculo);
        
        System.out.println("Lado del cuadrado: " + lado);
        System.out.println("Área del cuadrado: " + areaCuadrado);
    }
}
