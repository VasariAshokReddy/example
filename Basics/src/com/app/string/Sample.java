package com.app.string;

public class Sample {

	Sample(String str){}
	public static void main(String[] args) {

		Sample s = new Sample("ashok");
		Sample s1 = new Sample("ashok");
		System.out.println(s.equals(s1));//false
		
		String str = "reddy";
		String str1 = "reddy";
		System.out.println(str==str1);//true
		System.out.println(str.equals(str1));//true
		
		String str2 = new String("ashok");
		String str3 = new String("ashok");
		System.out.println(str2.equals(str3));//true
		System.out.println(str2==str3);//false
		
		StringBuffer sb = new StringBuffer("ashok");
		StringBuffer sb1 = new StringBuffer("ashok");
		System.out.println(sb==sb1);//false
		System.out.println(sb.equals(sb1));//false
	}

}
