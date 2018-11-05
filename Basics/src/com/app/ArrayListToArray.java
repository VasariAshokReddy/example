package com.app;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("ashok");
		al.add("reddy");
		
		String str[] = new String[al.size()];
		al.toArray(str);
		for(String st:str)
		{
			System.out.println(st);
		}
	}

}
