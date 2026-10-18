# Organización propuesta

La separación toma como referencia el Taller 3 (paquetes `modelo`, `consola` y `persistencia`, datos externos a `src`) y adapta el modelo de dominio del UML del Club Deportivo Séneca. Este documento y los `package-info.java` son una guía; no son implementaciones de las clases.

## Paquetes del modelo

| Paquete | Clases / enumeraciones del UML |
| --- | --- |
| `modelo.usuarios` | `Usuario` (abstracta), `Empleado` (abstracta), `Entrenador`, `Fisioterapeuta`, `Socio`, `Administrador` |
| `modelo.equipos` | `Deporte`, `Categoria`, `Equipo`, `JugadorEquipo`, `Partido`, `EstadisticaPartido` (abstracta), `EstadisticaFutbol`, `EstadisticaBaloncesto`, `EstadisticaVoleibol` |
| `modelo.competencias` | `Competencia` (abstracta), `CompetenciaLiga`, `CompetenciaPorFases`, `Participante`, `PartidoCompetencia`, `FilaTabla`, `TablaPosiciones`, `Fase`, `Grupo`, `TipoFase` |
| `modelo.academias` | `Disciplina`, `InscripcionDisciplina`, `Nivel`, `Instalacion`, `Reserva`, `ModalidadReserva`, `PartidoPractica`, `EstadisticaTenis`, `EstadisticaPadel`, `EstadisticaTenisDeMesa` |
| `modelo.entrenamiento` | `SesionEntrenamiento`, `Asistencia`, `EstadoAsistencia` |
| `modelo.ventas` | `Venta` (abstracta), `VentaTienda`, `VentaCafeteria`, `ItemVenta`, `ItemCafeteria`, `ArticuloTienda`, `ProductoCafeteria`, `Bebida`, `Snack`, `Mensualidad` |
| `modelo.administracion` | `Turno`, `SolicitudCambioTurno`, `EstadoSolicitud`, `Sugerencia`, `UbicacionInventario`, `Existencia` |

## Componentes fuera del modelo

- `consola`: punto de entrada y tres demostraciones — deportes/competencias; academias/reservas/entrenamientos; ventas/administración.
- `persistencia`: interfaz de persistencia, implementación JSON y una fábrica/central para obtenerla. La carga debe reconstruir relaciones con los IDs y rechazar referencias inconsistentes.
- `exceptions`: excepciones de dominio y de datos inconsistentes, con mensajes que expliquen el rechazo.
- `datos/club.json`: información persistente, fuera de la carpeta de código fuente.

## Persistencia inicial

`datos/club.json` es un único agregado para mantener coordinadas operaciones que afectan varias áreas (por ejemplo, una venta actualiza inventario y fidelidad). Cada colección es una lista de registros. Las asociaciones se guardan como IDs, no como objetos JSON anidados repetidos; fechas usan formato ISO (`YYYY-MM-DD`) y horas `HH:mm`.

Colecciones previstas: `usuarios`, `equipos`, `jugadoresEquipo`, `partidos`, `competencias`, `participantesCompetencia`, `partidosCompetencia`, `disciplinas`, `inscripcionesDisciplina`, `instalaciones`, `reservas`, `partidosPractica`, `sesionesEntrenamiento`, `asistencias`, `articulosTienda`, `productosCafeteria`, `ventas`, `turnos`, `solicitudesCambioTurno`, `sugerencias`, `ubicacionesInventario`, `existencias` y `mensualidades`.

Las subclases se distinguen con un campo `tipo` (por ejemplo, `tipo: "SOCIO"` o `tipo: "ESTADISTICA_FUTBOL"`). Los enums se guardan como sus nombres (`"INTERMEDIO"`, `"DOBLES"`). Antes de cargar los registros relacionados, se crean las entidades base y un índice por ID; después se enlazan las referencias y se validan.

## Alcance de esta base

La estructura prepara paquetes y esquema de datos, pero no crea clases de dominio vacías ni define métodos que el UML no especifica. El equipo debe acordar y documentar las firmas de operaciones y cualquier decisión necesaria para resolver ambigüedades del enunciado.
