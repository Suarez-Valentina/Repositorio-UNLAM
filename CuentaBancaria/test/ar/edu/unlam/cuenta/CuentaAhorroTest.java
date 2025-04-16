package ar.edu.unlam.cuenta;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaAhorroTest {

	@Test
	//Primera prueba. Asegurarnos que luego de la quinta extracción se cobre comición de $6.
	public void queLuegoDeLa5ExtracciónSeCobreComisionDe6pesos() {
		//Preparación 
		CuentaAhorro cuenta = new CuentaAhorro();
		Double saldoEsperado = 394.0;
		
		//Ejecucion
		cuenta.depositar(1000.0);
		cuenta.extraer(100.0);
		cuenta.extraer(50.0);
		cuenta.extraer(200.0);
		cuenta.extraer(150.0);
		cuenta.extraer(70.0);
		cuenta.extraer(30.0);
		
		Double saldoObtenido = cuenta.getSaldo();
		//Verificación
		assertEquals(saldoEsperado,saldoObtenido);
	}
	
	@Test
	//Segunda prueba. Asegurarnos que luego de la quinta extracción si no se puede cobrar la comisión, no se puede extraer.
	public void queLuegoDeLa5ExtracciónSiNoSePuedeCobrarComisionNoSePuedeExtraerMas() {
		//Preparación 
		CuentaAhorro cuenta = new CuentaAhorro();
		Double saldoEsperado = 30.0;
		
		//Ejecucion
		cuenta.depositar(600.0);
		cuenta.extraer(100.0);
		cuenta.extraer(50.0);
		cuenta.extraer(200.0);
		cuenta.extraer(150.0);
		cuenta.extraer(70.0);
		cuenta.extraer(30.0);
		
		Double saldoObtenido = cuenta.getSaldo();
		//Verificación
		assertEquals(saldoEsperado,saldoObtenido);
	}
	
	

}
