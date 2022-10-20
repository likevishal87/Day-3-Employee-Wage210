package com.bridgelabz;

import java.util.Random;

public class ComputeEmployeeWage {
	 int random;
	    int Wage_per_Hour;
	    int Hour;
	    double totalEmployeeWage;
	    double EmployeeWage;
	    private int totalDay=20;
	    private  String Name;
	    ComputeEmployeeWage(String name,int Wage){
	        Wage_per_Hour=Wage;
	        Name=name;
	    }
	    public int randomNumber(){
	        Random r = new Random();
	        random = r.nextInt(3);
	        return random;
	    }
	    public  void calculate(){
	        for ( int day = 1; day <=totalDay; day++){
	            random=randomNumber();
	            switch (random){
	                case 1:
	                    Hour=8;
	                    break;
	                case 2:
	                    Hour=4;
	                    break;
	                default:
	                    Hour=0;
	            }
	            EmployeeWage=Wage_per_Hour*Hour;
	            totalEmployeeWage=totalEmployeeWage+EmployeeWage;
	            System.out.println("Employee wage per day is : " + day +" -> "+EmployeeWage);
	        }
	        System.out.println("................................");
	        System.out.println(" The "+ Name+"  Employee  total Wage  one Month is "+ totalEmployeeWage);
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	        ComputeEmployeeWage month =new ComputeEmployeeWage("computer",20);
	        month.calculate();
	}

}
