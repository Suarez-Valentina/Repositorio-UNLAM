package ar.edu.unlam.dominio;

public class Carta {
	
	private Integer salud;
	private Integer numero;

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

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
