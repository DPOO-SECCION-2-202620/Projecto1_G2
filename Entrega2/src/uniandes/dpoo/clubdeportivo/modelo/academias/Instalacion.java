package uniandes.dpoo.clubdeportivo.modelo.academias;
import java.util.ArrayList;

public class Instalacion {
    private String nombreCancha; 
    private String deporte; 
    private boolean disponible;
    private ArrayList<Reserva> reservas;

    public Instalacion(String nombreCancha, String deporte) {
        this.nombreCancha = nombreCancha;
        this.deporte = deporte;
        this.disponible = true;
        this.reservas = new ArrayList<>();
    }

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getNombreCancha() {
		return nombreCancha;
	}

	public String getDeporte() {
		return deporte;
	}
	
	public boolean verificarDisponibilidad(String fecha, int horaInicio) {
        for (Reserva reservaExistente : this.reservas) {
            if (reservaExistente.getFecha().equals(fecha) && reservaExistente.getHoraInicio() == horaInicio) {
                return false; 
            }
        }
        return true; 
    }

    public void agregarReserva(Reserva nuevaReserva) {
        this.reservas.add(nuevaReserva);
    }
}
