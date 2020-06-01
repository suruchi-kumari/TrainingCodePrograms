package com.main.string;

public class LastRepeatedCharacter {
	
	public static void main(String[] args) {
		
		String str = "last repeated characterbi";
		int i = str.length()-1;
		while(i>0) {
			if(str.substring(0,i).contains(str.charAt(i) + "")) {
				break;
			}
			
			i--;
		}
		
		if(i==0) {
			System.out.println("None repeating");
		}
		else {
			System.out.println(str.charAt(i));
		}
		
	}

}
