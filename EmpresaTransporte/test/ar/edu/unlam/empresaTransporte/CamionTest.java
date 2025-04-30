package ar.edu.unlam.empresaTransporte;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CamionTest {
	
	//Abarca todas las cuidades necesarias.
	//Puede llevar hasta 20 m3 de carga y máximo de 16 toneladas.
	
	private Camion camion;
	
	@Before
	public void camion() {
		this.camion = new Camion();	
		}
	
	@Test
	public void queAlAgregarUnPaqueteDeMenosDe20m3yPeseMenosDe16000kgLoPuedaLlevar(){

		Double ancho = 1.3;
		Double alto = 2.9;
		Double profundidad = 3.8;
		Double peso = 100.0;
		String destino = "Buenos Aires";
		Paquete paquete = new Paquete(ancho, alto, profundidad, peso, destino);
		
		paquete.calcularVolumen();

		assertTrue(this.camion.agregarPaquete(paquete));
		
	}
	
	@Test
	public void queNoSePuedanAgregarPaquetesLuegoDeSuperarLos16000kgOLos20m3(){

		Camion camion = new Camion();
		
		Double ancho1 = 1.3;
		Double alto1 = 1.5;
		Double profundidad1 = 1.8;
		Double peso1 = 2000.0;
		String destino1 = "Buenos Aires";
		Paquete paquete1 = new Paquete(ancho1, alto1, profundidad1, peso1, destino1);
		
		Double ancho2 = 2.9;
		Double alto2 = 1.3;
		Double profundidad2 = 2.8;
		Double peso2 = 10000.0;
		String destino2 = "Corrientes";
		Paquete paquete2 = new Paquete(ancho2, alto2, profundidad2, peso2, destino2);
		
		Double ancho3 = 1.3;
		Double alto3 = 1.5;
		Double profundidad3 = 1.8;
		Double peso3 = 2000.0;
		String destino3 = "Rosario";
		Paquete paquete3 = new Paquete(ancho3, alto3, profundidad3, peso3, destino3);
		
		Double ancho4 = 1.4;
		Double alto4 = 1.6;
		Double profundidad4 = 1.9;
		Double peso4 = 3000.0;
		String destino4 = "Córdoba";
		Paquete paquete4 = new Paquete(ancho4, alto4, profundidad4, peso4, destino4);
		
		paquete1.calcularVolumen();
		paquete2.calcularVolumen();
		paquete3.calcularVolumen();
		paquete4.calcularVolumen();
		
		assertTrue(this.camion.agregarPaquete(paquete1));
		assertTrue(this.camion.agregarPaquete(paquete2));
		assertTrue(this.camion.agregarPaquete(paquete3));
		assertFalse(this.camion.agregarPaquete(paquete4));
		
	}
}
