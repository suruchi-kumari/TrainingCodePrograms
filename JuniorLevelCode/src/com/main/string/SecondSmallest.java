package com.main.string;

import java.util.Arrays;

public class SecondSmallest {
	
	static int check2ndSmallest(int[] arr) {
		
		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) {
		
		int[] arr = {23,16,1,3,75,11,8};
		System.out.println("Second smallest in the given array is : "+check2ndSmallest(arr));
	}
}
