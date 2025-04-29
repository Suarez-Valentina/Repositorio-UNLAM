package ar.edu.unlam.dominio;

import static org.junit.Assert.*;

import org.junit.Test;

public class CartaTest {
	
	//Debe haber 1 test por cada camino de codigo productivo
	
	//Preparación: información necesaria para ejecutar la prueba
	
	//Ejecución: ejecutar el metodo a probar
	
	//Verificación: verificar que el escenario final sea el requerido
	
	/* -----------------------------------------------------------------*/
	
	//Lineamientos:
	
	/* 1-Escribir un metodo, ejecutarlo y tiene que fallar
	 * 2-Agregar la menor cantidad de codigo necesario para que la prueba pase
	 * 3-Revisión de código: refactorización, se revisa que parte del código se puede mejorar
	 */
	@Test
	public void queAlCrearseLaCartaExista() {
		//Preparación y ejecución
		Carta carta = new Carta(1);
		//Verificación
		assertNotNull(carta);
	}
	
	@Test
	public void queAlCrearseUnaCartaSuSaludInicialEs100() {
		//Preparación 
		Integer saludEsperada =100;
		Carta carta = new Carta(1);
		//Ejecución
		Integer saludObtenida = carta.getSalud();				
		//Verificación
		assertEquals(saludEsperada,saludObtenida);
	}

	@Test
	public void queAlExistirUnaCartaCon100DeSaludYReciboDanioDe20MiSaludSea80() {
		//Preparación 
		Integer saludEsperada = 0;
		Carta carta = new Carta(1);
		//Ejecución
		carta.recibeDanio(100);
		Integer saludObtenida = carta.getSalud();
		//Verificación
		assertEquals(saludEsperada,saludObtenida);			
	}
	
	@Test
	public void queAlExistirDosCartasIgualesSePuedaComprobarQueLoSon() {
		
		Carta carta1 = new Carta(1);
		Carta carta2 = new Carta(1);
		
		Boolean sonIguales = carta1.equals(carta2);
		
		assertTrue(sonIguales);
	}
	
	@Test
	public void queAlExistirDosCartasIgualesSePuedaComprobarQueTienenElmismoHashCode() {
		
		Carta carta1 = new Carta(1);
		Carta carta2 = new Carta(1);
		
		assertEquals(carta1.hashCode(), carta2.hashCode());
	}


}
