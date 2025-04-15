package ar.edu.unlam.cuenta;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaSueldoTest {

	@Test
	//Primera prueba. Que la cuenta exista.
	public void queAlCrearseLaCuentaEstaExista() {
		//Preparación
		CuentaSueldo cuenta = new CuentaSueldo();
		//Verificación
		assertNotNull(cuenta);
	}
	
	@Test
	//Segunda prueba. Que al crearse la cuenta el saldo sea de 0.
	public void queAlCrearseLaCuentaSuSaldoInicialSea0() {
		//Preparación
		CuentaSueldo cuenta = new CuentaSueldo();
		Integer saldoEsperado = 0;
		//Ejecución
		Integer saldoObtenido = cuenta.getSaldo();
		//Verificación
		assertEquals(saldoEsperado,saldoObtenido);
	}
	
	@Test
	//Tercera prueba. Asegurarnos que es posible depositar dinero en mi cuenta y que por consecuente mi saldo aumente.
	public void queSePuedaDepositarDineroYMiSaldoAumente() {
		//Preparación
		CuentaSueldo cuenta = new CuentaSueldo();
		Integer saldoEsperado = 100;
		//Ejecución
		cuenta.depositar(100);
		Integer saldoObtenido = cuenta.getSaldo();
		//Verificación
		assertEquals(saldoEsperado,saldoObtenido);
	}
	
	@Test
	//Cuarta prueba. Asegurarnos que es posible extraer con dinero en mi cuenta y que por consecuente mi saldo decremente.
	public void queSePuedaExtraerConDineroEnCuentaYMiSaldoDecremente() {
		//Preparación
		CuentaSueldo cuenta = new CuentaSueldo();
		Integer saldoEsperado = 20;
		//Ejecución
		cuenta.depositar(100);
		cuenta.extraer(80);
		Integer saldoObtenido = cuenta.getSaldo();
		//Verificación
		assertEquals(saldoEsperado,saldoObtenido);
	}
	
	@Test
	//Quinta prueba. Asegurarnos que no es posible extraer sin dinero suficiente en mi cuenta.
	public void queSeNoSePuedaExtraerSinDineroSuficienteEnCuenta() {
		//Preparación
		CuentaSueldo cuenta = new CuentaSueldo();
		Integer saldoEsperado = 100;
		//Ejecución
		cuenta.depositar(100);
		cuenta.extraer(120);
		Integer saldoObtenido = cuenta.getSaldo();
		//Verificación
		assertEquals(saldoEsperado,saldoObtenido);
	}
	
	@Test
	//Sexta prueba. Asegurarnos que no es posible depositar dinero negativo.
	public void queSeNoSePuedaDepositarDineroNegativo() {
		//Preparación
		CuentaSueldo cuenta = new CuentaSueldo();
		Integer saldoEsperado = 0;
		//Ejecución
		cuenta.depositar(-10);
		Integer saldoObtenido = cuenta.getSaldo();
		//Verificación
		assertEquals(saldoEsperado,saldoObtenido);
	}
	
	@Test
	//Septima prueba. Asegurarnos que no es posible extraer dinero negativo (lo cual seria depositar).
	public void queSeNoSePuedaExtraerDineroNegativo() {
		//Preparación
		CuentaSueldo cuenta = new CuentaSueldo();
		Integer saldoEsperado = 100;
		//Ejecución
		cuenta.depositar(100);
		cuenta.extraer(-40);
		Integer saldoObtenido = cuenta.getSaldo();
		//Verificación
		assertEquals(saldoEsperado,saldoObtenido);
	}
	
	
	
	
	
	
	

}
