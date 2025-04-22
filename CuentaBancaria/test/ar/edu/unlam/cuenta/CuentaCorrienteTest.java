package ar.edu.unlam.cuenta;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {

	@Test
	public void quePuedaTenerDineroNegativoEnCuenta() {
		//Preparacion
		CuentaCorriente cuenta = new CuentaCorriente();
		Double saldoEsperado = -210.0;
		//Ejecucion
		cuenta.depositar(100.0);
		cuenta.extraer(300.0);
		Double saldoObtenido = cuenta.getSaldo();
		//Verificacion
		assertEquals(saldoEsperado,saldoObtenido);
	}
	
	@Test
	public void quePuedaGirarEnDescubiertoYTengaDeudaConElBancoDe5Porciento() {
		//Preparacion
		CuentaCorriente cuenta = new CuentaCorriente();
		Double saldoEsperado = -105.0;
		//Ejecucion
		cuenta.depositar(100.0);
		cuenta.extraer(200.0);
		Double saldoObtenido = cuenta.getSaldo();
		//Verificacion
		assertEquals(saldoEsperado,saldoObtenido);
	}
	
	@Test
	public void queAlSobrepasarElLimiteDelDecubiertoNoSePuedaSeguirExtrallendo() {
		//Preparacion
		CuentaCorriente cuenta = new CuentaCorriente();
		Double saldoEsperado = -315.0;
		//Ejecucion
		cuenta.depositar(100.0);
		cuenta.extraer(200.0);
		cuenta.extraer(200.0);
		cuenta.extraer(300.0);
		Double saldoObtenido = cuenta.getSaldo();
		//Verificacion
		assertEquals(saldoEsperado,saldoObtenido);
	}
	
}
