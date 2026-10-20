package uniandes.dpoo.clubdeportivo.modelo.academias;

import uniandes.dpoo.clubdeportivo.modelo.usuarios.Socio;

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
	
    public boolean esReservaValida() {
    	
        String deporte = instalacionReservada.getDeporte();
        
        if (deporte.equalsIgnoreCase("Padel") || deporte.equalsIgnoreCase("Pádel")) {
            if (cantidadJugadores == 4) {
                return true;
            } else {
                System.out.println("Error: Las reservas de Pádel deben ser de exactamente 4 jugadores.");
                return false;
            }
        } 
        else if (deporte.equalsIgnoreCase("Tenis") || deporte.equalsIgnoreCase("Tenis de Mesa")) {
            if (cantidadJugadores == 2 || cantidadJugadores == 4) {
                return true;
            } else {
                System.out.println("Error: Las reservas de " + deporte + " deben ser de 2 o 4 jugadores.");
                return false;
            }
        }
        
        System.out.println("Error: Instalación no disponible o deporte desconocido.");
        return false;
    }
}