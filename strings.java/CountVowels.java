//Count the number of vowels and consonants in a string
package Strings;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "Apple";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		str=str.toLowerCase();
		char ch;
 		int vowels = 0;
		int consonants=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			ch = str.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u') {
					vowels++;
 				}else {
 					 consonants++;

 				}
			}
		}
		
		System.out.println("count of vowels: " +vowels);
		System.out.println("count of consonants : " + consonants);
	}

}
