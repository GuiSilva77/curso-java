package application;

import java.util.Scanner;

import entities.Rent;

/*
 * Realizado em 10/01/23
 */
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rent[] rooms = new Rent[10];

		System.out.printf("How many rooms will be rented? ");
		int qt = sc.nextInt();

		for (int i = 0; i < qt; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d\n", i + 1);
			System.out.printf("Name: ");
			String name = sc.nextLine();

			System.out.printf("Email: ");
			String email = sc.nextLine();

			System.out.printf("Room: ");
			int room = sc.nextInt();

			if (rooms[room] != null) {
				System.out.println("This room is busy! Select another: ");
				room = sc.nextInt();
			}

			rooms[room] = new Rent(name, email, room);
		}

		System.out.println("Busy rooms: ");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null)
				System.out.println(rooms[i]);
		}
		sc.close();
	}
}
