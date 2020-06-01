package com.main.string;

import java.util.Arrays;

public class ConcatArrays {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3};
		int[] arr2= {6,8,9};
		int len = arr1.length+arr2.length;
		int[] mergedArr = new int[len];
		
		int index = 0;
		for(int n: arr1) {
			mergedArr[index] = n;
			index++;
		}
		
		for(int n: arr2) {
			mergedArr[index] = n;
			index++;
		}
		
		System.out.println(Arrays.toString(mergedArr));
		
	}

}
