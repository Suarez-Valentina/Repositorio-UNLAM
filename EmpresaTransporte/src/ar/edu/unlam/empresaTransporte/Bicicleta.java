package ar.edu.unlam.empresaTransporte;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Bicicleta extends Transporte{
	
	//Se mueve dentro de la ciudad.
	/* Puede enviar dos paquetes de hasta 0.125 m3 y un máximo de 15 kg.
		NOTA: Si no tengo destino, el primer paquete me define el destino hacia
			dónde va la bicicleta.*/
	private final Integer CANTIDAD_MAXIMA_DE_PAQUETES = 2;
	private List<String> ciudades;

	
	public Bicicleta() {
		this.volumenMaximo = 0.125;
		this.pesoMaximoPermitido = 15.0;
		this.paquetes = new LinkedList<>();
		this.ciudades = new ArrayList<>();
		this.sumaPesoDeLosPaquetes = 0.0;
		this.sumaVolumenDeLosPaquetes = 0.0;
	}

	@Override
	public Boolean agregarPaquete(Paquete paquete) {
		Double volumenDelPaquete = paquete.getVolumen();
		String destinoDelPaquete = paquete.getDestino();
		Double pesoDelPaquete = paquete.getPeso();
		
		this.sumaVolumenDeLosPaquetes += volumenDelPaquete;
		this.sumaPesoDeLosPaquetes += pesoDelPaquete;

		if(this.ciudades.isEmpty()){
			this.ciudades.add(destinoDelPaquete);
		}else {
			if(!this.ciudades.get(0).equals(destinoDelPaquete)) {
				return false;
			}
		}
		
		if(sumaVolumenDeLosPaquetes > volumenMaximo
				|| sumaPesoDeLosPaquetes > pesoMaximoPermitido
				|| this.paquetes.size() > CANTIDAD_MAXIMA_DE_PAQUETES) {
			return false;
		}
		return this.paquetes.add(paquete);
	}
}
