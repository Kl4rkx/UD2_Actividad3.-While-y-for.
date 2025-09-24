package ejercicio11;

import java.util.Scanner;

/*Escribir un programa para que pida un número y muestre en pantalla el mismo número de asteriscos. (en la misma línea) 
 * La instrucción salida tiene que ir al final del programa, fuera del iterador. (Resolver con for-para y while-mientras) */

public class ejer11 {

	public static void main(String[] args) {
		// Definición de variables
		int num;
		String asteriscos = "";
		Scanner sc = new Scanner(System.in);

		// Se pide y se recoge el valor de la variable num
		System.out.print("Digite un número: ");
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			asteriscos += "*";
		}

		// Salida fuera del bucle
		System.out.println(asteriscos);
		sc.close();
	}
}