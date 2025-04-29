package ar.edu.unlam.empresaTransporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaqueteTest {

	@Test
	public void queAlCrearMiPaquetePuedaCalcularSuVolumen() {
		
		Double ancho = 6.0;
		Double alto = 5.0;
		Double profundidad = 8.0;
		Double peso = 4.0;
		String destino = "Buenos Aires";
		Double volumen = ancho*alto*profundidad;
		
		Paquete paquete = new Paquete(ancho, alto, profundidad, peso, destino);
		
		paquete.calcularVolumen();

		assertEquals(volumen,paquete.getVolumen());

	}
	
	

}
