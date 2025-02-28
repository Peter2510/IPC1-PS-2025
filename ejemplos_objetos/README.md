# Programación Orientada en Objetos

La Programación Orientada a Objetos (POO) es un enfoque de programación que se basa en la creación y manipulación de “objetos”. Estos objetos son entidades que combinan datos y comportamientos en un solo paquete.

En la POO, los objetos tienen atributos que representan sus características o propiedades, y métodos que definen las acciones que pueden realizar. 

# Clases en Java
En Java, las clases son una parte fundamental de la POO y son la base para la creación de objetos, que son instancias de esas clases. Una clase en Java es un plano o un modelo que define la estructura y el comportamiento de los objetos que se pueden crear a partir de ella.


Una clase en Java sería como el plano para crear un carro en un juego. La clase define qué características tiene el carro (como su modelo, velocidad máxima, potencia del motor, etc.) y qué puede hacer (como acelerar, frenar, girar, etc.).

# Conceptos fundamentales de las clases

### Atributos
Las clases pueden tener atributos, también conocidos como variables de instancia, que representan las características o propiedades del objeto. En el ejemplo del coche los atributos serian el modelo, la velocidad máxima, etc.

### Métodos
Las clases contienen métodos que representan el comportamiento del objeto. Los métodos son funciones que pueden realizar acciones y manipular los atributos de la clase. En nuestro caso sería acelerar frenar, girar, etc.

### Constructores
Las clases pueden tener constructores, que son métodos especiales utilizados para inicializar objetos cuando se crean. Los constructores tienen el mismo nombre que la clase y pueden tener diferentes parámetros para configurar el estado inicial del objeto.

### Encapsulación
La encapsulación es un principio de la POO que se refiere a la ocultación de los detalles de implementación de una clase y la exposición controlada de sus atributos y métodos. En Java, puedes utilizar modificadores de acceso como private, protected, public, etc., para controlar el acceso a los miembros de una clase.

### Herencia
Las clases pueden heredar atributos y métodos de otras clases. La herencia permite la creación de jerarquías de clases, donde una clase (subclase o clase derivada) puede extender o heredar características de otra clase (superclase o clase base).

### Instanciación
Para utilizar una clase, primero debes crear una instancia u objeto de esa clase. Puedes hacerlo utilizando el operador new, seguido del nombre de la clase y los argumentos necesarios para el constructor si lo tiene.

# Excepciones
Las excepciones en Java son eventos anómalos que pueden ocurrir durante la ejecución de un programa y que alteran el flujo normal de ejecución. Estos eventos representan situaciones inesperadas o errores que deben ser manejados de manera adecuada para garantizar que el programa continúe ejecutándose de y evitar así interrupciones.

## Importancia de las excepciones
Las excepciones son elementos fundamentales en la construcción de programas robustos y fiables en cualquier lenguaje de programación, su importancia radica en varios aspectos:

### Manejo de errores de manera estructurada 
Las excepciones brindan una forma estructurada de manejar errores y situaciones excepcionales. Esto permite separar el código de manejo de errores del código funcional, lo que resulta en un código más limpio y fácil de entender.

### Mejora de la robustez y confiabilidad 
Al anticipar y manejar situaciones excepcionales de forma adecuada, podemos hacer que nuestras aplicaciones sean más resistentes y confiables. Esto es esencial para garantizar que el programa funcione de manera predecible y sin interrupciones.

### Retroalimentación al usuario
Mediante el uso de excepciones, podemos proporcionar mensajes de error significativos y detallados al usuario, lo que facilita la comprensión de lo que salió mal y cómo corregirlo. Esto mejora la experiencia del usuario y facilita la resolución de problemas.

### Flexibilidad y adaptabilidad
El manejo adecuado de excepciones permite a los desarrolladores adaptar el comportamiento de la aplicación según las circunstancias. Esto significa que podemos cambiar la forma en que se manejan las excepciones en diferentes partes del programa para adaptarse a los requisitos específicos de cada sección.

