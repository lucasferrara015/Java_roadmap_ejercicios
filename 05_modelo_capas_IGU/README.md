# Java Swing - Ejercicios de Modelo de Capas + IGU

## 📚 Descripción
5 ejercicios prácticos que demuestran la **separación de capas** (lógica de negocio / interfaz gráfica) en Java Swing.

## 🛠 Tecnologías
- Java 11+
- Swing (IGU)
- POO

## 📂 Ejercicios incluidos

| # | Ejercicio | Capa Lógica | Capa Gráfica |
|---|-----------|-------------|---------------|
| 1 | Calculadora IVA | `CalculadoraIVA` (consola) | Sin interfaz |
| 2 | Calculadora básica | `Calculadora` (+, -, *, /) | `CalculadoraUI` |
| 3 | Validador de edad | `ValidadorEdad` (excepciones) | `ValidadorEdadUI` |
| 4 | Gestor de tareas | `GestorTareas` (ArrayList) | `GestorTareasUI` (JList) |
| 5 | Conversor de unidades | `Conversor` + `ConversorController` | `ConversorUI` |

## ▶️ Cómo ejecutar
Cada archivo tiene un método `main()`. Compila y ejecuta por separado:
```bash
javac ejercicio2-calculadora-basica/ui/CalculadoraUI.java
java ejercicio2-calculadora-basica.ui.CalculadoraUI
