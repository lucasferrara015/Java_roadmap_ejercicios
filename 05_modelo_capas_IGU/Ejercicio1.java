
---

## 🔹 EJERCICIO 1 – Calculadora IVA (solo lógica, sin interfaz)

**Ruta:** `ejercicio1-calculadora-iva/CalculadoraIVAApp.java`

```java
package ejercicio1.calculadora.iva;

// Capa lógica
class CalculadoraIVA {
    public double calcularIVA(double monto, double porcentaje) {
        return monto * (porcentaje / 100);
    }
    
    public double calcularTotalConIVA(double monto, double porcentaje) {
        return monto + calcularIVA(monto, porcentaje);
    }
}

// Aplicación principal (sin interfaz gráfica)
public class CalculadoraIVAApp {
    public static void main(String[] args) {
        CalculadoraIVA calc = new CalculadoraIVA();
        
        double monto = 100.0;
        double iva = 21.0;
        
        System.out.println("Monto base: $" + monto);
        System.out.println("IVA " + iva + "%: $" + calc.calcularIVA(monto, iva));
        System.out.println("Total: $" + calc.calcularTotalConIVA(monto, iva));
    }
}
