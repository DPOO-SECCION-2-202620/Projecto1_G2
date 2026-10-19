package uniandes.dpoo.clubdeportivo.modelo.equipos;

import uniandes.dpoo.clubdeportivo.modelo.usuarios.Socio;

/**
 * Participacion de un socio dentro de un equipo. Se modela aparte porque la
 * posicion y el numero de camiseta son propios de esa participacion y no del
 * socio (decision de modelado de la Entrega 1).
 */
public class JugadorEquipo {

	private Socio jugador;
	private Equipo equipo;
	private String posicion;
	private int numeroCamiseta;

	public JugadorEquipo(Socio jugador, Equipo equipo, String posicion, int numeroCamiseta) {
		this.jugador = jugador;
		this.equipo = equipo;
		this.posicion = posicion;
		this.numeroCamiseta = numeroCamiseta;
	}

	/**
	 * Indica si el jugador esta suspendido y por lo tanto no puede ser alineado.
	 *
	 * REGLA RD06: si acumula dos tarjetas amarillas o recibe una roja, queda
	 * suspendido para el siguiente partido de su equipo.
	 *
	 * Para resolverlo hay que mirar las tarjetas que recibio en los partidos ya
	 * jugados por su equipo. Decide tu si lo calculas recorriendo los partidos o
	 * si llevas un contador que se actualiza al registrar cada estadistica.
	 */
	public boolean estaSuspendido() {
		// TODO escribir la regla
		return false;
	}

	public Socio getJugador() {
		return jugador;
	}

	public void setJugador(Socio jugador) {
		this.jugador = jugador;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	@Override
	public String toString() {
		return jugador + " (#" + numeroCamiseta + ", " + posicion + ")";
	}
}
