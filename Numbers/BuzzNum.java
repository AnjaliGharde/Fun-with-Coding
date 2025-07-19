package Questions;

import java.util.Scanner;

public class BuzzNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=27;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int temp=num;
		num=num%10;
		
		if(temp%7==0 || num==7) {
			System.out.println("buzz");
		}else {
			System.out.println(" not buzz");

		}
	}

}
