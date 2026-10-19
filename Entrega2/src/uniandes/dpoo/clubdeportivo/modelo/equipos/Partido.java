package uniandes.dpoo.clubdeportivo.modelo.equipos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Partido interno entre dos equipos del club, de la misma categoria y el mismo
 * deporte (regla RD04).
 */
public class Partido {

	private LocalDate fecha;
	private String marcador;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private List<EstadisticaPartido> estadisticas;

	public Partido(LocalDate fecha, Equipo equipoLocal, Equipo equipoVisitante) {
		this.fecha = fecha;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.marcador = null;
		this.estadisticas = new ArrayList<EstadisticaPartido>();
	}

	// ----------------------------------------------------------------
	// REGLAS DEL PARTIDO - por escribir
	// ----------------------------------------------------------------

	/**
	 * Indica si el partido se puede disputar.
	 *
	 * REGLA RD04: los dos equipos deben ser del mismo deporte y de la misma
	 * categoria, y cada uno debe presentar el minimo de jugadores habilitados
	 * que exige su deporte (7 en futbol, 5 en baloncesto, 6 en voleibol).
	 * Ese minimo lo sabe el Deporte, y los habilitados los cuenta el Equipo.
	 */
	public boolean puedeJugarse() {
		// TODO escribir la regla
		return false;
	}

	/**
	 * Registra la estadistica de un jugador que participo en el partido.
	 *
	 * REGLA RD05: la estadistica tiene que corresponder al deporte del partido,
	 * y el jugador tiene que pertenecer a uno de los dos equipos.
	 */
	public void registrarEstadistica(EstadisticaPartido estadistica) {
		// TODO escribir la validacion antes de agregar
		estadisticas.add(estadistica);
	}

	// ----------------------------------------------------------------

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getMarcador() {
		return marcador;
	}

	public void setMarcador(String marcador) {
		this.marcador = marcador;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public List<EstadisticaPartido> getEstadisticas() {
		return estadisticas;
	}

	public void setEstadisticas(List<EstadisticaPartido> estadisticas) {
		this.estadisticas = estadisticas;
	}

	@Override
	public String toString() {
		return fecha + "  " + equipoLocal.getNombre() + " vs " + equipoVisitante.getNombre()
				+ (marcador == null ? "" : "  " + marcador);
	}
}
