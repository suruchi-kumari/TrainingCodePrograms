package com.main.string;

import java.util.HashSet;

public class FirstRepeatedCharacter {
	
	public static void main(String[] args) {
		
		String s ="Rrepeated character check";
		char ch = checkFirstRepeatedCharacter(s);
		System.out.println(ch);
	}

	private static char checkFirstRepeatedCharacter(String s) {
		// TODO Auto-generated method stub
		char[] ch = s.toCharArray();
		HashSet<Character> chSet = new HashSet<>();
		
		for(int i =0;i<ch.length-1;i++) {
			
			char c= ch[i];
			if(chSet.contains(c)) {
				return c;
			}
			else {
				chSet.add(c);
			}
		}
		
		return '\0';
		
	}

}
