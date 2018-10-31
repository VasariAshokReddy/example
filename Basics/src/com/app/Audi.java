package com.app;

public class Audi extends Car{

	public void run() {
		System.out.println("Audi is running..");
		super.run();
	}
	public static void main(String[] args) {

		Car c = new Audi();
		c.run();
	}

}
