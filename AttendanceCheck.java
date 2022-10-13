package com.bridgelabz;

public class AttendanceCheck {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		double empcheck = Math.floor(Math.random() * 10.0) % 2.0;
		if (empcheck == (double) IS_FULL_TIME) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent ");
		}
	}

}
