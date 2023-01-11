package application;

import java.util.Scanner;

import util.CurrencyConverter;

/*
 * Realizado em 09/01/23
 */
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("What is th e doolar price?: ");
		double dollarPrice = sc.nextDouble();

		System.out.printf("How many dollar will be bought?: ");
		double dollarQuantity = sc.nextDouble();

		System.out.printf("Amout to be paid in reais = %.2f",
				CurrencyConverter.convertUSDtoBRL(dollarQuantity, dollarPrice));

		sc.close();
	}
}
