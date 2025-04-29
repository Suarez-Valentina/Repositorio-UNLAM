package ar.edu.unlam.empresaTransporte;

import java.util.LinkedList;

public abstract class Transporte {
	protected Double volumenMaximo;
	protected Double pesoMaximoPermitido;
	protected LinkedList<Paquete> paquetes;
	protected Double sumaPesoDeLosPaquetes;
	protected Double sumaVolumenDeLosPaquetes;
	
	public abstract Boolean agregarPaquete(Paquete paquete); 
}
