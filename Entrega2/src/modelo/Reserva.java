package modelo;

public class Reserva {
    private String fecha;
    private int horaInicio; 
    private int duracionHoras; 
    private int cantidadJugadores;
    private Instalacion instalacionReservada;
    private Socio socioResponsable;

    public Reserva(String fecha, int horaInicio, int duracionHoras, int cantidadJugadores, Instalacion instalacion, Socio socio) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.duracionHoras = duracionHoras;
        this.cantidadJugadores = cantidadJugadores;
        this.instalacionReservada = instalacion;
        this.socioResponsable = socio;
    }

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getDuracionHoras() {
		return duracionHoras;
	}

	public void setDuracionHoras(int duracionHoras) {
		this.duracionHoras = duracionHoras;
	}

	public int getCantidadJugadores() {
		return cantidadJugadores;
	}

	public void setCantidadJugadores(int cantidadJugadores) {
		this.cantidadJugadores = cantidadJugadores;
	}

	public Instalacion getInstalacionReservada() {
		return instalacionReservada;
	}
	
	public Socio getSocioResponsable() {
		return socioResponsable;
	}
}