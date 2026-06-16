# 🧮 Ejercicios Prácticos: Vectores y Matrices  
**Contexto:** Simulación de datos de usuarios de un banco usando estructuras de almacenamiento en Java.

---

## 📝 Ejercicios

- **01 – Vector de nombres de usuarios**  
  Cargar en un vector los nombres de los clientes del banco e imprimirlos uno por uno.  
  👉 Practica la **declaración, carga y recorrido de vectores**.

- **02 – Vector de saldos**  
  Asociar a cada cliente un saldo en cuenta y mostrarlo junto con su nombre.  
  👉 Ejercicio de **paralelismo entre dos vectores** (nombres y saldos).

- **03 – Matriz de movimientos**  
  Registrar en una matriz los movimientos de cada cliente (filas = clientes, columnas = operaciones).  
  👉 Permite practicar **carga y recorrido de matrices**.

- **04 – Promedio de saldos**  
  Calcular el promedio de los saldos de todos los clientes.  
  👉 Ejemplo de **recorrido de vector con acumulador**.

- **05 – Cliente con mayor y menor saldo**  
  Determinar qué cliente tiene el saldo más alto y cuál el más bajo.  
  👉 Ejercicio de **comparación dentro de un vector**.

- **06 – Matriz de préstamos**  
  Simular una matriz con los montos de préstamos otorgados a cada cliente en distintos meses.  
  👉 Practica **recorrido doble y análisis de datos en matrices**.

---

## 🎯 Objetivo del módulo
- Aprender a **declarar, cargar y recorrer vectores y matrices**.  
- Relacionar estructuras de datos con un caso práctico (usuarios de un banco).  
- Practicar operaciones comunes: acumulación, búsqueda de máximos/mínimos, paralelismo entre vectores y análisis de matrices.
# Guía de Java: Arrays (Vectores y Matrices)

Los **arrays** (arreglos) son estructuras de datos que permiten almacenar múltiples valores del mismo tipo en una única variable. Se caracterizan por ser **estáticos** (su tamaño no cambia una vez definidos) y sus elementos se ubican en memoria de forma secuencial y consecutiva.

---

## 1. VECTORES (Arrays Unidimensionales)

Un vector es una lista de elementos identificados por un **índice** que señala su posición, comenzando siempre desde el **índice 0** hasta el tamaño total menos uno.

### Declaración y Asignación
En Java, los vectores se representan mediante corchetes `[]`. Existen dos pasos principales: la declaración y la instanciación (creación).

*   **Declaración e Instanciación:**
    ```java
    // Declaración
    int[] nums; 
    // Instanciación (reserva de memoria para 10 enteros)
    nums = new int; 
    
    // Forma combinada
    double[] valores = new double;
    ```
*   **Asignación Directa (Inicialización):** Se pueden asignar valores en el momento de la creación usando llaves `{}`.
    ```java
    int[] nros = { 3, 7, 2, 10, 1 };
    ```
*   **Asignación por Índice:** Se accede a una posición específica para darle un valor.
    ```java
    nums = 25; // Asigna 25 a la primera posición
    ```

### Recorrido y Carga
Para procesar o llenar un vector de forma eficiente, se utilizan estructuras repetitivas, generalmente el bucle `for`.

*   **Carga de datos:** Se itera desde el índice 0 hasta el límite de la longitud del vector.
    ```java
    Scanner teclado = new Scanner(System.in);
    for (int i = 0; i < nros.length; i++) {
        System.out.print("Ingrese un valor: ");
        nros[i] = teclado.nextInt();
    }
    ```
*   **Recorrido para mostrar elementos:**
    *   **Bucle for tradicional:** Permite control total mediante índices.
    *   **Bucle for-each:** Una forma simplificada que recorre cada elemento automáticamente.
        ```java
        for (int n : nros) {
            System.out.println(n);
        }
        ```

---

## 2. MATRICES (Arrays Bidimensionales)

Las matrices son "arrays de arrays", organizadas en **filas y columnas**.

### Declaración y Asignación
Se utilizan dos pares de corchetes `[][]`: el primero para las filas y el segundo para las columnas.

*   **Declaración e Instanciación:**
    ```java
    // Matriz de 5 filas y 7 columnas
    double[][] matriz = new double;
    ```
*   **Inicialización Directa:**
    ```java
    int[][] mat = {
        { 4, 7, 10 },  // Fila 0
        { 9, 35, 8 },  // Fila 1
        { 0, 5, 6 }    // Fila 2
    };
    ```

### Recorrido y Carga
Para trabajar con matrices, es necesario utilizar **bucles anidados**: el primero recorre las filas y el segundo las columnas de cada fila.

*   **Carga de una matriz:**
    ```java
    int[][] mat = new int;
    for (int i = 0; i < mat.length; i++) { // Recorre filas
        for (int j = 0; j < mat[i].length; j++) { // Recorre columnas de la fila i
            System.out.print("Ingrese número: ");
            mat[i][j] = teclado.nextInt();
        }
    }
    ```
*   **Recorrido para mostrar:**
    Se accede a cada "celda" mediante la intersección de su fila (`i`) y su columna (`j`).
    ```java
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
            System.out.println(mat[i][j]);
        }
    }
    ```

> **Nota Importante:** La propiedad `.length` aplicada a la matriz (`mat.length`) devuelve el número de filas, mientras que aplicada a una fila específica (`mat[i].length`) devuelve el número de columnas de esa fila.


