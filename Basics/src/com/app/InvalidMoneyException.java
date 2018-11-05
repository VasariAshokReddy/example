package com.app;

import java.util.Scanner;

public class InvalidMoneyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4385528342066664211L;

	public String toString()
	{
		return "You donto have sufficient money";
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int balance = 500;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the money");
		int withdraw = sc.nextInt();
		try
		{
			if(withdraw>balance)
			{
				throw new InvalidMoneyException();
			}
			else
			{
				System.out.println("Transction completed successfully");
			}
		}
		catch(InvalidMoneyException in)
		{
			System.out.println(in);
		}
	}
}
