package test.pigmalion.algoritmos;

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
     * Al no usar una estructura de datos adicional como hashset, en este caso me
     * parece más eficiente. Se ordenan los números de menor a mayor y van
     * recorriendo posiciones dos variables, una de izquierda y la otra al final del
     * array buscando llegar a la suma requerida. Poder armar una variable o
     * directamente pasarlo como un parámetro sin necesidad de crear variable también
     * economiza los recursos. Me parece mejor y más entendible la solución del
     * hashset, pero en términos de eficiencia creo que esta es un poco mejor.
     */
	
}
