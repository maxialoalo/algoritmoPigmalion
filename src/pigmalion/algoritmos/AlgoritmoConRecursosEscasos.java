package pigmalion.algoritmos;

import java.util.Arrays;

public class AlgoritmoConRecursosEscasos {
	public boolean puedeFormarElNumero(int[] nums,int requiredSum) {
		Arrays.sort(nums);
		int izquierda=0;
		int derecha= nums.length-1;
		
		while(izquierda<derecha) {
			int sumaActual=nums[izquierda]+nums[derecha];
			if(sumaActual==requiredSum) {
				return true;
			}else if(sumaActual<requiredSum) {
				izquierda+=1;
			}else {
				derecha-=1;
			}
		}
		return false;
	}
	
	 /*
     * Verifica si es posible formar la suma requerida usando dos elementos
     *  del array. Este algoritmo asume que los recursos son limitados, 
     * por lo que se enfoca en minimizar el tiempo de ejecución.
     * 
     */
	
}
