package com.main.string;

public class NumberIsPowerOfN {
	
	public static void main(String[] args) {
		int number = 9;
		boolean b = isPowerOfN(number);
		System.out.println(b);
		boolean b11 = isPowerOfNAgain(number);
		System.out.println(b11);
	}
		

	public static boolean isPowerOfN(int number) {
		// TODO Auto-generated method stub
		int num=3;
		if(number!=0) {
			
			return (Math.ceil(Math.log(number)/Math.log(num)))==
			(Math.floor(Math.log(number)/Math.log(num)));
		}
		return false;
	}
	
	public static boolean isPowerOfNAgain(int number) {
		// TODO Auto-generated method stub
		int num=3;
		while(number>1 && number%3==0) {
			
			number/= num;
		}
		return number==1;
	}

}
