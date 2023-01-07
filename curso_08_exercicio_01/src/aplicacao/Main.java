package aplicacao;

import java.util.Scanner;

import entidades.Retangulo;

/*
 * Realizado em 07/01/23
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();

		System.out.println("Digite a largura e altura do retângulo:");
		retangulo.setLargura(sc.nextDouble());
		retangulo.setAltura(sc.nextDouble());

		System.out.println(retangulo);
		sc.close();
	}

}
