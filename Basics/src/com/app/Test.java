package com.app;

public class Test {

	static int a=10;
	static int b=10;
	static int c =a+b;
	
	public void m()
	{
		System.out.println("=======");
	}
	public static void main(String[] args) {

		System.out.println("Value of c "+Test.c);
		
		Test t = new Test();
		t.m();
	}

}
