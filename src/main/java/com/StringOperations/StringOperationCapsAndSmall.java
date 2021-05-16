package com.StringOperations;

public class StringOperationCapsAndSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String opreate="VIJAYkumar";
		String stringCaps=opreate.substring(0, 5);
			System.out.println("This is the length of Caps   : "+stringCaps.length());	
		
		System.out.println("The following letters are in CAPS  :  "+stringCaps);
		
		String StringSmall=opreate.substring(5, 10);
		System.out.println("These letters are in Small  : "+StringSmall);
		System.out.println("This is length of small letters   : "+StringSmall.length());
	}

}
