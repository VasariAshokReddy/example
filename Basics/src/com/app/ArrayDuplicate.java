package com.app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicate {

	 static void duplicateArray(int array[])
	{
		
		Map<Integer,Integer> map  = new HashMap<Integer, Integer>();
		for(int arr:array)
		{
			if(map.containsKey(arr))
			{
				map.put(arr, map.get(arr)+1);
			}
			else
			{
				map.put(arr, 1);
			}
		}
		System.out.println("Input array"+Arrays.toString(array));
		System.out.println("Element count "+map);
	}
	
	public static void main(String[] args) {

		duplicateArray(new int[] {2,5,3,2,4,3,5});
		duplicateArray(new int[]{85,56,50,50,85,56});
	}

}
