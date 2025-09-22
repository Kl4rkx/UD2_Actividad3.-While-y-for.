package ejercicio9;

public class ejer9 {
	/*
	 * Escribir un programa que imprima la suma de todos los números pares que están
	 * entre 1 y 100 e imprima cuántos hay.
	 */
	public static void main(String[] args) {

		/*
		 * Utilizando while
		 * 
		 * // Definición e inicialización de variables 
		 * int num = 2; 
		 * int suma = 0; 
		 * int cont = 0;
		 * 
		 * // Creación de programa 
		 * // Imprimiendo números pares hasta que la variable num sea menor que 100 
		 * while (num < 100) {
		 *  suma = (num + suma) + 2;
		 *  num = (num + 2);
		 *  cont++;
		 * System.out.println("La suma de todos los números pares es "+suma+" y hay "+cont); 
		 * }
		 * 
		 */
		
		// Utilizando for
		// Inicializar variables para la suma y el conteo de números pares
		int suma = 0; 
		int cont = 0; 

		// Recorrer los números entre 1 y 100
		for (int num = 2; num < 100; num += 2) { // Solo números pares
			suma += num; // Sumar el número par actual
			cont++; // Contar el número par encontrado
		}

		// Imprimir el resultado final
		System.out.println("La suma de todos los números pares entre 1 y 100 es: " + suma);
		System.out.println("La cantidad de números pares entre 1 y 100 es: " + cont);
	}
}