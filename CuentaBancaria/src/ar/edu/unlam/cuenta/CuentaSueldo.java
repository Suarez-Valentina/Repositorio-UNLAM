package ar.edu.unlam.cuenta;

public class CuentaSueldo {
	
	private Double saldo;
	
	public CuentaSueldo() {
		this.saldo = 0.0;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public void depositar(Double monto) {
		if(monto == null || monto < 0) {
			return;
		}
		this.saldo += monto;
		
	}

	public void extraer(Double monto) {
		if(monto == null || monto > this.saldo || monto < 0) {
			return;
		}
		this.saldo -= monto;
		
	}

}
