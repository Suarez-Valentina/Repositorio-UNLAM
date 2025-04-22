package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Mazo {

	private final Integer MAXIMO_CARTAS = 5;
	private ArrayList<Carta> cartas;
	
	public Mazo() {
		this.cartas = new ArrayList();
	}
	
	public Boolean agregarCarta(Carta carta) {
		
		if(this.cartas.size() < MAXIMO_CARTAS) {
			return this.cartas.add(carta);
		}
		
		return false;
	}

}
