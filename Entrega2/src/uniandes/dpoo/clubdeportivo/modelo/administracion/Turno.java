package uniandes.dpoo.clubdeportivo.modelo.administracion;

import java.time.LocalTime;

public class Turno {

	public static final String ENTRENADOR = "ENTRENADOR";
	public static final String FISIOTERAPEUTA = "FISIOTERAPEUTA";

	private String identificacionEmpleado;
	private String tipoEmpleado;
	private String diaSemana;
	private LocalTime horaInicio;
	private LocalTime horaFin;

	public Turno(String identificacionEmpleado, String tipoEmpleado, String diaSemana, LocalTime horaInicio,
			LocalTime horaFin) {
		this.identificacionEmpleado = identificacionEmpleado;
		this.tipoEmpleado = tipoEmpleado == null ? "" : tipoEmpleado.toUpperCase();
		this.diaSemana = diaSemana == null ? "" : diaSemana.toUpperCase();
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public boolean esValido() {
		return identificacionEmpleado != null && tipoEmpleado != null && diaSemana != null && horaInicio != null
				&& horaFin != null && horaInicio.isBefore(horaFin);
	}

	public boolean cubre(String dia, LocalTime hora) {
		return diaSemana.equalsIgnoreCase(dia) && (hora.equals(horaInicio) || hora.isAfter(horaInicio))
				&& hora.isBefore(horaFin);
	}

	public String getIdentificacionEmpleado() {
		return identificacionEmpleado;
	}

	public String getTipoEmpleado() {
		return tipoEmpleado;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}

	@Override
	public String toString() {
		return identificacionEmpleado + " - " + tipoEmpleado + " - " + diaSemana + " " + horaInicio + " a " + horaFin;
	}
}
