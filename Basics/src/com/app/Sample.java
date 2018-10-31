package com.app;

public class Sample {

	static int  i=10;
	
	static String name = "ashok";
	public void m()
	{
		System.out.println("method");
	}
	public static void main(String[] args) {

		System.out.println("Static value "+Sample.i);
		System.out.println("String name "+Sample.name);
		Sample s= new Sample();
		s.m();
	}

}
