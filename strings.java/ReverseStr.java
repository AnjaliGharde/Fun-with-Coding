package Strings;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
//		String str = "Hello";
		String reverse = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		
		System.out.println("The original string is: " + str);
		System.out.println("The reversed string is: " + reverse);
	}

}
