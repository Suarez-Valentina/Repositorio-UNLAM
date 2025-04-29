package ar.edu.unlam.empresaTransporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class BicicletaTest {
	
	//Se mueve dentro de la ciudad.
	/* Puede enviar dos paquetes de hasta 0.125 m3 y un máximo de 15 kg.
		NOTA: Si no tengo destino, el primer paquete me define el destino hacia
				dónde va la bicicleta.*/

	@Test
	public void queAlAgregarUnPaqueteDeMenosDe0125m3yPeseMenosDe15kgLaBicicletaLoPuedaLlevar(){
		
		Bicicleta bicicleta = new Bicicleta();

		Double ancho = 0.3;
		Double alto = 0.5;
		Double profundidad = 0.8;
		Double peso = 4.0;
		String destino = "Buenos Aires";
		Paquete paquete = new Paquete(ancho, alto, profundidad, peso, destino);
		
		paquete.calcularVolumen();

		assertTrue(bicicleta.agregarPaquete(paquete));
		
	}
	
	@Test
	public void queSePuedanAgregarDosPaquetesYLaSumaDePesoSeaMenorOIgualA15kgYSuVolumenMenorOIgualA0125m3(){

		Bicicleta bicicleta = new Bicicleta();
		
		Double ancho1 = 0.3;
		Double alto1 = 0.5;
		Double profundidad1 = 0.4;
		Double peso1 = 4.0;
		String destino1 = "Buenos Aires";
		Paquete paquete1 = new Paquete(ancho1, alto1, profundidad1, peso1, destino1);
		
		Double ancho2 = 0.2;
		Double alto2 = 0.4;
		Double profundidad2 = 0.6;
		Double peso2 = 5.0;
		String destino2 = "Buenos Aires";
		Paquete paquete2 = new Paquete(ancho2, alto2, profundidad2, peso2, destino2);
		
		paquete1.calcularVolumen();
		paquete2.calcularVolumen();

		assertTrue(bicicleta.agregarPaquete(paquete1));
		assertTrue(bicicleta.agregarPaquete(paquete2));
		
	}

	@Test
	public void queNoSePuedanAgregarMasDeDosPaquetesALaBicicleta(){

		Bicicleta bicicleta = new Bicicleta();
		
		Double ancho1 = 0.3;
		Double alto1 = 0.5;
		Double profundidad1 = 0.4;
		Double peso1 = 4.0;
		String destino1 = "Buenos Aires";
		Paquete paquete1 = new Paquete(ancho1, alto1, profundidad1, peso1, destino1);
		
		Double ancho2 = 0.2;
		Double alto2 = 0.4;
		Double profundidad2 = 0.6;
		Double peso2 = 5.0;
		String destino2 = "Buenos Aires";
		Paquete paquete2 = new Paquete(ancho2, alto2, profundidad2, peso2, destino2);
		
		Double ancho3 = 0.4;
		Double alto3 = 0.4;
		Double profundidad3 = 0.7;
		Double peso3 = 5.0;
		String destino3 = "Buenos Aires";
		Paquete paquete3 = new Paquete(ancho3, alto3, profundidad3, peso3, destino3);
		
		paquete1.calcularVolumen();
		paquete2.calcularVolumen();
		paquete3.calcularVolumen();

		assertTrue(bicicleta.agregarPaquete(paquete1));
		assertTrue(bicicleta.agregarPaquete(paquete2));
		assertFalse(bicicleta.agregarPaquete(paquete3));
		
	}
	
	@Test
	public void queElSegundoPaqueteNoSePuedaLlevarSiTieneUnDestinoDistintoAlPrimero(){

		Bicicleta bicicleta = new Bicicleta();
		
		Double ancho1 = 0.3;
		Double alto1 = 0.5;
		Double profundidad1 = 0.4;
		Double peso1 = 4.0;
		String destino1 = "Buenos Aires";
		Paquete paquete1 = new Paquete(ancho1, alto1, profundidad1, peso1, destino1);
		
		Double ancho2 = 0.2;
		Double alto2 = 0.4;
		Double profundidad2 = 0.6;
		Double peso2 = 5.0;
		String destino2 = "Rosario";
		Paquete paquete2 = new Paquete(ancho2, alto2, profundidad2, peso2, destino2);
		
		
		paquete1.calcularVolumen();
		paquete2.calcularVolumen();

		assertTrue(bicicleta.agregarPaquete(paquete1));
		assertFalse(bicicleta.agregarPaquete(paquete2));
		
	}
	
}
