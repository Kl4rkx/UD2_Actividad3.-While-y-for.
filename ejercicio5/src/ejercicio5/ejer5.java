package ejercicio5;

public class ejer5 {
	/*
	 * Escribir un programa que imprima los números pares positivos menores o
	 * iguales que 20 en orden descendiente. (Utilizando for o while)
	 */
	public static void main(String[] args) {

		// Definición de variables
		int num = 20;

		// Creación de programa
		// Imprimiendo números pares hasta que la variable num sea mayor que 0
		while (num > 0) {
			System.out.println(num);
			num = num - 2;
		}
	}

}
