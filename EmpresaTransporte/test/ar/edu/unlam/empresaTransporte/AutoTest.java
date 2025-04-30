package ar.edu.unlam.empresaTransporte;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AutoTest {
	
	//Abarca hasta 3 ciudades. Los destinos no se pueden repetir.
	// Puede llevar hasta 2m3 de carga y hasta 500kg.

	private Auto auto;
	
	@Before
	public void auto() {
		this.auto = new Auto();
	}
	
	@Test
	public void queAlAgregarUnPaqueteDeMenosDe2m3yPeseMenosDe500kgLoPuedaLlevar(){

		Double ancho = 1.3;
		Double alto = 0.9;
		Double profundidad = 0.8;
		Double peso = 53.0;
		String destino = "Buenos Aires";
		Paquete paquete = new Paquete(ancho, alto, profundidad, peso, destino);
		
		paquete.calcularVolumen();

		assertTrue(this.auto.agregarPaquete(paquete));
		
	}
	
	@Test
	public void quePuedaAgregarAlAutoPaquetesDeMenosDe2m3HastaLlegarALos500kg(){
		
		Double ancho1 = 1.3;
		Double alto1 = 0.9;
		Double profundidad1 = 0.8;
		Double peso1 = 100.0;
		String destino1 = "Buenos Aires";
		Paquete paquete1 = new Paquete(ancho1, alto1, profundidad1, peso1, destino1);
		
		Double ancho2 = 0.3;
		Double alto2 = 1.5;
		Double profundidad2 = 0.8;
		Double peso2 = 200.0;
		String destino2 = "Rosario";
		Paquete paquete2 = new Paquete(ancho2, alto2, profundidad2, peso2, destino2);
		
		Double ancho3 = 0.2;
		Double alto3 = 0.9;
		Double profundidad3 = 1.3;
		Double peso3 = 200.0;
		String destino3 = "Córdoba";
		Paquete paquete3 = new Paquete(ancho3, alto3, profundidad3, peso3, destino3);
		
		paquete1.calcularVolumen();
		paquete2.calcularVolumen();
		paquete3.calcularVolumen();
		
		assertTrue(this.auto.agregarPaquete(paquete1));
		assertTrue(this.auto.agregarPaquete(paquete2));
		assertTrue(this.auto.agregarPaquete(paquete3));
		
	}
	
	@Test
	public void queNoSePuedanAgregarAlAutoPaquetesLuegoDeSuperarLos500kgYLos2m3(){

		Double ancho1 = 1.3;
		Double alto1 = 0.9;
		Double profundidad1 = 0.8;
		Double peso1 = 100.0;
		String destino1 = "Buenos Aires";
		Paquete paquete1 = new Paquete(ancho1, alto1, profundidad1, peso1, destino1);
		
		Double ancho2 = 0.3;
		Double alto2 = 1.5;
		Double profundidad2 = 0.8;
		Double peso2 = 200.0;
		String destino2 = "Corrientes";
		Paquete paquete2 = new Paquete(ancho2, alto2, profundidad2, peso2, destino2);
		
		Double ancho3 = 0.2;
		Double alto3 = 0.9;
		Double profundidad3 = 1.3;
		Double peso3 = 200.0;
		String destino3 = "Rosario";
		Paquete paquete3 = new Paquete(ancho3, alto3, profundidad3, peso3, destino3);
		
		Double ancho4 = 1.3;
		Double alto4 = 0.9;
		Double profundidad4 = 1.0;
		Double peso4 = 200.0;
		String destino4 = "Córdoba";
		Paquete paquete4 = new Paquete(ancho4, alto4, profundidad4, peso4, destino4);
		
		paquete1.calcularVolumen();
		paquete2.calcularVolumen();
		paquete3.calcularVolumen();
		paquete4.calcularVolumen();
		
		assertTrue(this.auto.agregarPaquete(paquete1));
		assertTrue(this.auto.agregarPaquete(paquete2));
		assertTrue(this.auto.agregarPaquete(paquete3));
		assertFalse(this.auto.agregarPaquete(paquete4));
		
	}
	
	@Test
	public void queAlIngresarUnPaqueteConDestinoIgualAUnoYaIngresadoEsteNoSePuedeLlevar(){

		Double ancho = 1.3;
		Double alto = 0.9;
		Double profundidad = 0.8;
		Double peso = 53.0;
		String destino = "Buenos Aires";
		Paquete paquete = new Paquete(ancho, alto, profundidad, peso, destino);
		
		Double ancho2 = 0.3;
		Double alto2 = 1.5;
		Double profundidad2 = 0.8;
		Double peso2 = 200.0;
		String destino2 = "Buenos Aires";
		Paquete paquete2 = new Paquete(ancho2, alto2, profundidad2, peso2, destino2);
		
		
		paquete.calcularVolumen();
		paquete2.calcularVolumen();
		
		assertTrue(this.auto.agregarPaquete(paquete));
		assertFalse(this.auto.agregarPaquete(paquete2));
		
	}

}
