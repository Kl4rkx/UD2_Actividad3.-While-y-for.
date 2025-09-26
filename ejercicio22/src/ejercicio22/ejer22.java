package ejercicio22;

import java.util.Scanner;

/*
 * Visualizar un menú, con las opciones 1,2,3 , si el usuario introduce 4 terminar programa visualizando “ADIOS”,
 * sino visualizar un mensaje diciendo la opción que ha seleccionado el usuario.
 * Se utilizará este ejercicio para trabajar la estructura de control switch en Java.*/

public class ejer22 {

	public static void main(String[] args) {

		// Definición y asignación de variables.
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		
			do {
				System.out.println("------------------\nMENÚ DE SELECCIÓN\n------------------");
				System.out.println("1. Para seleccionar el número 1.\n2. Para seleccionar el número 2.\n3. Para seleccionar el número 3.\n4. Para salir.\n");
				menu = sc.nextInt();
				switch (menu) {
				case 1:
					System.out.println("Has seleccionado el número 1\n");
					break;
				case 2:
					System.out.println("Has seleccionado el número 2\n");
					break;
				case 3:
					System.out.println("Has seleccionado el número 3\n");
					break;
				default:
					if (menu!=4) {
						System.out.println("Introduce un número valido\n");
						break;
					}
				}
			} while (menu!=4); // Cuando la variable menu sea igual a 4 sale del bucle.
			
			System.out.println("ADIÓS");

	}

}
