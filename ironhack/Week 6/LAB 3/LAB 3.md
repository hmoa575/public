# style desde javascript

Resumen de la lección

Así como se puede seleccionar un elemento HTML desde JS con getElementById("nombreElemento"), se puede también acceder y cambiar el estilo de un elemento desde JS, mediante .style:

document.getElementById("nombreElemento").style.backgroundColor = " red"; o bien, es equivalente:

document.getElementById("nombreElemento").style = "background-color : red";

Esto permite también cambiar imágenes con style.backgroundImage(url(/nombre_imagen)), o cambiar el tipo de display (visible/invisible), ya sea con display

(o visibility), o para que aparezca un elemento con display: block (o flex, u otro), (o visibility: visible).

Por último, es común la opción de arrancar o detener un animación de @keyframes con "paused" o "running"

### Técnicas de la lección 

| Técnica                       | Uso en el ejercicio                   |
| ------------------------------ | ------------------------------------- |
| `.style.backgroundColor`     | Cambia el fondo de la página         |
| `.style.color`               | Cambia el color del mensaje           |
| `.style.backgroundImage`     | Cambia la imagen del `div`          |
| `.style.display = "none"`    | **Oculta** el botón            |
| `.style.display = "block"`   | **Muestra** la imagen           |
| `@keyframes` + `animation` | Animación de aparición de la imagen |

EJERCICIO

# atributo style

instructions

1- IMAGENES EDADES

Tienes un prompt donde se pregunta la edad.

* si es entre 0 y 35 años, poner un texto del tipo "eres un chaval!" y una imagen de alguien joven.
* si es entre 36 y 65 años, poner texto del tipo "pero si estás en la crema de la vida!", y una imagen de alguien de mediana edad
* si es de más de 65 años, texto del tipo "felicidades, la sabiduria viene con el tiempo", y una imagen de alguien más mayor

Puedes cambiar además del texto y la imagen, el color de fondo de la página, el color de los textos, y hacer desaparecer el botón.

2- CLASSLIST


### ¿Cómo funciona `classList`?

// AÑADIR una clase
elemento.classList.add("nombre-clase")

// QUITAR una clase
elemento.classList.remove("nombre-clase")

// ALTERNAR una clase (si la tiene la quita, si no la tiene la añade)
elemento.classList.toggle("nombre-clase")


| Acción                   | Método                               | Efecto                          |
| ------------------------- | ------------------------------------- | ------------------------------- |
| Revela el color del texto | `.classList.add("color-visible")`   | Cambia de `#3a3a3a` a naranja |
| Agranda el texto          | `.classList.add("tamanio-grande")`  | De `0.5rem` a `1.3rem`      |
| Anima la aparición       | `.classList.add("animacion")`       | Efecto de revelado              |
| Quita el fondo oculto     | `.classList.remove("fondo-oculto")` | Fondo oscuro desaparece         |
| Añade fondo revelado     | `.classList.add("fondo-revelado")`  | Fondo amarillo aparece          |
| Oculta el botón          | `.style.display = "none"`           | El botón desaparece            |

EJERCICIO

Mensaje secreto: Tienes un mensaje de texto con el mismo color que el color del div de fondo (por lo tanto es invisible).

Y un botón que dice "descubre el mensaje!".

Crea una función que al clickar sobre el botón aplique al menos dos classList sobre el texto: clase color y clase tamaño de texto, que descubran el texto.

También puedes a la vez quitar el estilo del div de fondo mediante classList.remove()

3- @keyframes Sobre una animación que ya tengas, o sobre una nueva, da la opción de "parar" y arrancar" la animación desde dos botones. Ejemplo, animación pelota o animación anuncio, o una nueva animación que crees ahora.

// ▶️ ARRANCAR la animación
elemento.style.animationPlayState = "running";

// ⏸️ PARAR la animación
elemento.style.animationPlayState = "paused";

@keyframes rebotar {
    from { top: 10px;  }  /* posición arriba  */
    to   { top: 140px; }  /* posición abajo   */
}

| Propiedad CSS                 | Valor                    | Descripción                       |
| ----------------------------- | ------------------------ | ---------------------------------- |
| `animation-duration`        | `1s`                   | Dura 1 segundo por ciclo           |
| `animation-iteration-count` | `infinite`             | Se repite para siempre             |
| `animation-direction`       | `alternate`            | Va y vuelve (rebota)               |
| `animation-timing-function` | `ease-in-out`          | Efecto de gravedad                 |
| `animation-play-state`      | `running` / `paused` | **▶️ Arranca / ⏸️ Para** |
