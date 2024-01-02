package test.pigmalion.algoritmos;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgoritmoConRecursosInfinitosTest {
	AlgoritmoConRecursosInfinitos algoritmo= new AlgoritmoConRecursosInfinitos();
	
	@Test
	/*public void elAlgoritmoDaFalseSiNoPuedeFormarElNumero() {		
		boolean esperado=false;
		algoritmo.agregarAListaNumeros(1);
		algoritmo.agregarAListaNumeros(4);
		algoritmo.agregarAListaNumeros(8);
		algoritmo.agregarAListaNumeros(7);
		
		boolean obtenido=algoritmo.puedeFormarElNumero(230);
		assertEquals(esperado,obtenido);
	}	
	*/
	public void elAlgoritmoDaTrueSiPuedeFormarElNumero() {		
		boolean esperado=true;
		algoritmo.agregarAListaNumeros(1);
		algoritmo.agregarAListaNumeros(4);
		algoritmo.agregarAListaNumeros(8);
		algoritmo.agregarAListaNumeros(7);
		
		boolean obtenido=algoritmo.puedeFormarElNumero(12);
		assertEquals(esperado,obtenido);
	}


}
