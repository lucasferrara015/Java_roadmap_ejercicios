# Modelo de Capas e Interfaz Gráfica de Usuario (IGU) en Java

Este documento detalla los conceptos fundamentales del desarrollo de aplicaciones en Java utilizando una arquitectura organizada y entornos visuales.

---

## 1. Modelo de Capas: IGU, Lógica y Persistencia

La organización en capas permite dar una estructura clara a los proyectos informáticos, facilitando su diseño, mantenimiento y escalabilidad. Generalmente, se aplica la **metodología de las tres capas**, que distribuye las responsabilidades de la siguiente manera:

*   **Capa de Presentación (IGU):** Es la interfaz de usuario. Su función es mostrar la información al usuario y capturar sus entradas.
*   **Capa de Negocio (Lógica):** Contiene la lógica del programa y las reglas que rigen el procesamiento de los datos.
*   **Capa de Datos (Persistencia):** Es la encargada de interactuar con los medios de almacenamiento, como bases de datos relacionales a través de sentencias SQL o conexiones ODBC.

En el entorno de desarrollo como NetBeans, esta separación se refleja físicamente mediante la creación de **paquetes** específicos (ej. `presentacion`, `negocio`, `datos`) que agrupan las clases según su función.

---

## 2. Interfaz Gráfica de Usuario (IGU)

La IGU es el entorno que permite la interacción entre el usuario y la aplicación mediante elementos visuales, abandonando el esquema rígido de la consola de texto.

### Bibliotecas Principales
Java utiliza principalmente dos bibliotecas para construir interfaces:
*   **AWT (Abstract Window Toolkit):** Proporciona las primitivas gráficas y componentes básicos originales.
*   **Swing (`javax.swing`):** Extiende AWT para crear componentes más avanzados y ligeros, mejorando significativamente el aspecto visual.

### Componentes de Interacción
Los componentes son los elementos visuales que el usuario puede ver y manipular:
*   **JLabel:** Etiquetas de texto no editables.
*   **JButton:** Botones que ejecutan acciones al ser pulsados.
*   **JTextField / JTextArea:** Campos para introducir texto en una o múltiples líneas.
*   **JComboBox / JList:** Listas desplegables o fijas de opciones.
*   **JCheckBox / JRadioButton:** Selectores de estado (marcado/desmarcado).

### Contenedores y Gestores de Ubicación
Los componentes no se ubican de forma aislada, sino dentro de **contenedores** que gestionan su distribución:
*   **JFrame:** Representa la ventana principal con título y bordes.
*   **JPanel:** Un contenedor genérico usado para agrupar componentes o como lienzo para dibujos.

Para organizar la posición de los elementos, se utilizan los **Gestores de Ubicación (Layout Managers)**, que aplican políticas automáticas en lugar de coordenadas fijas:
*   **FlowLayout:** Ubica componentes de izquierda a derecha en una línea.
*   **BorderLayout:** Divide el espacio en cinco zonas: Norte, Sur, Este, Oeste y Centro.
*   **GridLayout:** Distribuye los elementos en una rejilla de filas y columnas iguales.

---

## 3. Programación Dirigida por Eventos

Las aplicaciones con IGU no siguen un flujo lineal, sino que se basan en la **arquitectura Fuente-Oyente**.

*   **Evento:** Cualquier acción externa, como un clic del ratón o pulsar una tecla.
*   **Fuente (Source):** El componente de interfaz que genera el evento (ej. un botón).
*   **Oyente (Listener):** El objeto que "escucha" y reacciona al evento ejecutando un código específico.

Para que este sistema funcione, el oyente debe **registrarse** previamente en la fuente mediante métodos como `addActionListener()`. Cuando el usuario interactúa con la fuente, esta notifica a todos los oyentes registrados invocando el método correspondiente de su interfaz.
