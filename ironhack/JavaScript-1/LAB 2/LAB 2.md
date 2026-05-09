# Condicionales JS-1

### Resumen de la Lección ✏️

Mediante condicionales permitimos que el programa siga un flujo u otro. Por así decir, que tome una decisión en base a una o más condiciones.

Los condicionales más frecuentes son la estructura IF...ELSE IF... ELSE.

Para comparar condiciones, usamos los signos de comparación como ==, >, o por ejemplo <=

operadores de comparación:

> mayor que < menor que == igual que = mayor o igual que <= menor o igual que

En el caso que se desee convertir la respuesta a todo minúsculas o todo minúsculas, se pueden usar los métodos toLowerCase( ) o toUpperCase( ). Ejemplo:

let preguntaCliente = prompt("tienes el starter pack? (s/n)").toLowerCase();

## Tabla Resumen

| Condicional             | Uso principal                                  |
| ----------------------- | ---------------------------------------------- |
| `if / else if / else` | Lógica general con múltiples condiciones     |
| `switch`              | Comparar una variable con valores exactos      |
| `? :` (ternario)      | Asignación o retorno simple en una línea     |
| `??` (nullish)        | Valor por defecto si es `null`/`undefined` |
| `\|\|` (OR lógico)     | Valor por defecto si es falsy                  |

| Operador | Nombre               | Ejemplo       | Resultado |
| -------- | -------------------- | ------------- | --------- |
| `==`   | Igualdad (valor)     | `5 == "5"`  | `true`  |
| `===`  | Igualdad estricta    | `5 === "5"` | `false` |
| `!=`   | Desigualdad (valor)  | `5 != "5"`  | `false` |
| `!==`  | Desigualdad estricta | `5 !== "5"` | `true`  |
| `>`    | Mayor que            | `10 > 5`    | `true`  |
| `<`    | Menor que            | `3 < 8`     | `true`  |
| `>=`   | Mayor o igual        | `5 >= 5`    | `true`  |
| `<=`   | Menor o igual        | `4 <= 3`    | `false` |

| Operador | Nombre | Descripción           | Ejemplo           | Resultado |
| -------- | ------ | ---------------------- | ----------------- | --------- |
| `&&`   | AND    | true si AMBAS son true | `true && false` | `false` |
| `\|\|`   | OR     | true si UNA es true    | `false \|\| true` | `true`  |
| `!`    | NOT    | Invierte el booleano   | `!true`         | `false` |

## Orden de precedencia

1️⃣  !   (NOT)   → primero
2️⃣  &&  (AND)   → segundo
3️⃣  ||  (OR)    → último

# `prompt` en HTML con JavaScript

El `prompt` es una ventana emergente que **pide un dato al usuario** y lo devuelve como `string`.

⚠️ `prompt`  **siempre devuelve un `string`** , aunque el usuario escriba un número.

let respuesta = prompt("¿Cuál es tu nombre?");
console.log(respuesta); // Lo que el usuario escribió

 `console.log()` **solo muestra el valor en la consola del navegador** (F12), no en la página web visible.

Para mostrar el resultado en la página necesitas usar métodos del  **DOM** .

## Soluciones

### ✅ Opción 1 — `document.write()` (más simple)

  let respuesta = prompt("¿Cuál es tu nombre?");
  document.write("Hola, " + respuesta + " 👋");

### ✅ Opción 2 — `innerHTML` (recomendada)

Muestra la respuesta dentro de un elemento HTML específico:


<body>
    <header>
        <h1>Ejercicio 1 del LAB 2 - JavaScript 1 -</h1>

    `<!-- 👇 Aquí aparecerá la respuesta -->`
        `<p id="resultado"></p>`

    `<script>`
            let respuesta = prompt("¿Cuál es tu nombre?");
            console.log(respuesta); // Solo en consola

    // 👇 Esto SÍ muestra el texto en la página web
            document.getElementById("resultado").innerHTML = "Hola, " + respuesta + " 👋";`</script>`

## ¿Cuál es la diferencia?

| Método                | ¿Dónde muestra?               | ¿Recomendado?             |
| ------------------------------ | ------------------------------- | -------------------------- |
| `console.log()`              | Solo en la consola (F12)        | Para depurar código       |
| `document.write()`           | En la página web               | Solo para pruebas rápidas |
| `innerHTML`                  | En un elemento HTML específico | ✅ Sí, el más usado      |

## Tienes **3 opciones** para llamar la función automáticamente al cargar la página:


| Opción                  | ¿Cuándo se ejecuta?                    | ¿Recomendada?           |
| --------------------------------- | ---------------------------------------- | ------------------------ |
| `preguntarNombre() `            | Al llegar a esa línea del script        | ✅ Para pruebas rápidas |
| `window.onload`                 | Cuando toda la página termina de cargar | ✅ Más segura           |
| `onclick` en botón             | Cuando el usuario hace clic              | ✅ Mejor experiencia     |

## Ejercicios

1-
ENTRADA DISCOTECA

A la entrada a una discoteca, se pregunta al cliente qué edad tiene. Darle una
respuesta diferente si la edad es mayor, menor o igual a 18 años.

2 - CINCO COLORES

Se le pide al usuario que escoja un color (azul, verde, rojo, amarillo y
violeta) y darle una respuesta en relación al color elegido. Ejemplo: "el
azul es como el mar, siempre que el cielo sea azul (y sea de día)". Dar
otra respuesta en el caso que NO elija ninguno de los colores anteriores.

3- LAMPARA NO ENCIENDE

Hacer 2 preguntas prompt (si/no). Se puede anidar dos condicionales (uno dentro
de otro). Crear el código con condicionales para el algoritmo representado por
el siguiente diagrama de flujo:

![]()![1778248512268](image/LAB2/1778248512268.png)
