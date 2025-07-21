package Strings;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the string: ");
				String str = sc.nextLine();
		
//		String str = "Madam";
		str=str.toLowerCase();
		String reverse = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		
		if(str.equals(reverse)) {
			System.out.println("The string is pallindrome");
 		}else {
			System.out.println("The string is not pallindrome");

 		}
	}

}
