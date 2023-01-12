package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<Employee>();

		System.out.printf("How many employees will be registered? ");
		int quantity = sc.nextInt();
		for (int i = 0; i < quantity; i++) {
			System.out.printf("Employee #%d\n", i + 1);
			System.out.printf("Id:");
			int id = sc.nextInt();
			int id2 = -1;
			if (list.stream().anyMatch(x -> x.getId() == id)) {
				System.out.println("Id already in use. Type another.");
				System.out.printf("Id:");
				id2 = sc.nextInt();
			}

			sc.nextLine();
			System.out.printf("Name:");
			String name = sc.nextLine();

			System.out.printf("Salary:");
			double salary = sc.nextDouble();

			list.add(new Employee(((id2 != -1) ? id2 : id), name, salary));
		}

		System.out.printf("enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null)
			System.out.println("this id does not exist");
		else {
			System.out.printf("Enter the percentage: ");
			double percentage = sc.nextDouble();

			Employee e = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			int index = list.indexOf(e);
			e.increaseSalary(percentage);

			list.set(index, e);

			System.out.println("List of Employees: ");
			for (Employee employee : list) {
				System.out.println(employee);
			}
		}

		sc.close();
	}
}
