package com.app;

import java.util.Arrays;

public class EqualityOfArrays {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6};
		int arr2[] = {1,2,3,4,5,6};
		boolean equalOrnot = Arrays.equals(arr, arr2);
		System.out.println("First array :"+Arrays.toString(arr));
		System.out.println("Second array :"+Arrays.toString(arr2));
		if(equalOrnot)
		{
			System.out.println("Two arrays are equal");
		}
		else
		{
			System.out.println("Not equal");
		}
	}

}
