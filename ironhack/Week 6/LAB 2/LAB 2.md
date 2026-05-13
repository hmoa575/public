# Funciones javascript

Las funciones son pequeños grupos de instrucciones que pueden invocarse cuando se necesiten. Permiten ahorrar código, y ordenarlo. Se suelen ejecutar mediante un evento, como puede ser un click de botón, aunque también pueden llamarse directamente. Utilizan la palabra clave function(), y entre los paréntesis pueden pasarse o no parámetros. Pueden retornar un dato fuera de la función o no (return).

EJERCICIO


1- Funcion saludar: pide por prompt un tipo de saludo y un nombre. Envialos la función saludar() para que combine ambos parámetros y los imprima desde dentro de la función. Ej: "hola" y "Andrés" diría dentro de la función "hola Andrés"

+EXTRA: como arrancarías la función desde un botón? Cómo mostrarías el resultado dentro de un div?

Usuario escribe: "Hola" y "Andrés"
        ↓
recogerDatos()  →  recoge los prompt()
        ↓
saludar("Hola", "Andrés")  →  recibe los parámetros
        ↓
console.log("Hola Andrés")  →  imprime en consola
        ↓
div#resultado  →  "Hola Andrés" en pantalla


| Parte                           | Descripción                                                             |
| ------------------------------- | ------------------------------------------------------------------------ |
| `saludar(saludo, nombre) `    | Función que **recibe 2 parámetros** y los combina               |
| `prompt()`                    | Pide datos al usuario mediante una ventana emergente                     |
| `recogerDatos()`              | Recoge los prompts y**llama a `saludar()`** pasándole los datos |
| `onclick="recogerDatos()"`    | **EXTRA:** arranca la función desde el botón                     |
| `getElementById("resultado")` | **EXTRA:** muestra el resultado en el div                          |

2- Pide dos números. Pide si quiere sumar o restar (+/-). Según el caso, llama a la función sumar() o restar() pasándole esos parámetros y muestra el resultado de sumar o restar ambos números. Prueba a realizar esto sin return.

+EXTRA: prueba a realizar lo mismo con return.

Usuario escribe: 10 y 3
        ↓
Click "Sumar"  →  elegirOperacion("+")
        ↓
Valida los números
        ↓
Llama a sumar(10, 3)
        ↓
Muestra en div: "10 + 3 = 13"


| Parte                              | Descripción                                         |
| ---------------------------------- | ---------------------------------------------------- |
| `elegirOperacion(op)`            | Recoge los números y decide qué función llamar    |
| `sumar(a, b)`                    | Suma y**muestra directamente** sin `return`  |
| `restar(a, b)`                   | Resta y**muestra directamente** sin `return` |
| `onclick="elegirOperacion('+')"` | El botón pasa el operador como parámetro           |
