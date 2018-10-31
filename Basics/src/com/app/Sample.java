package com.app;

public class Sample {

	static int  i=10;
	
	public void m()
	{
		System.out.println("method");
	}
	public static void main(String[] args) {

		System.out.println("Static value "+Sample.i);
		Sample s= new Sample();
		s.m();
	}

}
