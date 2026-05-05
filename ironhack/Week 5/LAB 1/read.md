# Formularios Html 1


### Resumen de la Lección ✏️

Los formularios permiten al usuario introducir datos por teclado y enviarlos. Cada formulario `<form>` contiene uno o más campos a rellenar `<input>`, y cada input contiene diferentes atributos como:

* `type`: text, number, email, etc.
* `name`: nombre de etiqueta para enviar ese valor.
* `id`: identificador para CSS, Javascript y `<label>`.
* `placeholder`: texto de ayuda dentro del input.
* `required`: indica que ese campo debe rellenarse obligatoriamente.
* Además, cada tipo puede tener atributos específicos, como `number` (max y min), mientras que para `text` sería `minlength` y `maxlength`.
* También existe `<textarea>` como campo para escribir textos más largos.

### Objetivos de aprendizaje 📓

Al final de esta lección, podrás:

1. Comprender los conceptos principales y la importancia de los formularios.
2. Crear un formulario con los tipos básicos de datos (inputs).
3. Enviar los datos por el método GET.
4. Formatear los estilos y distribución mediante CSS.

### Recursos adicionales 📋

Si desea estudiar los conceptos antes de la clase o se beneficiaría de un repaso, por favor, utilice los recursos a continuación:

1. Tipos de datos en los INPUTS:[https://www.w3schools.com/html/html_form_input_types.asp](https://www.w3schools.com/html/html_form_input_types.asp)


# LAB | Formulario De Contacto

## Instructions

Crear formulario de consulta para tu empresa con los siguientes campos:

* Nombre
* Apellido *required*
* Edad. Mínimo: 18, máximo 120 (poner esto en el placeholder)
* Email *required*
* Fecha
* Asunto *required*
* Comentario: máxima longitud 150 caracteres

Se debe enviar por GET a la página `recibido.html`, que emita un mensaje del tipo:  **“mensaje recibido!”** . Verifica que aparecen los datos en la barra de navegación.

A partir de que funcione, dale un estilo con CSS: colores, tipo de fuente, distribución, etc.
