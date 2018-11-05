package com.app.string;

public class Reverse {

	public static void main(String[] args) {

		String str = "ashok";
		String rev = new StringBuffer(str).reverse().toString();
		System.out.println("String after reverse "+rev);
		
		
		StringBuffer sb = new StringBuffer("ramya");
		sb.reverse();System.out.println(sb);
		
		String s ="reddy";
		for(int i =s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
