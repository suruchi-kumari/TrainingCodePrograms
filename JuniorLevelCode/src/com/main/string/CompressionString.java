package com.main.string;

public class CompressionString {
	
	public static void main(String[] args) {
		
		String str = "aaaaaaggggjfirrr";
		int n = str.length();
		for(int i=0;i<str.length();i++) {
			int count = 1;
			while(i<n-1 &&
			str.charAt(i)==str.charAt(i+1)) {
				count++;
					i++;
			}
			
			System.out.print(str.charAt(i));
			System.out.print(count);
			
		}
		
	}

}
