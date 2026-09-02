# Evento Universitario

Trabajo práctico de POO en Java (IntelliJ IDEA) que modela la gestión de eventos universitarios, sus actividades (charlas y talleres), salas, estudiantes e inscripciones.

## Estructura del proyecto

- **App.java** — clase principal, contiene el `main()` con la ejecución de prueba.
- **EventoUniversitario.java** — representa un evento, con costo estimado, sala asignada y lista de actividades.
- **Actividad.java** — clase abstracta base para las actividades de un evento.
- **Charla.java** — actividad de tipo charla (sin costo de materiales).
- **Taller.java** — actividad de tipo taller (con costo de materiales según si requiere notebook).
- **Sala.java** — representa una sala física donde se dicta un evento.
- **Estudiante.java** — representa a un estudiante inscripto.
- **Inscripcion.java** — vincula a un estudiante con una actividad, con fecha y estado.

## Cómo ejecutar

Abrir el proyecto en IntelliJ IDEA y correr `App.java`. La consola muestra los datos del evento, su costo estimado, la sala asignada y las actividades con sus respectivas inscripciones.

## Captura de una ejecución

![Ejecución del programa](Ejecucion%20del%20programa.png)

## Mapa de memoria

El archivo [`mapa_memoria.html`](mapa_memoria.html) contiene un diagrama interactivo del estado de la memoria (pila y heap) al finalizar `main()`, incluyendo las relaciones de composición y agregación entre los objetos.

Podés abrirlo directamente en el navegador descargando el repositorio, o [verlo online](../../blob/main/mapa_memoria.html) desde GitHub.
