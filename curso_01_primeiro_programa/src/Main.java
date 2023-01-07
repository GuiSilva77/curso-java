import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Número");
		float f1 = sc.nextFloat();

		System.out.println("Digite outro Número");
		float f2 = sc.nextFloat();

		float media = (f1 + f2) / 2;

		System.out.printf("A média é %.2f", media);

		sc.close();
	}
}