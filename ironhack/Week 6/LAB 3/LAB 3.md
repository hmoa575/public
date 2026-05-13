# style desde javascript

Resumen de la lección

Así como se puede seleccionar un elemento HTML desde JS con getElementById("nombreElemento"), se puede también acceder y cambiar el estilo de un elemento desde JS, mediante .style:

document.getElementById("nombreElemento").style.backgroundColor = " red"; o bien, es equivalente:

document.getElementById("nombreElemento").style = "background-color : red";

Esto permite también cambiar imágenes con style.backgroundImage(url(/nombre_imagen)), o cambiar el tipo de display (visible/invisible), ya sea con display

(o visibility

), o para que aparezca un elemento con display: block (o flex, u otro), (o visibility: visible).

Por último, es común la opción de arrancar o detener un animación de @keyframes con "paused" o "running"
