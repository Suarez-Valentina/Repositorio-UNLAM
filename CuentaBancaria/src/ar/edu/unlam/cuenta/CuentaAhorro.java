package ar.edu.unlam.cuenta;

public class CuentaAhorro extends CuentaBancaria{

	private Integer contador;
	private final Byte COMISION = 6;

	public CuentaAhorro() {
		this.saldo = 0.0;
		this.contador = 0;
	}

	public void extraer(Double monto) {
		if(monto == null || monto > this.saldo || monto < 0) {
			return;
		}
		Double montoMasComision = monto;
		
		if(contador >= 5) {
			montoMasComision = monto + COMISION;
			if(montoMasComision > this.saldo) {
				return;
			}
			this.saldo -= COMISION;
		}
		
		this.saldo -= monto;
		contador++;
	}

}
