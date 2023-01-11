package application;

import java.util.Scanner;

import util.Calculator;

/*
 * Realizado em 09/01/23
 */
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o Raio: ");
		double raio = sc.nextDouble();

		double c = Calculator.circuferencia(raio);
		double v = Calculator.volume(raio);

		System.out.printf("Circuferencia: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);

		sc.close();
	}

}
