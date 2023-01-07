package aplicacao;

import java.util.Scanner;

import entidades.Produto;

/*
 * Realizado em 07/01/23
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.printf("Digite o nome do produto: ");
		produto.setNome(sc.nextLine());
		
		System.out.printf("Digite o preço do produto: ");
		produto.setPreco(sc.nextDouble());
		
		System.out.printf("Digite a quantidade do produto: ");
		produto.setQuantidade(sc.nextInt());
		
		System.out.println(produto.toString());

		System.out.printf("Digite a quantidade a ser adicionada: ");
		produto.adicionarProdutos(sc.nextInt());

		System.out.println(produto.toString());

		System.out.printf("Digite a quantidade a ser retirada: ");
		produto.removerProdutos(sc.nextInt());

		System.out.println(produto.toString());
	
		sc.close();
	}

}
