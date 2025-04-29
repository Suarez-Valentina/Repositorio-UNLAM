package ar.edu.unlam.cuenta;

public class CuentaCorriente extends CuentaBancaria{

	private final Double PORCENTAJE_DE_COMISION = 0.05;
	private final Double LIMITE_DESCUBIERTO = -600.0;

	public CuentaCorriente() {
		this.saldo = 0.0;
	}
	
	public void extraer(Double monto) {
		if(monto == null || monto < 0) {
			return;
		}
		Double montoTotal = monto;
		Double montoEnDescubierto = 0.0;
		Double comision = 0.0;
		
		if(monto > this.saldo ) {
			montoEnDescubierto = monto - Math.max(this.saldo, 0);
			comision = montoEnDescubierto * PORCENTAJE_DE_COMISION; 
		}
		
		montoTotal = monto + comision;
		
		if((this.saldo - montoTotal) < LIMITE_DESCUBIERTO){
			return;
		}
		
		this.saldo -= montoTotal;
		
	}

}
