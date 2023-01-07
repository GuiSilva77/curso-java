package curso_08_problema_exemplo_sem_poo;

import java.util.Scanner;

/*
 * Realizado em 07/01/23
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float t1[] = {0,0,0};
		float t2[] = {0,0,0};
		
		System.out.printf("Digite o tamanho do lados do triângulo 1\n");
		for (int i = 0; i < t1.length; i++) {
			t1[i] = sc.nextFloat();
		}
		
		System.out.printf("Digite o tamanho do lados do triângulo 2\n");
		for (int i = 0; i < t2.length; i++) {
			t2[i] = sc.nextFloat();
		}
		
		float p1 = (t1[0] + t1[1] + t1[2]) / 2;
		double area1 = Math.sqrt(p1 * (p1 - t1[0]) * (p1 - t1[1]) * (p1 - t1[2]));
		
		float p2 = (t2[0] + t2[1] + t2[2])/2;
		double area2 = Math.sqrt(p2 * (p2 - t2[0]) * (p2 - t2[1]) * (p2 - t2[2]));
		
		System.out.printf("Area do Triângulo 1: %f\n", area1);
		System.out.printf("Area do Triângulo 2: %f\n", area2);
		
		System.out.println("A área maior é: " + ((area1 > area2)? "Triângulo 1" : "Triângulo 2"));
		
		sc.close();
	}

}
