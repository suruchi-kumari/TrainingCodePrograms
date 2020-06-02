package com.main.string;

class SmallestSubArraySum 
{ 
	// Returns length of smallest subarray with sum greater than x. 
	// If there is no subarray with given sum, then returns n+1 
	static int smallestSubWithSum(int arr[], int n, int x) 
	{ 
		// Initialize current sum and minimum length 
		int curr_sum = 0, min_len = n + 1; 

		// Initialize starting and ending indexes 
		int start = 0, end = 0; 
		while (end < n) 
		{ 
			// Keep adding array elements while current sum 
			// is smaller than x 
			while (curr_sum <= x && end < n) 
				curr_sum += arr[end++]; 

			// If current sum becomes greater than x. 
			while (curr_sum > x && start < n) 
			{ 
				// Update minimum length if needed 
				if (end - start < min_len) 
					min_len = end - start; 

				// remove starting elements 
				curr_sum -= arr[start++]; 
			} 
		} 
		return min_len; 
	} 

	public static void main(String[] args) 
	{ 
		int arr1[] = {1, 4, 45, 6, 10, 19}; 
		int x = 51; 
		int n1 = arr1.length; 
		int res1 = smallestSubWithSum(arr1, n1, x); 
		if (res1 == n1+1) 
		System.out.println("Not Possible"); 
		else
		System.out.println(res1); 
	} 
} 

