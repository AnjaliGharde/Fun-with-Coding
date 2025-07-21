package Strings;

import java.util.Arrays;

public class AnagramStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	String str1 = "Listen";
	        String str2 = "Silent";

 	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

 	        if (str1.length() != str2.length()) {
	            System.out.println("The strings are not anagrams");
	            return;
	        }

 	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();

 	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

 	        if (Arrays.equals(arr1, arr2)) {
	            System.out.println("The strings are anagrams");
	        } else {
	            System.out.println("The strings are not anagrams");
	        }
	    
		
	}

}
