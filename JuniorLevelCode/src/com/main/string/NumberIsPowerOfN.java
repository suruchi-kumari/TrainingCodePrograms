package com.main.string;

public class NumberIsPowerOfN {
	
	public static void main(String[] args) {
		int number = 50000;
		boolean b = isPowerOfN(number);
		System.out.println(b);
	}

	private static boolean isPowerOfN(int number) {
		// TODO Auto-generated method stub
		if(number!=0) {
			
			return (Math.ceil(Math.log(number)/Math.log(10)))==
			(Math.floor(Math.log(number)/Math.log(10)));
		}
		return false;
	}

}
