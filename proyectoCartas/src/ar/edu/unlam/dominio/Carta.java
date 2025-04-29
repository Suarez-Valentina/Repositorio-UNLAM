package ar.edu.unlam.dominio;

import java.util.Objects;

public class Carta {
	
	private Integer salud;
	private Integer numero;

	public Carta(Integer numero) {
		this.numero = numero;
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

	public Integer getNumero() {
		return this.numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return Objects.equals(numero, other.numero);
	}

	
	
	
	
	
	
	
}
