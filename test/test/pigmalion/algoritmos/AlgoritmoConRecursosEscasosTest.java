package test.pigmalion.algoritmos;

import static org.junit.Assert.*;

import org.junit.Test;

import pigmalion.algoritmos.AlgoritmoConRecursosEscasos;

public class AlgoritmoConRecursosEscasosTest {
	AlgoritmoConRecursosEscasos algoritmo= new AlgoritmoConRecursosEscasos();
	@Test
	public void elAlgoritmoDaTrueSiPuedeFormarElNumero() {		
		int[] nums= {1,4,6,7};
		
		boolean obtenido=algoritmo.puedeFormarElNumero(nums,8);
		boolean esperado=true;
		assertEquals(esperado,obtenido);
	}

}
