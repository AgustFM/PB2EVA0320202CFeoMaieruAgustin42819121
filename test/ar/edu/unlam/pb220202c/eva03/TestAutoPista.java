package ar.edu.unlam.pb220202c.eva03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.net.Inet4Address;

public class TestAutoPista {
	
	
	public void queSePuedaRegistrarTelepase () {
		Vehiculo vehiculo = new Vehiculo(("aa075aj"),75, 0);
		Autopista autopista = new Autopista("Ruta 66");

		assertTrue(autopista.registrarTelepase())


	}

	public void queAlSalirDelAutopistaNoestaEncirculacionLanceUnaExcepcion() {
		
	}
	
	public void queVerifiqueQueSeObtengaUnaListaDeAutosInsfractoresOrdenadaPorPatente(){
		
	}

	public void generetestAEleccion1() {
		
	}
	
	public void generetestAEleccion2() {
		
	}
	
}
