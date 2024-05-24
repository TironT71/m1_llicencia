package projecte19;

import java.util.Scanner;

public class pr19 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		int x = -1;
		int y = -1;

		while (x != 0 && y != 0) {
			System.out.println("Escriu un numero: ");
			x = lector.nextInt();
			System.out.println("Escriu un altre numero: ");
			y = lector.nextInt();

			numeros(x, y);
		}

	}

	public static void numeros(int num1, int num2) {

		if (num1 == num2) {
			System.out.println("Iguals");
		} else if (num1 < num2) {
			System.out.println("El mes petit es el " + num1 + ", i el mes gran es el " + num2);
		} else {
			System.out.println("El mes gran es el " + num2 + ", i el mes petit es el " + num1);
		}

	}

}