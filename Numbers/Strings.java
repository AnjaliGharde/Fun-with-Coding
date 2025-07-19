//Write a Java program that takes a string input from the user and 
//checks whether the second character and the second last character of 
//the string are the same 
// Prompt the user to enter a string 
// Check if the string has at least 2 characters 
// Compare the second character (index 1) and the second last 
//character (index length - 2) 
// Display whether they are the same or not

package Questions;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String a = sc.nextLine();
        
         if (a.length() < 2) {
            System.out.println("The string must have at least 2 characters.");
        } else {
            char secondChar = a.charAt(1);  
            char secondLast = a.charAt(a.length() - 2);  

            if (secondChar == secondLast) {
                System.out.println("The characters are the same.");
                System.out.println("Second character: " + secondChar);
                System.out.println("Second last character: " + secondLast);
            } else {
                System.out.println("The characters are different.");
                System.out.println("Second character: " + secondChar);
                System.out.println("Second last character: " + secondLast);
            }
        }

     }
}
