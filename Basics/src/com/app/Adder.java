package com.app;

public class Adder {

	static int add(int a,int b)
	{
		return a+b;
	}
	
	static double add(double a,double b)
	{
		return a+b;
	}
	public static void main(String[] args) {

		System.out.println("Value is "+Adder.add(50, 50));
		System.out.println("Value is "+Adder.add(5, 5));
	}

}
