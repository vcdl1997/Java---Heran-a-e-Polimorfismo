package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		Integer quantity = scan.nextInt();
		
		for(int i = 0; i < quantity; i++) {
			
			Employee employee;
			
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.println("Outsourced (y/n)");
			Character option = scan.next().charAt(0);
			scan.nextLine();
			
			System.out.println("Name: ");
			String name = scan.nextLine();
			
			System.out.println("Hours: ");
			Integer hours = scan.nextInt();
			
			System.out.println("Value per hour: ");
			Double valuePerHour = scan.nextDouble();
			
			switch (option) {
				case 'y': case 'Y':
					System.out.println("Additional charge: ");
					Double additionalCharge = scan.nextDouble();
					employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				break;
	
				default:
					employee = new Employee(name, hours, valuePerHour); 
				break;
			}
			
			employees.add(employee);
		}
		
		System.out.println("PAYMENTS: ");
		for(Employee employee : employees) {
			System.out.println(employee.toString());
		}
		
		scan.close();
	}
}
