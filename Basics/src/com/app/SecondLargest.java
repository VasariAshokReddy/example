package com.app;

import java.util.Arrays;

public class SecondLargest {

	public static int secondLar(int a[],int total)
	{
		Arrays.sort(a);
		return a[total-2];
	}

	public static void main(String[] args) {

		int a[] = {54,65,2,87,95,4};
		int a2[] = {54,65,12,78,96,4};
		System.out.println("Second Largest :"+secondLar(a,6));
		System.out.println("Second Largest :"+secondLar(a2,6));
	}

}
