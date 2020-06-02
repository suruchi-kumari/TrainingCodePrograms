package com.main.string;
/**
 * Algorithm of the program deals with the carry as well
 * when the carry comes into picture for large numbers the
 * code individually operates on them and pass the remainder
 * of the carry to be added at next location
 * 
 * Important to note that the carry is worked in reverse order
 * 
 */
class Factorial {
	
	
	    static void factorial(int n) 
	    { 
	    	//using pre defined int array with max possible size hard-coded
	    	//this is for holding the final values as per the number system
	        int arrResults[] = new int[500]; 
	  
	        // Initialize the 1st element and size as 1 currently
	        arrResults[0] = 1; 
	        int size = 1; 
	  
	        // Apply simple factorial formula, which works for small numbers  
	        // n! = 1 * 2 * 3 * 4...*n 
	        for (int index = 2; index <= n; index++) 
	            size = multiply(index, arrResults, size); 
	  
	        System.out.println("Factorial of given number is "); 
	        for (int i = size - 1; i >= 0; i--) 
	            System.out.print(arrResults[i]); 
	    } 
	      
	    /*** This function multiplies index with the number 
	    represented by arrResults[]. size is size of arrResults[] or  
	    number of digits in the number represented by arrResults[]. 
	    This function uses simple mathematics for  
	    multiplication. This function may value of res_size 
	     and returns the new value of res_size
	     */
	    static int multiply(int index, int arrResults[], int res_size) 
	    { 
	        int carry = 0; // Initialize carry 
	  
	        // One by one multiply n with individual  
	        // digits of arrResults[] 
	        for (int i = 0; i < res_size; i++) 
	        { 
	            int prod = arrResults[i] * index + carry; 
	            arrResults[i] = prod % 10; // Store last digit of 'prod' in res[] 
	            carry = prod/10; // Put rest in carry 
	        } 
	  
	        // Put carry in res and increase result size 
	        while (carry!=0) 
	        { 
	            arrResults[res_size] = carry % 10; 
	            carry = carry / 10; 
	            res_size++; 
	        } 
	        return res_size; 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        factorial(15); 
	    } 
	}