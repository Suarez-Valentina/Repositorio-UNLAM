package ar.edu.unlam.dominio;

public class Carta {
	
	private Integer salud;

	public Carta() {
		this.salud = 100;
	}
	
	public Integer getSalud() {
		return this.salud;
	}

	public void recibeDanio(Integer danioRecibido) {
		if(danioRecibido == null || danioRecibido < 0) {
			return;
		}
		this.salud-= danioRecibido;
		if(salud < 0) {
			this.salud = 0;
		}
			}

}
