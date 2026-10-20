package uniandes.dpoo.clubdeportivo.modelo.usuarios;

import java.util.ArrayList;

import uniandes.dpoo.clubdeportivo.modelo.academias.Reserva;

/**
 * ====================================================================
 * CLASE PROVISIONAL - PERTENECE A LA PARTE 2 (usuarios)
 * Se creo solo para poder compilar las clases de equipos mientras llega
 * la version definitiva. Cuando la parte 2 entregue Usuario y Socio,
 * BORRAR este archivo.
 * ====================================================================
 */
public class Socio extends Usuario{

	private String identificacion;
	private String login;
	private String password;
	private String nombre;
	private int edad;
	private ArrayList<Reserva> misReservas;


	public Socio(String identificacion, String login, String password, String nombre, int edad) {
        super(login, password);
        this.identificacion = identificacion;
        this.login = login;
        this.password = password;
        this.nombre = nombre;
        this.edad = edad;
        this.misReservas = new ArrayList<>();
    }

	public String getIdentificacion() {
		return identificacion;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	public void agregarReservaSocio(Reserva nuevaReserva) {
        this.misReservas.add(nuevaReserva);
    }
}
