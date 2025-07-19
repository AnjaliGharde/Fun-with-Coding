
// Write a Java program that takes an integer input as number from the 
//user, then finds and displays the second largest digit in the number. 
// Accept a positive integer from the user. 
// Identify and display the second largest digit 
// If there is no second largest digit (e.g., all digits are the same), 
//display an appropriate message.

package Questions;

import java.util.Scanner;

public class SecondLarNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        System.out.println(num);
        
        
        int max=-1;
        int second=-1;
        
        while(num>0) {
        	int digit=num%10;
        	
        	if(digit>max) {
        		second=max;
        		max=digit;
        	}else if(digit>second && digit!=max)
        		  {
        			second=digit;
        		}
        	num=num/10;
        }
//        if (second == -1) {
//            System.out.println("No second largest digit found.");
//        } else {
//            System.out.println("Second largest digit: " + second);
//        }
    }
}
