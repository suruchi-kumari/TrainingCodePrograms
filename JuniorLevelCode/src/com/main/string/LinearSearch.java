package com.main.string;

public class LinearSearch {
	
	public static int search(int arr[], int elementToSearch) {
		
		int len = arr.length;
		for(int i=0;i<len-1;i++) {
			if(arr[i]==elementToSearch) {
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[]= {12,45,3,0,7,-2};
		int n = 0;
		int index = search(arr, n);
		if(index==-1) {
			System.out.println("Element not present in given array");
		}
		else {
			System.out.println("Element found at position "+(index));
		}
		
		
	}
}
