package ar.edu.unlam.empresaTransporte;

import java.util.HashSet;
import java.util.LinkedList;

public class Auto extends Transporte{
	
	//Abarca hasta 3 ciudades. Los destinos no se pueden repetir.
	//Puede llevar hasta 2m3 de carga y hasta 500kg.

	private HashSet<String> ciudades;
	private final Byte MAXIMO_DE_CIUDADES = 3;
	

	public Auto() {
		this.volumenMaximo = 2.0;
		this.pesoMaximoPermitido = 500.0;
		this.paquetes = new LinkedList<>();
		this.ciudades = new HashSet<>();
		this.sumaPesoDeLosPaquetes = 0.0;
		this.sumaVolumenDeLosPaquetes = 0.0;
	}
	
	public Boolean agregarPaquete(Paquete paquete) {
		Double volumenDelPaquete = paquete.getVolumen();
		String destinoDelPaquete = paquete.getDestino();
		Double pesoDelPaquete = paquete.getPeso();
		
		this.sumaVolumenDeLosPaquetes += volumenDelPaquete;
		this.sumaPesoDeLosPaquetes += pesoDelPaquete;
		
		Boolean ciudadYaIngresada = this.ciudades.contains(destinoDelPaquete);
		
		if(ciudadYaIngresada || this.ciudades.size() > this.MAXIMO_DE_CIUDADES) {
			return false;
		}
		
		if(sumaVolumenDeLosPaquetes >= volumenMaximo 
			&& sumaPesoDeLosPaquetes >= pesoMaximoPermitido) {
			return false;
		}
		this.ciudades.add(destinoDelPaquete);
		return this.paquetes.add(paquete);
	}

	
}
