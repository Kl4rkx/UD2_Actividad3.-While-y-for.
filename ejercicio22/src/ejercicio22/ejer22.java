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
		
		// Se verifica si el número introducido es menor que 1 o mayor que 4.
		if (menu < 1 || menu > 4) {
			do { // Si cumple la condición entra igualmente en el bucle.
				System.out.println("Introduce un número entre 1 y 3, Pulsa 4 para salir");
				menu = sc.nextInt();
				switch (menu) {
				case 1:
					System.out.println("Has seleccionado el 1");
					break;
				case 2:
					System.out.println("Has seleccionado el 2");
					break;
				case 3:
					System.out.println("Has seleccionado el 3");
					break;
				}
			} while (menu!=4); // Cuando la variable menu sea igual a 4 sale del bucle.
			
			System.out.println("ADIOS");
		}

	}

}
