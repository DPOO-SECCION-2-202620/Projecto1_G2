package modelo;

public class Socio extends Usuario {
	private String nivel;

	public Socio(String login, String password, String nivel) {
		super(login, password);
		this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
}
