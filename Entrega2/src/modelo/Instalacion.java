package modelo;

public class Instalacion {
    private String nombreCancha; 
    private String deporte; 
    private boolean disponible; 

    public Instalacion(String nombreCancha, String deporte) {
        this.nombreCancha = nombreCancha;
        this.deporte = deporte;
        this.disponible = true; 
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
}
