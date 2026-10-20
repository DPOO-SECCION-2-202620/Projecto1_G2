package modelo;

import java.util.ArrayList;

public class SesionEntrenamiento {
    private String fecha;
    private int horaInicio;
    private Entrenador entrenadorACargo;
    private Instalacion instalacion;
    private ArrayList<Socio> jugadoresConvocados;

    public SesionEntrenamiento(String fecha, int horaInicio, Entrenador entrenador, Instalacion instalacion) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.entrenadorACargo = entrenador;
        this.instalacion = instalacion;
        this.jugadoresConvocados = new ArrayList<>();
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

	public Entrenador getEntrenadorACargo() {
		return entrenadorACargo;
	}

	public void setEntrenadorACargo(Entrenador entrenadorACargo) {
		this.entrenadorACargo = entrenadorACargo;
	}

	public Instalacion getInstalacion() {
		return instalacion;
	}

	public void setInstalacion(Instalacion instalacion) {
		this.instalacion = instalacion;
	}

	public ArrayList<Socio> getJugadoresConvocados() {
		return jugadoresConvocados;
	}
}