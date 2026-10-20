package modelo;

import java.util.ArrayList;

public class PartidoPractica {
    private Reserva reservaAsociada;
    private ArrayList<Socio> jugadoresConfirmados;
    private String resultadoFinal; 

    public PartidoPractica(Reserva reservaAsociada) {
        this.reservaAsociada = reservaAsociada;
        this.jugadoresConfirmados = new ArrayList<>();
        this.resultadoFinal = "Pendiente";
    }
    
    public String getResultadoFinal() {
		return resultadoFinal;
	}

	public void setResultadoFinal(String resultadoFinal) {
		this.resultadoFinal = resultadoFinal;
	}

	public Reserva getReservaAsociada() {
		return reservaAsociada;
	}

	public ArrayList<Socio> getJugadoresConfirmados() {
		return jugadoresConfirmados;
	}

	public void agregarJugador(Socio socio) {
        jugadoresConfirmados.add(socio);
    }
}
