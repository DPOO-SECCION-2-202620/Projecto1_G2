package uniandes.dpoo.clubdeportivo.modelo.academias;

import java.util.ArrayList;

import uniandes.dpoo.clubdeportivo.modelo.usuarios.Socio;

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

	public boolean agregarJugador(Socio nuevoJugador) {
        int LIMITE_JUGADORES = 4; 
        
        if (this.jugadoresConfirmados.size() < LIMITE_JUGADORES) {
            this.jugadoresConfirmados.add(nuevoJugador);
            System.out.println("Jugador " + nuevoJugador.getLogin() + " inscrito exitosamente.");
            return true; 
        } else {
            System.out.println("Error: El partido ya está lleno (Máximo " + LIMITE_JUGADORES + " jugadores).");
            return false; 
        }
    }
	
    public void finalizarPartido(String resultado, Socio ganador, Socio perdedor) {
        this.setResultadoFinal(resultado);
        
        System.out.println("--- PARTIDO FINALIZADO ---");
        System.out.println("Resultado oficial: " + resultado);
        System.out.println("Ganador: " + ganador.getLogin());

        System.out.println("Pendiente: Actualizar ranking del ganador (" + ganador.getLogin() + ") y del perdedor.");
    }
}
