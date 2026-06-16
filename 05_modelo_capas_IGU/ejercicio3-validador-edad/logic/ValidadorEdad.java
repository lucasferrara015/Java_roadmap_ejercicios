package ejercicio3.validador.edad.logic;

public class ValidadorEdad {
    
    public void validar(int edad) throws IllegalArgumentException {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        if (edad > 150) {
            throw new IllegalArgumentException("La edad no puede superar los 150 años");
        }
    }
    
    public String obtenerCategoria(int edad) {
        if (edad < 12) return "Niño";
        if (edad < 18) return "Adolescente";
        if (edad < 65) return "Adulto";
        return "Adulto mayor";
    }
}
