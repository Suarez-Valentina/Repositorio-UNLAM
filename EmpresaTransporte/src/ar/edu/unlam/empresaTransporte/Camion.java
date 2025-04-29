package ar.edu.unlam.empresaTransporte;

import java.util.LinkedList;

public class Camion extends Transporte{
	
	//Abarca todas las cuidades necesarias.
	//Puede llevar hasta 20 m3 de carga y máximo de 16 toneladas.

	public Camion() {
			this.volumenMaximo = 20.0;
			this.pesoMaximoPermitido = 16000.0;
			this.paquetes = new LinkedList<>();
			this.sumaPesoDeLosPaquetes = 0.0;
			this.sumaVolumenDeLosPaquetes = 0.0;
	}

	public Boolean agregarPaquete(Paquete paquete) {
		Double volumenDelPaquete = paquete.getVolumen();
		Double pesoDelPaquete = paquete.getPeso();
		
		this.sumaVolumenDeLosPaquetes += volumenDelPaquete;
		this.sumaPesoDeLosPaquetes += pesoDelPaquete;
		
		if(sumaVolumenDeLosPaquetes > volumenMaximo 
				|| sumaPesoDeLosPaquetes > pesoMaximoPermitido) {
			return false;
		}
		return this.paquetes.add(paquete);
	}

}
