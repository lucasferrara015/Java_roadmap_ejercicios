# 🔄 03 - Estructuras Repetitivas (Bucles)

Las **estructuras repetitivas**, también conocidas como ciclos o bucles, permiten ejecutar un mismo bloque de código múltiples veces sobre un conjunto de datos, proceso que se denomina **iteración**,. Estas estructuras utilizan una condición lógica para determinar cuándo detener su ejecución.

---

### 1. Bucle WHILE
La estructura `while` es una de las estructuras básicas de repetición. Su funcionamiento se basa en evaluar una condición **antes** de ejecutar el bloque de instrucciones,.

*   **Funcionamiento:** El bloque de sentencias se ejecutará **0 o más veces**, ya que si la condición es falsa desde el principio, el bucle nunca se inicia,. Se recomienda su uso cuando se necesita calcular la condición de forma dinámica o cuando no se conoce de antemano el número exacto de iteraciones.
*   **Sintaxis:**
    ```java
    while (condición) {
        // bloque de sentencias,
    }
    ```
*   **Punto clave:** Es fundamental incluir dentro del bloque alguna instrucción que modifique las variables de la condición para asegurar que el bucle termine en algún momento,.

---

### 2. Bucles Infinitos
Un **bucle infinito** ocurre cuando la condición de la estructura repetitiva **nunca deja de ser verdadera**. 

*   **Causa:** Generalmente se debe a que no se actualiza la variable de control dentro del ciclo o a que la lógica de la condición está mal planteada,.
*   **Detección:** Este error no suele ser detectado por el compilador, sino que se presenta en **tiempo de ejecución**, provocando que el programa no termine nunca su ejecución normal,.

---

### 3. Bucle FOR
La estructura `for` está diseñada para ejecutar un bloque de instrucciones un **número determinado de veces**. Es la opción preferida cuando se conoce de antemano la cantidad de iteraciones necesarias, como al trabajar con vectores,.

*   **Sintaxis:**
    ```java
    for (inicialización; condición; incremento) {
        // bloque de sentencias,,
    }
    ```
*   **Componentes:**
    1.  **Inicialización:** Se ejecuta una sola vez al inicio; suele declarar y asignar el valor inicial a la variable de control,.
    2.  **Condición:** Se evalúa antes de cada iteración. El bucle continúa mientras sea `true`,.
    3.  **Incremento:** Se ejecuta al final de cada iteración para modificar la variable de control (aumentar o disminuir),.
*   **Buenas prácticas:** Se considera una mala práctica modificar el valor de la variable de control directamente dentro del bloque de sentencias, ya que esto genera confusión en el flujo del ciclo.

---

### 4. Resumen Comparativo

| Estructura | Evaluación de Condición | Número de Ejecuciones | Uso Recomendado |
| :--- | :--- | :--- | :--- |
| **WHILE** | Al inicio | 0 a n veces | Cuando el número de iteraciones es desconocido. |
| **FOR** | Al inicio | 0 a n veces | Cuando el número de iteraciones es conocido de antemano. |
| **DO...WHILE** | Al final | Al menos 1 vez | Cuando el bloque debe ejecutarse al menos una vez antes de evaluar. |


## 📝 Ejercicios

- **01_EjercicioRepetitivas.java – Mostrar números hasta Límite**  
  Pide un número límite y muestra los números desde 1 hasta ese valor usando `for`, `while` y `do-while`.

- **02_EjercicioRepetitivas.java – Contar de 2 en 2**  
  Imprime números desde 0 hasta el límite ingresado, avanzando de dos en dos. Practica incrementos personalizados en bucles.

- **03_EjercicioRepetitivas.java – Ingreso de palabras controlado por Centinela**  
  Solicita palabras al usuario hasta que escriba la palabra **"fin"**. Ejemplo típico de bucle controlado por centinela.

- **04_EjercicioRepetitivas.java – Números primos (for con break)**  
  Pide un número y determina si es primo (solo divisible por 1 y sí mismo). Usa `for` y `break` para cortar el bucle al encontrar un divisor, optimizando la ejecución.

- **05_EjercicioRepetitivas.java – Patrón de asteriscos (for anidado)**  
  Genera un triángulo de asteriscos según la altura ingresada. Usa bucles `for` anidados para construir el patrón fila por fila.
