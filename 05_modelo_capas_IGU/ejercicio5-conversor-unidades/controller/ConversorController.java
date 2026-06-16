package ejercicio5.conversor.unidades.controller;

import ejercicio5.conversor.unidades.logic.Conversor;

public class ConversorController {
    private Conversor conversor;
    
    public ConversorController() {
        conversor = new Conversor();
    }
    
    public double convertir(String tipo, double valor) throws IllegalArgumentException {
        switch (tipo) {
            case "metros→pies":
                return conversor.metrosAPies(valor);
            case "pies→metros":
                return conversor.piesAMetros(valor);
            case "°C→°F":
                return conversor.celsiusAFahrenheit(valor);
            case "°F→°C":
                return conversor.fahrenheitACelsius(valor);
            default:
                throw new IllegalArgumentException("Conversión no soportada");
        }
    }
}
