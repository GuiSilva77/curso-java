package application;

import entities.Triangulo;

/*
 * Realizado em 07/01/23
 */
public class Main {

	public static void main(String[] args) {
		Triangulo tr1 = new Triangulo();
		Triangulo tr2 = new Triangulo();

		System.out.printf("A área do triângulo 1 é: %f\n", tr1.getArea());
		System.out.printf("A área do triângulo 2 é: %f\n", tr2.getArea());
		
		System.out.println("A àrea maior é do triângulo " + ((tr1.getArea() > tr2.getArea())? "1" : "2"));
	}

}
