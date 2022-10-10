package com.BridgeLabz.Day9PracticeProblem;

import java.util.Random;
public class EmployeeUC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random  = new Random();
		int randomNUm = random.nextInt(2);
		
		if(randomNUm==1)
		{
			System.out.println("Employee is Present");
		}
		else
		{
		System.out.println("Employee is Absent");
		}
	}

}
