# ✨ 02 - Estructuras Selectivas (Condicionales)

Este módulo reúne los conceptos de **condicionales en Java** vistos en el curso TodoCode Academy y mis prácticas personales.  
Incluye teoría, ejemplos y ejercicios prácticos.
---
Las **estructuras selectivas o condicionales** son herramientas fundamentales en la programación que permiten alterar el flujo secuencial de un programa. Su función principal es **seleccionar qué instrucciones se ejecutarán** basándose en la evaluación de una condición lógica (verdadera o falsa).

---

### 1. Condicional Simple: IF
La sentencia `if` es la estructura de selección más básica. Evalúa una **expresión lógica** (condición) encerrada entre paréntesis.

*   **Funcionamiento:** Si la condición es **verdadera**, se ejecuta el bloque de código dentro de las llaves `{ }`. Si es falsa, el programa salta dicho bloque y continúa con la siguiente instrucción.
*   **Sintaxis:**
    ```java
    if (condición) {
        // instrucciones que se ejecutan si es true
    }
    ```
*   **Nota:** Si solo existe una instrucción dentro del bloque, el uso de las llaves es opcional, aunque se recomienda su uso para mayor claridad y legibilidad.

---

### 2. Condicional Doble: IF + ELSE (Ejecución Alternativa)
Esta estructura se utiliza cuando es necesario definir un bloque de instrucciones para el caso en que la condición se cumpla y **otro bloque diferente para cuando no se cumpla**.

*   **Funcionamiento:** La condición determina cuál de los dos bloques se ejecutará; **nunca se ejecutarán ambos** en una misma evaluación.
*   **Sintaxis:**
    ```java
    if (condición) {
        // Bloque si la condición es verdadera
    } else {
        // Bloque si la condición es falsa
    }
    ```
*   **Ejemplo:** Se puede usar para determinar si un número es par o impar evaluando el residuo de la división (`nro % 2 == 0`).

---

### 3. Condicionales Múltiples: IF | ELSE IF | ELSE
Cuando existen más de dos posibilidades o se deben verificar múltiples condiciones relacionadas, se utiliza el **encadenamiento de declaraciones** `if-else-if`.

*   **Funcionamiento:** Las condiciones se evalúan en el orden en que aparecen. En el momento en que una es verdadera, se ejecuta su bloque y se termina la ejecución de toda la estructura. Si ninguna se cumple, se puede incluir un bloque `else` final opcional para manejar el caso por defecto.
*   **Sintaxis:**
    ```java
    if (condición1) {
        // Código para condición 1
    } else if (condición2) {
        // Código para condición 2
    } else {
        // Código si ninguna de las anteriores se cumple
    }
    ```

---

### 4. Condicional Switch
La sentencia `switch` es una alternativa más compacta y legible cuando se debe seleccionar un bloque de instrucciones basado en el **valor específico de una variable**.

*   **Características principales:**
    *   Evalúa una expresión que devuelve un valor (generalmente enteros, caracteres o tipos enumerables).
    *   **`case`:** Indica los posibles valores que puede tomar la variable.
    *   **`break`:** Es vital para señalar el fin de un caso. Sin él, el programa continuará ejecutando los siguientes casos de forma consecutiva.
    *   **`default`:** Es un caso opcional que se ejecuta si el valor de la variable no coincide con ninguno de los definidos.
*   **Modernización (Java 14+):** Java ha evolucionado para permitir el **switch como expresión**, simplificando su sintaxis mediante el uso de flechas (`->`) y eliminando la necesidad de constantes `break`.

---

### 5. Operador Ternario
También conocido como el **"if de una sola línea"**, se utiliza principalmente para **asignar un valor a una variable** dependiendo de una condición.

*   **Sintaxis:** `variable = (condición) ? valorSiTrue : valorSiFalse;`.
*   **Componentes:**
    1.  **Condición:** Una expresión booleana.
    2.  **`?`:** Separa la condición de los valores de retorno.
    3.  **Valor 1:** El resultado devuelto si la condición es verdadera.
    4.  **`:`:** Separa ambos valores posibles.
    5.  **Valor 2:** El resultado devuelto si la condición es falsa.
*   **Ventaja:** Es muy útil para hacer el código más conciso en asignaciones directas.
---

📝 Ejercicios en este módulo
01_EjercicioCondicionales.java → Cálculo de sueldos en una despensa (if – else if – else).

02_EjercicioCondicionales.java → Año bisiesto (if – else).

03_EjercicioCondicionales.java → Días del mes (switch).

04_EjercicioCondicionales.java → Menú de homebanking (switch).

05_EjercicioCondicionales.java → Cálculo de masa corporal e interpretación (if – else if – else).

---

### 🎯 Objetivo del módulo

Comprender y aplicar condicionales simples y múltiples.

Practicar el uso de if, else if, else, switch y operador ternario.

Resolver problemas prácticos que requieren decisiones en el flujo del programa.
