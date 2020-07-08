package com.main.string;
public class LCM {
    public static void main(String[] args) {

        int n1 = 12, n2 = 5;
        int lcm = calculateLCM(n1,n2);    
        System.out.printf("The LCM of "+n1 +" and "+n2+ " is "+ lcm);
    }

	public static int calculateLCM(int n1, int n2) {
		int gcd =1;
		for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        int lcm = (n1 * n2) / gcd;
		return lcm;
	}

	
}