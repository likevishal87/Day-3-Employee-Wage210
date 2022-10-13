package com.bridgelabz;

public class UC6 {

	public static final int PER_HOUR_SALARY = 20;
	public static final int MAX_WORKING_HOURS = 100;
	public static final int MAX_WORKING_DAYS = 20;

	public static void main(String agrs[]) {
		int totalworkingHour = 0;
		int totalworkingDays = 0;
		int emphrs = 0;

		System.out.println("Welcome to Employee Wage Computation Program on Master Branch ");
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		while (totalworkingHour < MAX_WORKING_HOURS && totalworkingDays < MAX_WORKING_DAYS) {
			totalworkingDays++;
			switch (empCheck) {
			case 1:
				emphrs = 8;
				break;
			case 2:
				emphrs = 4;
				break;
			default:
				emphrs = 0;
				break;
			}
			totalworkingHour = totalworkingHour + emphrs;
		}
		int totalwage = totalworkingHour * PER_HOUR_SALARY;
		System.out.println("Total wage for a month = " + totalwage);

	}

}
