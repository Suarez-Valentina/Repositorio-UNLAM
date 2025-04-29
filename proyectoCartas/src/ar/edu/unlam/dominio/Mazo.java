package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.HashSet;

public class Mazo {

	private static final Integer MAXIMO_CARTAS = 5;
	private static final Integer MAXIMO_CARTAS_DUPLICADAS_PERMITIDAS = 2;
	private ArrayList<Carta> cartas;
	private HashSet<Carta> cartasSinDuplicados;
	
	public Mazo() {
		this.cartas = new ArrayList<>();
		this.cartasSinDuplicados = new HashSet<>();
	}
	
	public Boolean agregarCarta(Carta carta) {
		Integer contador = obtenerCantidadDeDuplicados(carta);
		
		if(this.cartas.size() < MAXIMO_CARTAS && contador < Mazo.MAXIMO_CARTAS_DUPLICADAS_PERMITIDAS) {
			return this.cartas.add(carta);
		}
		
		return false;
	}

	private Integer obtenerCantidadDeDuplicados(Carta carta) {
		Integer contador = 0;
		
		if(cartas.contains(carta)) {
			for(Carta cartaDeColeccion : cartas) {
				if(cartaDeColeccion.getNumero().equals(carta.getNumero())) {
					contador ++;
				}
			}
		}
		return contador;
	}

	public Boolean agregarCartaSinDuplicados(Carta carta) {
		return this.cartasSinDuplicados.add(carta);
	}

}
