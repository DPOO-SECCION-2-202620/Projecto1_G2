# Proyecto 1 — Club Deportivo Séneca

Base de organización para la implementación Java del sistema descrito en la especificación y el UML de `Entrega1/`.

## Estructura

- `src/uniandes/dpoo/clubdeportivo/`: código Java, separado en consola, modelo, persistencia y excepciones.
- `datos/club.json`: archivo inicial para persistencia. La carpeta está fuera de `src`, como pide la restricción técnica RT03.
- `docs/estructura.md`: mapa de paquetes, clases UML y esquema de los datos.
- `Entrega1/`: análisis y UML de referencia.

La entrega no requiere interfaz gráfica. Las clases de `consola` deben implementar los tres programas de demostración planteados en el documento del proyecto.

## Siguiente paso

Implementar las entidades y reglas del dominio en `modelo`, definir la carga y el guardado JSON en `persistencia`, y construir los escenarios de demostración en `consola`. El archivo JSON comienza vacío y debe conservar referencias entre entidades mediante identificadores estables.
