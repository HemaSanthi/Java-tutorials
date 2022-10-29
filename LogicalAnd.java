package sample;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Value");
		value= sc.nextInt();
		if ((value>=10)|| (value%2==0))
		{
			System.out.println("Its true");
		}
		else
		{
			System.out.println("Its False");
		}

	}

}
