
# Tipos de Datos en JavaScript

| Tipo          | Categoría | Ejemplo             | `typeof`        |
| ------------- | ---------- | ------------------- | ----------------- |
| `Number`    | Primitivo  | `25`, `3.14`    | `"number"`      |
| `String`    | Primitivo  | `"Hola"`          | `"string"`      |
| `Boolean`   | Primitivo  | `true`, `false` | `"boolean"`     |
| `Undefined` | Primitivo  | `let x;`          | `"undefined"`   |
| `Null`      | Primitivo  | `null`            | `"object"` ⚠️ |
| `Symbol`    | Primitivo  | `Symbol("id")`    | `"symbol"`      |
| `BigInt`    | Primitivo  | `99n`             | `"bigint"`      |
| `Object`    | Referencia | `{ }`             | `"object"`      |
| `Array`     | Referencia | `[ ]`             | `"object"` ⚠️ |
| `Function`  | Referencia | `function(){}`    | `"function"`    |




# `var` vs `let` vs `const` en JavaScript

Son  **3 formas de declarar variables** , cada una con comportamiento diferente.



// VAR - antigua
var x = 1;
var x = 2;     // ✅ No da error (peligroso)
x = 99;        // ✅ Se puede cambiar

// LET - moderna
let y = 1;
let y = 2;     // ❌ Error (seguro)
y = 99;        // ✅ Se puede cambiar

// CONST - constante
const z = 1;
const z = 2;   // ❌ Error
z = 99;        // ❌ Error


## Tabla Resumen

| Característica              | `var`   | `let`    | `const`        |
| ---------------------------- | --------- | ---------- | ---------------- |
| ¿Se puede re-declarar?      | ✅ Sí    | ❌ No      | ❌ No            |
| ¿Se puede cambiar el valor? | ✅ Sí    | ✅ Sí     | ❌ No            |
| ¿Respeta bloques `{}`?    | ❌ No     | ✅ Sí     | ✅ Sí           |
| ¿Tiene hoisting?            | ⚠️ Sí  | ❌ No      | ❌ No            |
| ¿Cuándo usarla?            | ❌ Evitar | ✅ Siempre | ✅ Valores fijos |

🔒 const  → cuando el valor NO cambia
🔄 let    → cuando el valor SÍ puede cambiar
🚫 var    → NO usar, es código antiguo y genera bugs


# Palabras Reservadas en JavaScript

Son palabras que **JS usa internamente** y que **NO puedes usar** como nombres de variables, funciones o clases.

---

## 🔴 1. Declaración de Variables

| Palabra   | Uso                        |
| --------- | -------------------------- |
| `var`   | Declara variable (antigua) |
| `let`   | Declara variable (moderna) |
| `const` | Declara constante          |

---

## 🔵 2. Condicionales

| Palabra     | Uso                        |
| ----------- | -------------------------- |
| `if`      | Si se cumple la condición |
| `else`    | Si NO se cumple            |
| `switch`  | Comparar múltiples casos  |
| `case`    | Caso dentro del switch     |
| `default` | Caso por defecto en switch |
| `break`   | Rompe un switch o bucle    |

---

## 🟢 3. Bucles / Loops

| Palabra      | Uso                                  |
| ------------ | ------------------------------------ |
| `for`      | Bucle con contador                   |
| `while`    | Bucle mientras condición sea true   |
| `do`       | Bucle do...while                     |
| `continue` | Salta a la siguiente iteración      |
| `break`    | Sale del bucle                       |
| `in`       | Itera sobre propiedades de un objeto |
| `of`       | Itera sobre valores de un iterable   |

---

## 🟡 4. Funciones

| Palabra      | Uso                              |
| ------------ | -------------------------------- |
| `function` | Declara una función             |
| `return`   | Devuelve un valor de la función |
| `async`    | Declara función asíncrona      |
| `await`    | Espera una promesa               |
| `yield`    | Pausa un generador               |

---

## 🟠 5. Clases y Objetos

| Palabra     | Uso                         |
| ----------- | --------------------------- |
| `class`   | Declara una clase           |
| `new`     | Crea una instancia de clase |
| `this`    | Referencia al objeto actual |
| `super`   | Referencia a la clase padre |
| `extends` | Hereda de otra clase        |
| `static`  | Define método estático    |
| `get`     | Define un getter            |
| `set`     | Define un setter            |

---

## 🔴 6. Manejo de Errores

| Palabra     | Uso                         |
| ----------- | --------------------------- |
| `try`     | Intenta ejecutar un bloque  |
| `catch`   | Captura el error            |
| `finally` | Se ejecuta siempre al final |
| `throw`   | Lanza un error manualmente  |

---

## 🟣 7. Módulos

| Palabra    | Uso                             |
| ---------- | ------------------------------- |
| `import` | Importa módulos o archivos     |
| `export` | Exporta funciones o variables   |
| `from`   | Especifica el origen del import |
| `as`     | Alias en imports/exports        |

---

## ⚪ 8. Valores Especiales

| Palabra       | Uso                         |
| ------------- | --------------------------- |
| `true`      | Valor booleano verdadero    |
| `false`     | Valor booleano falso        |
| `null`      | Valor nulo intencional      |
| `undefined` | Variable sin valor asignado |
| `NaN`       | Not a Number                |
| `Infinity`  | Infinito                    |

---

## ⚫ 9. Operadores en Palabras

| Palabra        | Uso                                   |
| -------------- | ------------------------------------- |
| `typeof`     | Devuelve el tipo de dato              |
| `instanceof` | Verifica si es instancia de una clase |
| `in`         | Verifica si existe una propiedad      |
| `void`       | Evalúa y devuelve `undefined`      |
| `delete`     | Elimina una propiedad de objeto       |

🔴 Variables   → var, let, const
🔵 Condicional → if, else, switch, case, default, break
🟢 Bucles      → for, while, do, continue, break, in, of
🟡 Funciones   → function, return, async, await, yield
🟠 Clases      → class, new, this, super, extends, static
🔴 Errores     → try, catch, finally, throw
🟣 Módulos     → import, export, from, as
⚪ Valores     → true, false, null, undefined, NaN
⚫ Operadores  → typeof, instanceof, delete, void, in
