package com.BridgeLabz.Day9PracticeProblem;

import java.util.Random;
public class EmployeeUC2 {
	
	//Calculate Daily Employee Wage

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random  = new Random();
		int WagePerHour = 20;
		int fullDayHour = 8;
		int Salary = 0;
		int randomNUm = random.nextInt(2);
		
		if(randomNUm==1) 
		{
			System.out.println("Employee is Present");
			Salary = WagePerHour * fullDayHour;
		}
		else 
		{
		System.out.println("Employee is Absent");
		}
		System.out.println("Salary is: "+Salary);

	}

}
