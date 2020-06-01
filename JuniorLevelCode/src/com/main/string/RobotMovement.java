package com.main.string;

public class RobotMovement {
	
	public static void main(String[] args) {
		
		String str = "UDUUDRRLLR";
		newMovedPosition(str);
	}

	private static void newMovedPosition(String str) {
		// TODO Auto-generated method stub
		int l = str.length();
		int up=0,down=0,left=0,right=0;
		
		for(int i=0;i<l;i++) {
			if(str.charAt(i)=='U') {
				up++;
			}
			if(str.charAt(i)=='D') {
				down++;
			}
			if(str.charAt(i)=='R') {
				right++;
			}
			if(str.charAt(i)=='L') {
				left++;
			}
		}
		System.out.println("("+(right-left)+","+(up-down)+")");
		
	}

}
