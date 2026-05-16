1-- SUMA DE NUMEROS ITERATIVA

* Mediante prompt, te piden dos números y te muestra la suma
* Te pregunta después: “¿quieres continuar (S/N)?”
* Si es que sí, vuelves a preguntar los números y sumarlos
* Si es que no, sales del bucle y te despides.

alert() → solo muestra mensaje

prompt() → pide texto

confirm() → devuelve true o false

2-- NUMEROS POSITIVOS/NEGATIVOS

En un bucle, pides números al usuario hasta que escriba un número negativo. (Damos en este caso el 0 como número positivo)

EXTRA: añadir ACUMULADOR que dé al final la suma total de todos los números introducidos EXTRA2: añadir CONTADOR que nos diga cuántas vueltas ha dado el bucle while (cantidad de números introducidos por el usuario)

**3- RELLENAR TICKET DE CINE
**Tienes una imagen de ticket de entrada para el cine, vacío, y unos inputs para rellenar: se te pide el nombre, fecha y la butaca (fila y asiento). Y al darle botón 'enviar', que se muestren en la imagen del ticket de entrada las opciones elegidas por el usuario. Esto implica maquetar el ticket mediante divs y CSS (puedes usar también una imagen de fondo para el papel).

---

---

****4**- (** **© Hassan 2026) - tarjeta de tu mascota:

Pedir datos para la tarjeta de tu mascota:
Mostrar un texto con huecos.
El usuario escribe o selecciona respuestas.
Guardas las respuestas   en   variables JS.
Generas el texto final reemplazando los huecos (guardar el texto final en variable o solo mostrar)
Muestras el resultado en pantalla.

Tarjeta de tu mascota (completando los textos con datos personales (inputs)
y más adelante podemos ver como generar la tarjeta e imprimirla.

EJERCICIO

**5- PREDICCIONES SWITCH
**Bienvenid@ a la tu pitonisa de confianza! Dime tu signo del zodiaco y te diré como irá tu semana  :-)

- Pedir al usuario su signo zodiacal mediante prompt, input o botones.
- Que ejecute una función (si es necesaria) dentro de la cual debe hallarse un switch/case: "capricornio", "leo", "geminis"...
- Y que muestre un vaticinio en pantalla (o alert, o consola)



EJERCICIO 6

// SWITCH: condicional con un listado de casos concretos
// ej: escribe estacion del año y da un resutlado en cada CASO (case)
// si no escribe una estación, dar un mensaje de error (default)
let estacion = prompt("dime una estación del año").toLowerCase();
switch (estacion) {
  case "primavera":
    alert("la primavera la sangre altera");
    break; // si no lo  pones, ejecuta también el siguiente caso
  case "verano":
    alert("en verano tomar el sol es sano");
    break;
  case "otoño":
    alert("otoño es frío en Logroño");
    break;
  case "invierno":
    alert("en invierno el frío es un infierno");
    break;
  default:
    alert("eso no es una estación!");

}
