# Formularios Html 2 Selecciones Multiples

### Resumen de la Lección ✏️

Existen opciones más avanzadas para los formularios que permiten seleccionar entre varias opciones, ya sea:

* Un **menú desplegable** (`<select>` + `<option>`, que no usa la etiqueta input). El **name** va en el select y el **value** en cada una de las opciones.
* Mediante casillas cuadradas o redondas a seleccionar:
  * `input type="checkbox"`: puedes seleccionar más de una opción.
  * `input type="radio"`: solo seleccionas una. El **name** es el mismo para todas las opciones, mientras que el **value** cambia.
* Existe también  **list + datalist** , que te permite hacer sugerencias de autocompletar.
* Para eliminar el autocompletar de los inputs, desactivarlo con el atributo `autocomplete="off"`.

### Objetivos de aprendizaje 📓

Al final de esta lección, podrás:

1. Dominar las diferentes formas para seleccionar opciones múltiples en los formularios.
2. Diferenciar entre checkbox y radio button y saber cómo enviar el name y value correctos.

### Recursos adicionales 📋

Si desea estudiar los conceptos antes de la clase o se beneficiaría de un repaso, por favor, utilice los recursos a continuación:

1. Para modificar el aspecto de los checkboxes y radio buttons:[https://josetxu.com/aplicar-estilos-css-a-campos-radio-y-checkbox/](https://josetxu.com/aplicar-estilos-css-a-campos-radio-y-checkbox/)


# LAB | Tienda Opciones Pedido


## Instrucciones

TIENDA CON OPCIONES DE COMPRA

Crea una página de pedidos para una tienda, con diferentes opciones de compra, como por ejemplo una pizzería, que incluya menús desplegables y casillas seleccionables cuadradas y redondas:

* Desplegable: Sr/Sra./NB (+ nombre)
* Teléfono
* Desplegable tipo de pizza (al menos 6)
* Checkboxes: ingredientes extras (poner al menos 4)
* Radio button: enviar a casa / venir a buscar

Puedes añadir un comentario para el cliente (`<textarea>`).

Verificar que se envíe por GET y queden registrados los datos por pares clave-valor.

Una vez te funcione, prueba las diferentes opciones para estilizar tu formulario: colores, sombras, bordes del input, imagen de fondo de la página, etc. Busca ejemplos en la web para inspirarte.

## Submission

Comparte el enlace de tu repo de GitHub para este LAB.
