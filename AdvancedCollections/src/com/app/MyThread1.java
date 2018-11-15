package com.app;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread1 extends Thread{


	static CopyOnWriteArrayList cpl = new CopyOnWriteArrayList();

	public void run()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Child thread is updating..");
		cpl.add("ramya");
		cpl.add("sathish");
	}

	public static void main(String[] args) throws InterruptedException{

		cpl.add("ashok");
		cpl.add("naveen");
		cpl.add("naresh");
		cpl.add("vijay");

		MyThread1 t = new MyThread1();
		t.start();

		Iterator itr = cpl.iterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			System.out.println("Main thread is iterating copyonAl and current object :"+s);
			Thread.sleep(3000);
		}
		System.out.println(cpl);
	}
}
