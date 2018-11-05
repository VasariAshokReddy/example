package com.app.string;

public class Test {

	public static void main(String[] args) {

		String str = "Ashok";
		System.out.println(str);

		String str1 = new String("Naveen");
		System.out.println(str1);

		char[] ch = {'R','e','d','d','y'};
		String str2 = new String(ch);
		System.out.println(str2);

		Test t = new Test();
		Test t1 = new Test();
		Test t2 = t;

		System.out.println(t==t1);//false
		System.out.println(t2==t);//true

		String s = "naresh";
		String s1 = "naresh";
		String s2 = "Naresh";
		System.out.println(s==s1);//true
		System.out.println(s==s2);//false

		String ss = new String("sathish");
		String ss1 = new String("sathish");
		System.out.println(ss==ss1);//false

		//Conversion ofString to StringBuffer
		String s3 = "ramya";
		StringBuffer sb = new StringBuffer(s3);
		System.out.println(sb);

		//Conversion of StringBuffer to String
		StringBuffer sb1 = new StringBuffer("vijay");
		String s4 = sb1.toString();
		System.out.println(s4);

		/*//toString()
		System.out.println(t);
		System.out.println(t.toString());
*/
		String sr = "ladda";
		sr.concat("ladda");
		System.out.println(sr);//ladda

		StringBuffer sb3 = new StringBuffer("bharath");
		sb3.append(".ch");
		System.out.println(sb3);


	}

}
