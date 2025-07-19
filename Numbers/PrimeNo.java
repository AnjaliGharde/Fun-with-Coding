package Questions;

import java.util.Scanner;

public class PrimeNo {
	int num;
	int num1;
		public static void prime(int num) {
			 
			if(num%2!=0) {
				System.out.println("The number is prime");
			}else {
				System.out.println("the number is not prime");
			}
		}
		
		public static void evenOdd(int num1) {
			 
			if(num1%2!=0) {
				System.out.println("The number is Odd");
			}else {
				System.out.println("the number is even");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		prime(13);
//		evenOdd(34);
		System.out.println("1.prime ,2. evenodd");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the option");
		int a = sc.nextInt();
		switch(a) {
		case 1:
			prime(13);
 			break;
		case 2:
			evenOdd(34);
 			break;
 			
		}
		 
			
	}

}
