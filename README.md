> # Tragamonedas en Java

Este es un juego de tragamonedas desarrollado en Java con interfaz gráfica utilizando Swing. El jugador presiona el botón "Girar" para hacer que los rodillos giren y obtener un resultado aleatorio. Si los tres símbolos son iguales, el jugador gana; de lo contrario, pierde.

Características:
* Interfaz gráfica sencilla y llamativa
* Uso del patrón MVC para separar la lógica y la vista (si lo implementaste)
* Uso de imágenes como símbolos de los rodillos
* Implementación de eventos con ActionListener
* Uso de Random para generar combinaciones aleatorias

Requisitos:
Java 8 o superior

IDE recomendado: Eclipse o NetBeans

**Instalación y ejecución**
Descarga de este repositorio:
https://github.com/GUADALUPALEIDA/tragamonedas-java.git

Compila el código:
javac SlotGame.java

Ejecuta la aplicación:
java SlotGame

Personalización:
* Puedes cambiar las imágenes de los símbolos modificando los archivos img1.jpg, img2.jpg, etc.

* Para cambiar los colores o fuentes del juego, edita las configuraciones en SlotGame.java.

**
Estructura del código
El código está organizado en una sola clase:**

Clase SlotGame: Extiende JFrame y representa la interfaz gráfica del juego.

Atributos:
* reels[]: Arreglo de etiquetas para mostrar los rodillos.
* resultLabel: Muestra si el jugador ganó o perdió.
* spinButton: Botón para girar los rodillos.
* symbols[]: Arreglo con las imágenes que se usan en los rodillos.
* random: Generador de números aleatorios.

Constructor SlotGame():
* Configura la ventana y su diseño.
* Agrega los rodillos en un JPanel.
* Agrega el botón y el mensaje de resultado en otro JPanel.

Método spin():
* Selecciona símbolos aleatorios y actualiza los rodillos con imágenes.
* Verifica si los tres símbolos son iguales para mostrar el mensaje de ganar o perder.

Método main():
* Inicia el juego creando una instancia de SlotGame y haciéndola visible.
