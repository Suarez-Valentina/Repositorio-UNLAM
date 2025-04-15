package ar.edu.unlam.cuenta;

public class CuentaSueldo {
	
	private Integer saldo;
	
	public CuentaSueldo() {
		this.saldo = 0;
	}

	public Integer getSaldo() {
		return this.saldo;
	}

	public void depositar(Integer valorADepositar) {
		if(valorADepositar == null || valorADepositar < 0) {
			return;
		}
		this.saldo += valorADepositar;
		
	}

	public void extraer(Integer valorAExtraer) {
		if(valorAExtraer == null || valorAExtraer > this.saldo || valorAExtraer < 0) {
			return;
		}
		this.saldo -= valorAExtraer;
		
	}

}
