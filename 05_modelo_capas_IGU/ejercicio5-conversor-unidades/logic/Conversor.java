package ejercicio5.conversor.unidades.logic;

public class Conversor {
    
    // Conversiones de longitud
    public double metrosAPies(double metros) {
        return metros * 3.28084;
    }
    
    public double piesAMetros(double pies) {
        return pies / 3.28084;
    }
    
    // Conversiones de temperatura
    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
