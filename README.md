# Baraja
# Proyecto: Baraja

Este proyecto consiste en la implementación de un programa en Java para representar un mazo de cartas de póker y realizar operaciones como mezclar el mazo, mostrar cartas, seleccionar cartas al azar y repartir manos de cartas.

## Autor
Oscar Adrian Estrella Garcia

## Clases
- **Card:** Representa una carta de póker con atributos para palo, color y valor.
- **Deck:** Representa un mazo de cartas de póker con métodos para inicializar, mezclar y manipular las cartas.

## Funcionalidades
1. **Mezclar el Mazo:** Método `shuffle()` para mezclar el mazo de cartas.
2. **Mostrar Primera Carta:** Método `head()` para mostrar y remover la primera carta del mazo.
3. **Seleccionar Carta al Azar:** Método `pick()` para seleccionar y remover una carta al azar del mazo.
4. **Repartir Mano de Cartas:** Método `hand()` para repartir una mano de cinco cartas del mazo.

### Actividad 9: Integración de Menú 

En esta actividad, se agregó un menú interactivo al programa Poker que permite al usuario seleccionar diversas acciones para interactuar con el mazo de cartas. Esto incluye mezclar el mazo, mostrar la primera carta, seleccionar una carta al azar y generar una mano de cinco cartas.

#### Descripción de la Implementación:

1. **Estructura de Clases:**
   - **Deck**: La clase principal que representa el mazo de cartas. Contiene métodos para inicializar el mazo, mezclar las cartas, mostrar la primera carta, seleccionar una carta al azar y generar una mano de cinco cartas.
   - **Card**: La clase que representa una carta de poker, con atributos como palo, color y valor.

2. **Menú Interactivo:**
   - Se implementó un método `showMenu()` en la clase `Deck` para mostrar un menú interactivo al usuario.
   - El menú presenta opciones numéricas que el usuario puede seleccionar para realizar diferentes acciones.
   - Después de que el usuario selecciona una opción, se ejecuta la operación correspondiente.

2.1 **Codigo agregado**

   ![Error](https://github.com/ELProtoV/Baraja/blob/main/c.png)




3. **Manejo de Entrada de Usuario:**
   - Se utiliza la clase `Scanner` para obtener la entrada del usuario desde el teclado.
   - Si el usuario ingresa una opción válida, se ejecuta la operación correspondiente.
   - Si el usuario ingresa una opción inválida, se muestra un mensaje de error y se vuelve a solicitar una opción válida.

#### Ejemplo de Uso:

1. **Ejecución del Programa:**
   - El programa se ejecuta desde la línea de comandos usando `java Deck`.
   - Se muestra un menú interactivo con opciones numeradas.
   - El usuario selecciona una opción ingresando el número correspondiente desde el teclado.

2. **Interacción con el Menú:**
   - El usuario puede seleccionar las opciones según sus necesidades.
   - Si se selecciona una opción válida, el programa realizará la operación correspondiente.
   - Si se selecciona una opción inválida, se muestra un mensaje de error y se vuelve a solicitar una opción válida.
     
3. **Funcionamiento de codigo con un herror**


   ![Error](https://github.com/ELProtoV/Baraja/blob/main/a.png)

4. **Funcionamiento codigo funcional**

   ![Funcional](https://github.com/ELProtoV/Baraja/blob/main/b.png)

# Reporte de Modificaciones en el Programa Poker

En esta iteración del proyecto, se han realizado varias modificaciones importantes para mejorar la robustez y la usabilidad del programa Poker. A continuación, se detallan las principales modificaciones:

### 1. Lanzamiento de Excepciones:
- Se han agregado excepciones a los métodos `shuffle()`, `head()`, `pick()` y `hand()` en la clase `Deck`.
- Estas excepciones se lanzan para indicar posibles condiciones excepcionales, como la selección de una opción no válida o si el mazo de cartas se queda sin cartas.

### 2. Manejo de Excepciones:
- Se han agregado bloques `try-catch` en el método `main()` para manejar las excepciones lanzadas en caso de seleccionar una opción no válida o si el mazo de cartas se queda sin cartas.
- Esto garantiza que el programa pueda continuar ejecutándose y proporciona feedback al usuario en caso de errores.

### 3. Excepción por Agotamiento de Cartas:
- Se ha creado una excepción específica, `OutOfCardsException`, para el caso en que el mazo se quede sin cartas.
- Esta excepción se lanza y maneja adecuadamente en los métodos correspondientes para informar al usuario sobre la situación.

### Ejecución del Programa:
- **Compilación y Ejecución:**
   - El programa se compila utilizando el comando `javac Deck.java`.
   - Se ejecuta desde la línea de comandos utilizando `java Deck`.
- **Interacción con el Menú:**
   - El usuario puede seleccionar las opciones del menú según sus necesidades.
   - Las excepciones se manejan adecuadamente para proporcionar feedback al usuario en caso de errores.

### Capturas de Pantalla:
- **Menú Interactivo:**
- 
![interactivo](https://github.com/ELProtoV/Baraja/blob/main/d.png)

- **Opción no Válida:**
  
![No valida](https://github.com/ELProtoV/Baraja/blob/main/e.png)


- **Excepción por Agotamiento de Cartas:**
![Agotammiento](https://github.com/ELProtoV/Baraja/blob/main/f.png)
