package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quantidade;
		do {
			System.out.printf("Quantos números você vai digitar?");
			quantidade = sc.nextInt();
		} while (quantidade > 10 || quantidade < 0);

		int[] valores = new int[quantidade];

		for (int i = 0; i < valores.length; i++) {
			System.out.printf("Digite um número: ");
			valores[i] = sc.nextInt();
		}

		System.out.println("Números negativos");
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] < 0)
				System.out.println(valores[i]);
		}
		sc.close();
	}
}