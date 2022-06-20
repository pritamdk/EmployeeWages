package com.employeewages;

import java.util.Random;

public class EmployeeWages {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();
		int attendance = random.nextInt(3); // generate random number 0,1,2

		int wagePerHour = 20;
		int fullDayHour = 8;
		int partTimeHours = 4;
		int wagePerDay = 0;
		int monthlySalary = 0;

		switch (attendance) {
		case 0:
			System.out.println("Employee Absent ..");
			break;
		case 1:
			wagePerDay = partTimeHours * wagePerHour;
			break;
		default:
			wagePerDay = fullDayHour * wagePerHour;
		for (int day = 1; day <= 20; day++) 
		{
			int attendance1 = random.nextInt(3); // generate random number 0,1,2
			System.out.println("randomNumber" + attendance1);
			wagePerDay = 0;

			switch (attendance1) {
			case 0:
				System.out.println("Employee Absent ..");
				break;
			case 1:
				System.out.println("part time present");
				wagePerDay = partTimeHours * wagePerHour;
				break;
			default:
				System.out.println("Full day present");
				wagePerDay = fullDayHour * wagePerHour;
				break;
			}
			monthlySalary = monthlySalary + wagePerDay;
			System.out.println("Day " + day + "  : " + "Monthly Salary " + monthlySalary);
		}

		System.out.println("Employee wage per Day: " + wagePerDay);
	}
}
}