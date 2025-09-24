package ejercicio19;

import java.util.Random;
import java.util.Scanner;

/*
Decirle al usuario que diga cuál es el número. Pedir números hasta que acierte, pero hay que darle pistas, diciendo si el número introducido es mayor o menor
que el que tiene que acertar. Visualizar el número de veces que ha necesitado para adivinar el número.
Se utilizará este ejercicio para analizar el concepto de ámbito de una variable. 
*/

public class ejer19 {

    public static void main(String[] args) {
        
        // Definición  y asignación de variables
        Random random = new Random();
        int x = random.nextInt(99) + 1; // Genera un número aleatorio entre 1 y 99
        int intentos = 0; 
        int numeroUsuario = 0; 

        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina el número entre 1 y 99:");

        // Bucle hasta que x sea igual que numeroUsuario
        do {
            System.out.print("Introduce un número: ");
            numeroUsuario = sc.nextInt();
            intentos++; // Se suma 1 por cada ejecución del bucle

            // Se verifica si la variable introducida es menor o mayor que x
            if (numeroUsuario < x) {
                System.out.println("El número es mayor.");
            } else if (numeroUsuario > x) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Correcto! Has acertado."); // Si la variable no cumple ninguna de las condiciones significa que es igual
            }
        } while (numeroUsuario != x); // Sigue en el bucle si no acierta

        System.out.println("Has necesitado " + intentos + " intentos.");

        // Cierre del scanner
        sc.close();
    }
}