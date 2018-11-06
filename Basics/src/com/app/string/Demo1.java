package com.app.string;

public class Demo1 {

	public static void main(String[] args) {

		String str = "ashok";
		String str1= "ashok";
		System.out.println(str==str1);//true
		System.out.println(str.equals(str1));//true

		String s = new String("reddy");
		String s1 = new String("reddy");
		System.out.println(s==s1);//false
		System.out.println(s.equals(s1));//true

		StringBuffer sb = new StringBuffer("students");
		StringBuffer sb1 = new StringBuffer("students");
		System.out.println(sb==sb1);//false
		System.out.println(sb.equals(sb1));//false

		//length
		String str2 = "ashok";
		System.out.println(str2.length());


		//chatAt() ,split() and trim()
		System.out.println(str2.charAt(1));
		//System.out.println(str2.charAt(6));
		
		String s3 = "hi ashok how are u";
		String[] s4 = s3.split("");
		for(String s5:s4)
		{
			System.out.print(s5);
		}
		
		
		String ss = " ashok ";
		System.out.println(ss.trim());
		System.out.println(ss.trim().length());
		
		

		//method chaining
		String ss1 = " ashok ";
		System.out.println(ss1.length());
		System.out.println(ss1.trim());
		System.out.println(ss1.trim().substring(2).length());
		
	}

}
