package pigmalion.algoritmos;

import java.util.HashSet;

public class AlgoritmoConRecursosInfinitos {
	 HashSet<Integer> listaNumeros = new HashSet<>();

	public boolean puedeFormarElNumero(int requiredSum) {
		for(int numero:listaNumeros) {
			int complemento=requiredSum-numero;
			if(listaNumeros.contains(complemento)) {
				return true;
			}
		}
		return false;
	}
	  public void agregarAListaNumeros(int numero) {
	        listaNumeros.add(numero);
	    }


	  /*
	     * En este caso, la solución utiliza hashset. Con un foreach, recorre los
	     * números y si tiene el complemento requerido para llegar a la suma requerida,
	     * retorna directamente true. Me parece eficiente y simple para leer y
	     * desarrollar sin necesidad de mucha lógica.
      */
}
