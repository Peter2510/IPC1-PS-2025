# Simula un sistema de registro de estudiantes. El programa permite registrar estudiantes, mostrar los estudiantes registrados y salir del sistema

## El programa muestra un menu con tres opciones
### 1.Registrar un estudiante
Se solicitan los datos del estudiante (nombre, edad y curso)
Se valida que la edad sea un numero valido y mayor a 0
Si el arreglo de estudiantes esta lleno, no se puede registrar mas estudiantes
Si los datos son validos, se crea un objeto Estudiante con la informacion ingresada y se agrega al arreglo

### 2.Mostrar los estudiantes registrados
Si hay estudiantes registrados, muestra los detalles de cada uno
Si no hay estudiantes registrados, se muestra un mensaje informando que la lista está vacia

### 3.Salir del sistema
El programa muestra un mensaje de despedida y termina la ejecucion

## Manejo de excepciones
Si el usuario ingresa un valor invalido para las opciones del menu o los datos del estudiante, el programa captura la excepcion y solicita que se ingrese un valor valido