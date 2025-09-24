package ejercicio17;

import java.util.Scanner;

// Pedir 10 números y visualizar en pantalla el mayor y el menor.

public class ejer17 {

	public static void main(String[] args) {
		
		// Definición y asignación de variables
		int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10 = 0;
		Scanner sc = new Scanner(System.in);

		// Se pide y se recoge el valor de la variable num
		System.out.print("Digite 10 números: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();
		num6 = sc.nextInt();
		num7 = sc.nextInt();
		num8 = sc.nextInt();
		num9 = sc.nextInt();
		num10 = sc.nextInt();
		
		// Se anida la función math.max para comparar los 10 numeros
		System.out.println(Math.max(num10, Math.max(num9, Math.max(num8, Math.max(num7, Math.max(num6, Math.max(num5, Math.max(num4, Math.max(num3, Math.max(num1, num2))))))))));

			

	}

}
