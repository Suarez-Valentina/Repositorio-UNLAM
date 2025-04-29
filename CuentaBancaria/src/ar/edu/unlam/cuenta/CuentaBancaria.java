package ar.edu.unlam.cuenta;

public abstract class CuentaBancaria {
	protected Double saldo;
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(Double monto) {
		if(monto == null || monto < 0) {
			return;
		}
		this.saldo += monto;
		
	}
	public abstract void extraer(Double monto);
}
