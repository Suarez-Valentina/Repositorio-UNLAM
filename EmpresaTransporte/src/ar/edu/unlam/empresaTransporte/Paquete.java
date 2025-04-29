package ar.edu.unlam.empresaTransporte;

public class Paquete {
	
	private Double ancho;
	private Double alto;
	private Double profundidad;
	private Double peso;
	private Double volumen;
	private String destino;

	public Paquete(Double ancho, Double alto, Double profundidad, Double peso, String destino) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundidad = profundidad;
		this.peso = peso;
		this.destino = destino;
	}

	public void calcularVolumen() {
		this.volumen = ancho*alto*profundidad;
	}

	public Double getVolumen() {
		return this.volumen;
	}

	public Double getPeso() {
		return this.peso;
	}

	public String getDestino() {
		return this.destino;
	}
	

}
