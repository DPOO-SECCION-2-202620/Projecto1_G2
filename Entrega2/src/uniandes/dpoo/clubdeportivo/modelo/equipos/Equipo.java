package uniandes.dpoo.clubdeportivo.modelo.equipos;

import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.clubdeportivo.modelo.usuarios.Socio;

/**
 * Equipo del club. Pertenece a un unico deporte y a una unica categoria, y
 * tiene un cupo maximo de jugadores inscritos (regla RD02).
 */
public class Equipo {

	private String nombre;
	private int cupoMaximo;
	private Deporte deporte;
	private Categoria categoria;
	private List<JugadorEquipo> jugadores;

	public Equipo(String nombre, int cupoMaximo, Deporte deporte, Categoria categoria) {
		this.nombre = nombre;
		this.cupoMaximo = cupoMaximo;
		this.deporte = deporte;
		this.categoria = categoria;
		this.jugadores = new ArrayList<JugadorEquipo>();
	}

	// ----------------------------------------------------------------
	// REGLAS DEL EQUIPO - por escribir
	// ----------------------------------------------------------------

	/**
	 * Indica si todavia queda espacio en el equipo.
	 *
	 * REGLA RD02: cada equipo tiene un cupo maximo de jugadores inscritos.
	 */
	public boolean tieneCupo() {
		// TODO escribir la validacion
		return false;
	}

	/**
	 * Indica si el numero de camiseta esta libre en este equipo.
	 *
	 * REGLA RD03: el numero de camiseta es unico dentro del equipo.
	 */
	public boolean camisetaDisponible(int numeroCamiseta) {
		// TODO escribir la validacion
		return false;
	}

	/**
	 * Inscribe un socio en el equipo, si cumple todas las condiciones.
	 *
	 * Antes de aceptarlo hay que verificar, segun RD02 y RD03:
	 * 1. que el equipo tenga cupo
	 * 2. que la edad del socio corresponda a la categoria del equipo
	 * 3. que el numero de camiseta no este tomado
	 * 4. que el socio no pertenezca ya a otro equipo de este mismo deporte
	 *
	 * La condicion 4 necesita conocer los demas equipos del deporte: decide si
	 * la resuelves aqui recibiendo esa informacion, o en la clase que coordine
	 * los equipos del club.
	 *
	 * Devuelve el JugadorEquipo creado, o null si la inscripcion se rechaza.
	 * (Si prefieres lanzar una excepcion del paquete exceptions en vez de
	 * devolver null, cambia la firma: queda mejor para explicar el rechazo.)
	 */
	public JugadorEquipo inscribirJugador(Socio socio, String posicion, int numeroCamiseta) {
		// TODO escribir la regla
		return null;
	}

	/**
	 * Cuenta los jugadores que estan en condiciones de jugar el proximo partido,
	 * es decir, los que no estan suspendidos (RD04 y RD06).
	 */
	public int contarJugadoresHabilitados() {
		// TODO escribir el conteo
		return 0;
	}

	// ----------------------------------------------------------------

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<JugadorEquipo> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<JugadorEquipo> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return nombre + " (" + deporte + ", " + categoria + ")";
	}
}
