package ar.edu.unlam.cuenta;

public class CuentaAhorro {
	private Double saldo;
	private Integer contador;
	private final Byte COMISION = 6;

	public CuentaAhorro() {
		this.saldo = 0.0;
		this.contador = 0;
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

	public Double getSaldo() {
		return this.saldo;
	}

}
