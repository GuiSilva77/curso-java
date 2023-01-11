package aplicacao;

import java.util.Scanner;

import entidade.Aluno;

/*
 * Realizado em 07/10/23
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();

		aluno.setNome(sc.nextLine());
		aluno.setN1(sc.nextInt());
		aluno.setN2(sc.nextInt());
		aluno.setN3(sc.nextInt());

		System.out.println(aluno);
		sc.close();
	}
}
