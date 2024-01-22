package pigmalion.algoritmos;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgoritmoConRecursosInfinitos {
	 protected ArrayList<Integer> listaNumeros = new ArrayList<>();
	 protected Scanner teclado=new Scanner(System.in);
	 public boolean puedeFormarElNumero(int requiredSum) {
		    for (int i = 0; i < listaNumeros.size(); i++) {
		        int num1 = listaNumeros.get(i);
		        for (int j = i + 1; j < listaNumeros.size(); j++) {  // Se debe incrementar j en lugar de i
		            int num2 = listaNumeros.get(j);
		            if (num1 + num2 == requiredSum) {
		                return true;
		            }
		        }
		    }
		    return false;
		}

	  public void agregarAListaNumeros(int numero) {
	        listaNumeros.add(numero);
	    }



	  /*
     * Aunque este código tiene un tiempo de ejecución 
     * cuadrático debido al bucle anidado(O n al cuadrado), es simple y fácil de entender.
     * la simplicidad y claridad del código pueden ser más valiosas que 
     * la eficiencia, ya que facilita el mantenimiento y la comprensión 
     * del código.
     * 
     * Se podría crear un metodo para cargar un arraylist de N numeros 
     * 
     * 
     */
}
