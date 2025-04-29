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
		Carta carta = new Carta(1);
		
		//Ejecucion
		Boolean cartaAgegada = this.mazo.agregarCarta(carta);
		
		//Verificacion
		assertTrue(cartaAgegada);
	}

	
	@Test
	public void queNoSePuedanAgregarCartasCuandoSeSupereElMaximoPermitido() {
		//Preparacion
		Carta carta1 = new Carta(1);
		Carta carta2 = new Carta(2);
		Carta carta3 = new Carta(3);
		Carta carta4 = new Carta(4);
		Carta carta5 = new Carta(5);
		
		//Ejecucion
		Boolean cartaAgegada1 = this.mazo.agregarCarta(carta1);
		Boolean cartaAgegada2 = this.mazo.agregarCarta(carta1);
		Boolean cartaAgegada3 = this.mazo.agregarCarta(carta2);
		Boolean cartaAgegada4 = this.mazo.agregarCarta(carta3);
		Boolean cartaAgegada5 = this.mazo.agregarCarta(carta4);
		Boolean cartaAgegada6 = this.mazo.agregarCarta(carta5);
		
		//Verificacion
		assertTrue(cartaAgegada1);
		assertTrue(cartaAgegada2);
		assertTrue(cartaAgegada3);
		assertTrue(cartaAgegada4);
		assertTrue(cartaAgegada5);
		assertFalse(cartaAgegada6);
	}
	
	@Test
	public void queNoSePuedanAgregarMasDeDosCartasRepetidas() {
		//Preparacion
		Carta carta = new Carta(1);
		Boolean valorEsperado1 = true;
		Boolean valorEsperado2 = false;
		
		//Ejecucion
		Boolean cartaAgegada1 = this.mazo.agregarCarta(carta);
		Boolean cartaAgegada2 = this.mazo.agregarCarta(carta);
		Boolean cartaAgegada3 = this.mazo.agregarCarta(carta);
	
		
		//Verificacion
		assertEquals(valorEsperado1, cartaAgegada1);
		assertEquals(valorEsperado1, cartaAgegada2);
		assertEquals(valorEsperado2, cartaAgegada3);
	}
	
	@Test
	public void queAlExistirDosCartasIgualesLaSegundaNoSeAgregueAMiMazoSinDuplicados() {
		
		Carta carta1 = new Carta(1);
		Carta carta2 = new Carta(1);
		
		Boolean cartaAgegada1 = this.mazo.agregarCartaSinDuplicados(carta1);
		Boolean cartaAgegada2 = this.mazo.agregarCartaSinDuplicados(carta2);
		
		assertTrue(cartaAgegada1);
		assertFalse(cartaAgegada2);
	}
	
	
}
