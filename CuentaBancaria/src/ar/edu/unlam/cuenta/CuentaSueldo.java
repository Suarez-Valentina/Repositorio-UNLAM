package ar.edu.unlam.cuenta;

public class CuentaSueldo extends CuentaBancaria{
	
	public CuentaSueldo() {
		this.saldo = 0.0;
	}

	public void extraer(Double monto) {
		if(monto == null || monto > this.saldo || monto < 0) {
			return;
		}
		this.saldo -= monto;
		
	}

}
