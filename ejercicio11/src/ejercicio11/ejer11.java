package ejercicio11;
import java.util.Scanner;
/*
 * Escribir un programa para que pida un número y muestre en pantalla el mismo
 * número de asteriscos. (en la misma línea) La instrucción salida tiene que ir
 * al final del programa, fuera del iterador. (Resolver con for-para y
 * while-mientras)
 */
public class ejer11 {

	public static void main(String[] args) {
		
		// Definición y asignación de variables
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite un número: ");
		num = sc.nextInt();
		
		for (int i = 0; i <= num; i++) { // Solo números pares
			System.out.print("*");

		}
		sc.close();
		
	}

}
