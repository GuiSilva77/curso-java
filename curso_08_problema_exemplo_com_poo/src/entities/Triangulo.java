package entities;

import java.util.Scanner;

public class Triangulo {
	private double a, b, c;
	
	public Triangulo() {
		super();
		
		Scanner	sc = new Scanner(System.in);
		
		System.out.println("Insira os lados do Triângulo");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
	}
	
	public double getArea() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}	
}
