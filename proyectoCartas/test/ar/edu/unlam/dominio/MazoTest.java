package ar.edu.unlam.dominio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MazoTest {
	
	private Mazo mazo;
	
	@Before
	public void mazo() {
		this.mazo = new Mazo();
	}

	// Mazo con 5 cartas (maximo)
	//se admiten cartas duplicadas (hasta 2 iguales)
	@Test
	public void queExistanCartasCuandoAgregoUnaCartaAlMazo() {
		//Preparacion
		Carta carta = new Carta();
		
		//Ejecucion
		Boolean cartaAgegada = this.mazo.agregarCarta(carta);
		
		//Verificacion
		assertTrue(cartaAgegada);
	}

	
	@Test
	public void queNoSePuedanAgregarCartasCuandoSeSupereElMaximoPermitido() {
		//Preparacion
		Carta carta = new Carta();
		
		//Ejecucion
		Boolean cartaAgegada1 = this.mazo.agregarCarta(carta);
		Boolean cartaAgegada2 = this.mazo.agregarCarta(carta);
		Boolean cartaAgegada3 = this.mazo.agregarCarta(carta);
		Boolean cartaAgegada4 = this.mazo.agregarCarta(carta);
		Boolean cartaAgegada5 = this.mazo.agregarCarta(carta);
		Boolean cartaAgegada6 = this.mazo.agregarCarta(carta);
		
		//Verificacion
		assertTrue(cartaAgegada1);
		assertTrue(cartaAgegada2);
		assertTrue(cartaAgegada3);
		assertTrue(cartaAgegada4);
		assertTrue(cartaAgegada5);
		assertFalse(cartaAgegada6);
	}
}
