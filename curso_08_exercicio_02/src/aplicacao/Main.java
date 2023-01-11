package aplicacao;

import java.util.Scanner;

import entidades.Empregado;

/*
 * Realizado em 07/01/23
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Empregado empregado = new Empregado();

		System.out.printf("Nome: ");
		empregado.setName(sc.nextLine());

		System.out.printf("Salário Bruto: ");
		empregado.setSalarioBruto(sc.nextDouble());

		System.out.printf("Imposto: ");
		empregado.setImposto(sc.nextDouble());

		System.out.println("Empregado: " + empregado);

		System.out.printf("Aumentar o salario a qual porcentagem? ");
		empregado.aumentarSalario(sc.nextInt());

		System.out.println("Dados atualizados: " + empregado);

		sc.close();
	}
}
